/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;
import grafica.JugadorL;
import java.net.Socket;
import java.net.Socket.*;
import sun.nio.ch.SocketAdaptor;



public class Cliente {
    static Socket cliente=null;
    static boolean esCliente=false;
    static public JugadorL jugador1;        //define el socket cliente, y los objetos jugador1 y 2
    static public JugadorL jugador2;
    Cliente(String IP, int Puerto)
    {
        try{
          cliente = new Socket(IP, Puerto);     // crea el cliente, le pasa los parametros de ip y puerto
          esCliente = true;
          Thread hiloCliente = new HiloCliente();       // crea el hilocliente y lo pone a correr
          hiloCliente.start();
        }
        catch(Exception ex)
        {
            System.console().printf("No se pudo abrir el puerto %d de la ip %s", Puerto,IP);
        }
    }

    public static Socket getCliente()
    {
        return cliente;
    }
    /*
    static public boolean isClient()
    {
        return esCliente;
    }*/
}