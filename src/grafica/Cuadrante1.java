

package grafica;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;


public class Cuadrante1 extends Cuadrante{
 
  int nrocuadrante=1;
    
    JugadorL cuad1=null;
 
    
    public Cuadrante1(int x, int y, List<Grafico> todos) {
        this.x = x;
        this.y = y;
        this.w = 25;
        this.h = 25;
        this.r.setLocation(x,y);
        this.r.setSize(25,25);
        todos.add(this);
        Cola = new ArrayList<JugadorL>();
    }

    @Override
    public Boolean colisionoCon(Grafico gr) {
       // throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(MH gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(MV gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(JugadorL gr) {
       
        // el jugador toca al cadrante y pregunta si al monitor si puede tomar el recurso... si puede lo toma sale del monitor, avanza
        // cuando llega a otro cuadrante pregunta por el recurso si lo tiee lo toma y devuelve el anterior, sino, se queda esperando el recurso en la cola..
        
        System.out.println("Colision de cuadrante1 con Jugador");

        Rectangle rectChico=new Rectangle();

        if (cuad1!=null)
        {
            rectChico.x = this.x;
            rectChico.y = this.y;
            rectChico.width = this.w / 2;
            rectChico.height = this.h /2;

             if(cuad1.r.intersects(rectChico)==false)
                   cuad1=null;
        }
        if (Monitor.getMonitor().tomarCuadrante(this,gr)==false)
        {
            System.out.println("ya esta tomado");
            gr.volverPosicion();
        }
        else
            System.out.println("Ya lo tome");
       
    
        
        return true;
    }

    @Override
    public Boolean colisionoCon(Policia gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(BOrigen gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(BDestino gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

}
