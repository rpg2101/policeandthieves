
package grafica;

import java.awt.Rectangle;
import java.util.Iterator;
import java.util.concurrent.Semaphore;



public class Monitor extends Actor {
    
     static Monitor moni= null;
    
    static int idCabeza=0;
     static int idCola=0;       // declaracion de variables para implementar la E.M
    
    static public Monitor getMonitor (){
     if (moni==null)
         moni=new Monitor();
        return moni;
     
     }
    synchronized void soltar()      //metodo para soltar el proceso q estaba en el monitor y notificar al siguiente
    {
    idCola++;
    notify();
    
    }
     
      synchronized void esperar()           // metodo para garantizar la E.M. al monitor.
        { 
         int miId=idCabeza ++;
    
         while(miId!=idCola)  
          
         try{
        wait();         
        }
          catch(Exception e){
        }
        
       }
    
     
     boolean tomarCuadrante(Cuadrante cuadrante, JugadorL gr) {     // metodo llamadado cuando el jugador intersecta con cuadrante... ( llamada desde cuadrante)
            
        esperar();
        
        System.out.println("Viendo de tomar el cuadrante");
                          
        if (cuadrante.getCola().isEmpty())          //primero pregunta por  si la cola dle cuadrante esta vacia ( soy le primero)
        {                                  
            System.out.println("Soy el primero");
            cuadrante.getCola().add(gr);            // me encolo para tomar ese recurso
            cuadrante.setTomado(1);                   // seteo la variable tomado ( recurso tomado)
        soltar();
            return true;

        }
        if (cuadrante.getCola().iterator().next().equals(gr)==true) //metodo q pregunta si soy el primero encolado ( me muevo en el recurso)
        {                                 
            System.out.println("Toy primero");
             soltar();
            return true;
        }

        Iterator<JugadorL> it=cuadrante.getCola().iterator();
        int encolado = 0;
        while (it.hasNext())            //metodo q indica si estoy en la cola ya encolado (distinto del primer lugar)
            if (it.next().equals(gr)==true)
            {
                encolado = 1;
                break;
            }
     //........................................................................................

        Iterator<JugadorL> iteradorVerificacion=cuadrante.getCola().iterator();
        while (iteradorVerificacion.hasNext())
        {
            JugadorL jug = iteradorVerificacion.next();
            if (jug.r.intersects(cuadrante.r) ==false)      // pregunta en la cola si siguen pidienso el recurso  ( si el auto no esta sobre el cuadrante)
            {
            
                {
                    cuadrante.getCola().remove(jug);
                    cuadrante.setTomado(0);
                    System.out.println("Solto");
                }
             
                break;
            }
        }
        
        if (cuadrante.cruce.maximoColas()==true)
        {soltar();
            return false;
        }
            if (encolado == 0) 
        {
            cuadrante.getCola().add(gr);
            System.out.println("Me encole");
             soltar();
            return true;
        }
        
        soltar();
        return false;
    }

    private  Monitor(){};
   
    @Override
    public Boolean colisionoCon(Grafico gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean colisionoCon(MH gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean colisionoCon(MV gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean colisionoCon(Policia gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean colisionoCon(BOrigen gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean colisionoCon(BDestino gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     @Override
    public Boolean colisionoCon(JugadorL gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
