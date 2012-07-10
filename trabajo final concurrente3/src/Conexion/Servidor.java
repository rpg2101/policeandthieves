
package Conexion;

import grafica.*;
import java.net.*;


public class Servidor {
    static private ServerSocket sock=null;
    static Socket S=null;   //singleton
    static Socket S2=null;
    static protected JugadorL jugador1=null;
    static protected JugadorL jugador2=null;
    static boolean esServidor = false;


    Servidor(int puerto)                //creo el servidor y los 2 jugadores
    {
        System.out.println("Soy el servidor");
        jugador1 = new JugadorL();
        jugador2 = new JugadorL();
       configurarJugador(jugador1,50,30);
       configurarJugador(jugador2,350,330);
        try{
            sock = new ServerSocket(puerto);
            esServidor = true;
        }
        catch(Exception ex){}
    }
    private void configurarJugador(JugadorL jug,int x,int y)
    {
        jug.setH(21);
        jug.setW(22);
        jug.setX(x);
        jug.setY(y);
        jug.setVida(5);
       
         
    }   
    
    
    public static Socket getSocket1()       // metodos de espera de conexion de cliente.
    { 
        try
        {
            if (S == null)
                S = sock.accept();
        }
        catch(Exception ex)
        {}
        return S;
    }
    
      public static Socket getSocket2()
    { 
        try
        {
            if (S2 == null)
                S2 = sock.accept();
        }
        catch(Exception ex)
        {}
        return S2;
    }
      public static boolean isServidor()
      {
          return esServidor;
      }
    
}


