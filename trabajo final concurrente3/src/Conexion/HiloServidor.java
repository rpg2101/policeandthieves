
package Conexion;
import com.sun.jmx.remote.internal.ClientCommunicatorAdmin;
import grafica.Actor;
import grafica.JugadorL;
import java.io.*;
import java.net.Socket;


public class HiloServidor extends Thread {
    private Socket sock=null;
    private int Numjugador =0;
    public HiloServidor (Socket S,int Jugador){
        sock = S;
        Numjugador = Jugador;               //crea el hilo servidor, lo pone a correr desde el main.
    }
    public void run(){
        BufferedReader in;
        String inputLine;
        JugadorL jugador;
        
       // while(Servidor.getSocket().isConnected()==false){}
        while(sock.isConnected())
        {                                               //cuando el socket esta conectado ( simil al cliente)
            try{
                in = new BufferedReader( new InputStreamReader( sock.getInputStream()));
                inputLine = in.readLine() ;
                System.out.println(inputLine);

                PrintWriter out1 = new PrintWriter(Servidor.getSocket1().getOutputStream(), true);  // metodo para imprimir salidas, crea uno lo llama out y muestra las salidas de los socket 1  2
                PrintWriter out2 = new PrintWriter(Servidor.getSocket2().getOutputStream(), true); 

                jugador = Servidor.jugador1;
                
                if (jugador.cargaInformo != jugador.getCarga())
                {
                    //System.out.println("CARGAS");
                    jugador.cargaInformo = jugador.getCarga();
                    out1.printf("cargaPaq#%d#%d",Numjugador,jugador.getCarga());
                    out2.printf("cargaPaq#%d#%d",Numjugador,jugador.getCarga());
                    out1.println("");
                    out2.println("");
                }                                                       //actualizo los datos de cargas y descargas  en carga y descarga informo, tanto par ael j1 y el j2
                
                if (jugador.descargasInformo != jugador.getDescargas())
                {
                   // System.out.println("DESCARGAS");
                    jugador.descargasInformo = jugador.getDescargas();
                    out1.printf("descarga#%d#%d",Numjugador,jugador.getCarga());
                    out2.printf("descarga#%d#%d",Numjugador,jugador.getCarga());
                    out1.println("");
                    out2.println("");
                }
                
                jugador = Servidor.jugador2;
                if (jugador.cargaInformo != jugador.getCarga())
                {
                    //System.out.println("CARGAS");
                    jugador.cargaInformo = jugador.getCarga();
                    out1.printf("cargaPaq#%d#%d",Numjugador,jugador.getCarga());
                    out2.printf("cargaPaq#%d#%d",Numjugador,jugador.getCarga());
                    out1.println("");
                    out2.println("");
                }
                
                if (jugador.descargasInformo != jugador.getDescargas())
                {
                   // System.out.println("DESCARGAS");
                    jugador.descargasInformo = jugador.getDescargas();
                    out1.printf("descarga#%d#%d",Numjugador,jugador.getCarga());
                    out2.printf("descarga#%d#%d",Numjugador,jugador.getCarga());
                    out1.println("");
                    out2.println("");
                }
                
                 if (Numjugador == 1)
                     jugador = Servidor.jugador1;
                 else
                     jugador = Servidor.jugador2;
            
                if(jugador.cargando !=0)        //pregunta para saber si esta en el timer de carga. (si es =1 implica q se esta cargando...)
                    return;

                if(jugador.descargando !=0)     //pregunta para saber si esta en el timer de descarga
                    return;
                
                if (inputLine.contains("arriba"))   // realiza las acciones adecuada segun lo q contenga la linea de entrada...
                {
                    
                    jugador.setPosicionAnterior();
                    jugador.setY(jugador.getY()-5);
                    jugador.funColision();
                   
                }
                if (inputLine.contains("abajo"))
                {
                    jugador.setPosicionAnterior();
                    jugador.setY(jugador.getY()+5);
                    jugador.funColision();
                
                }
                
                if (inputLine.contains("izquierda"))
                {
                    jugador.setPosicionAnterior();
                    jugador.setX(jugador.getX()-5);
                    jugador.funColision();
                                    
                }
                if (inputLine.contains("derecha"))
                {
                    
                    jugador.setPosicionAnterior();
                    jugador.setX(jugador.getX()+5);
                    jugador.funColision();
                                    
                }
                
                if (jugador.xInformo != jugador.getX() || jugador.yInformo != jugador.getY())
                {
                    jugador.xInformo = jugador.getX();
                    jugador.yInformo = jugador.getY();
                    out1.printf("mover#%d#%d#%d",Numjugador,jugador.getX(),jugador.getY());     // metodo q toma e imprime los cambios de x e y en el movimiento de los jugadores.
                    out2.printf("mover#%d#%d#%d",Numjugador,jugador.getX(),jugador.getY());
                    out1.println("");
                    out2.println("");
                }
                if (jugador.vidaInformo != jugador.getVida())
                {
                    jugador.vidaInformo = jugador.getVida();
                    out1.printf("vida#%d#%d",Numjugador,jugador.getVida());
                    out2.printf("vida#%d#%d",Numjugador,jugador.getVida());
                    out1.println("");
                    out2.println("");
                }
                
               /*
                if (jugador.getVida()<=0)
                {
                    out1.print("Murio");
                    out2.print("Murio");
                    out1.print("J");
                    out2.print("J");
                    out1.println(Integer.toString(Numjugador));
                    out2.println(Integer.toString(Numjugador));
                    
                }
                */
                
            }
            catch (Exception ex)
            {
                System.out.println("Error22222");
                System.out.println(ex.toString());
                break;
            }
        }
    }

}
