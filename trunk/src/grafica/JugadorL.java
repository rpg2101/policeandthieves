package grafica;



import Conexion.Cliente;
import Conexion.Servidor;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class JugadorL extends Actor implements KeyListener{
    
    public int xInformo=0;
    public int yInformo=0;
    public int vidaInformo=0;
    public int cargaInformo=0;
    public int descargasInformo=0;
    public int cargando=0;
    public int descargando=0;

    static Map<Integer, String>  teclas= new HashMap<Integer, String>(); // Asignacion de strings a enteros

    public static Map<Integer, String> getTeclas()
    {
        return teclas;
    }
    public int getCarga() {
        return this.carga;
    }
    
    public int getDescargas() {
        return this.descargas;
    }

    public void setCarga(int x) {
        this.carga =x;
    }

    public void setColor(Color color) {
        this.fondoColor = color;
    }
    
    public void setDescargas(int x) {
        this.descargas =x;
    }
    public void setTecla(Integer[] m){                            /* un HashMap, es una colección de objetos, (como los Arrays), pero estos no tienen orden.
                                                                    Cada objeto se identifica mediante algun indentificador apropiado, por ejemplo un "uuid".*/
        teclas.put(m[0], "arriba");
        teclas.put(m[1], "abajo");
        teclas.put(m[2], "izquierda");
        teclas.put(m[3], "derecha");
     }

    public Boolean colisionoCon(Grafico gr){
        //System.out.println(this.toString());      
        return gr.colisionoCon(this);
    }

    @Override
    public Boolean colisionoCon(MH gr) {
       return true;
    }

    @Override
    public Boolean colisionoCon(MV gr) {
       setX(100);
       return true;
    }

    @Override
    public Boolean colisionoCon(JugadorL gr) {
        //System.out.println("choque conmigo");
       //this.setPosicionAnterior();
       //gr.setPosicionAnterior();
       return true;
    }
                                                    // el evento q llama a key lsitener tiene 3 metodos..

    public void keyTyped(KeyEvent e) {                      //Recoge cada pulsación de teclado y la almacena en una variable
     
    }

    public void keyPressed(KeyEvent e) {                    //toma
       
        String st = this.teclas.get(e.getKeyCode());
        try {
            getClass().getMethod(st, (Class[]) null).invoke(this, (Object[]) null);
        } catch (Exception ex) {
        ex.printStackTrace();
        }
    }

    public void keyReleased(KeyEvent e) {
       // System.out.println("TECLAS "+e.getKeyCode());
    }

    public void arriba(){           //metodos del movimiento del jugador..
       
        {
            try{
            PrintWriter out = new PrintWriter(
                    
                      Cliente.getCliente().getOutputStream(), true);
                      out.println("ARRIBA");
                          setPosicionAnterior();
                       // setY(getY() - 5);
                          funColision();
                          this.rotulo.repaint();
            }
            catch(Exception ex){
                
                System.out.println("Aprete Arriba MAL");
            }
            
            
        }
    }
    public void abajo(){
        //if (!Servidor.isServidor())
        {
            try{
            PrintWriter out = new PrintWriter(
                    
                      Cliente.getCliente().getOutputStream(), true);
                     
                      out.println("ABAJO");
                         setPosicionAnterior();
                        // setY(getY() + 5);
                         funColision();
                         this.rotulo.repaint();
                      

            }
            catch(Exception ex){
                
                System.out.println("Aprete Arriba MAL");
            }
        }
    }
   
    public void derecha(){
        //if (Cliente.isClient())
        {
            try{
            PrintWriter out = new PrintWriter(
                    
                      Cliente.getCliente().getOutputStream(), true);
                     
                      out.println("DERECHA");
                      setPosicionAnterior();
                      //setX(getX() + 5);
                        funColision();
                       this.rotulo.repaint();

            }
            catch(Exception ex){
                
                System.out.println("Aprete Derecha MAL");
            }
        }
        
    }
    public void izquierda(){
        //if (Cliente.isClient())
        {
            try{
                    PrintWriter out = new PrintWriter(Cliente.getCliente().getOutputStream(), true);//comunicacion con el hilo socket unico del cliente
                      
                    out.println("IZQUIERDA");
                    setPosicionAnterior();
                      //setX(getX() - 5);
                      funColision();
                      this.rotulo.repaint();

                      
            }
            catch(Exception ex){
                
                System.out.println("Aprete Izquierda MAL");
            }
        }
    }

      public void mover(int x, int y)
    {
       setPosicionAnterior(getX(),getY());
        setX(x);
        //funColision();
        setY(y);
        //funColision();
        this.rotulo.repaint();
    }

    @Override
    public void pintarse(Graphics2D gr) {
        try{
            gr.setColor(fondoColor);
            gr.fillRect(x1, y1,  w, h);
        }catch(Exception ex){}
        //gr.setColor(Color.BLUE);
        gr.setColor(this.fondoColor);
        gr.fillRect(x, y,  w, h);
        x1=x;y1=y;
    }

    @Override
    public Boolean colisionoCon(Policia gr) {
        System.out.print("Colision con policia");
      //  if (Servidor.isServidor())
        System.out.print(" ");
            funColision();
            gr.volverPosicion();
            gr.invertirVelY();
            gr.invertirVelX();
            this.vida--;
            this.carga=0;
            System.out.println(" ");
            System.out.println("USTED TIENE VIDAS =  "+ vida.toString());

            this.checkVida();
             if (vida==0){

            System.out.println(" ");

            System.out.println(" JUEGO TERMINADO");

             }
        
        
        return true;
    }

    public Boolean colisionoCon(BDestino gr) {
     
        return true;
    }
   
    public Boolean colisionoCon(BOrigen gr) {
       
            return true;
        
    }
}
