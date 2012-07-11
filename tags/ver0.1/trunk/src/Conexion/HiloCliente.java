
package Conexion;

import grafica.JugadorL;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HiloCliente extends Thread{
    public HiloCliente (){
        
    }
    @Override
    public void run(){
        BufferedReader in;
        String inputLine=null;                  //declara los elementos in, inputlone y datos recibidos, segun su tipo...
        String datosRecibidos[];
        
        JugadorL jugador;
        while(Cliente.getCliente().isConnected())
        {                                               //cuando este conectado el cliente
            try{
                in = new BufferedReader( new InputStreamReader( Cliente.getCliente().getInputStream()));    //instancia de lector de flujo de esntrada y del buffer del lector
                inputLine = in.readLine();                          // la linea leida es cargada en el string inputline
                //System.out.println(inputLine);                       //division de comandos ingresados segun # lo carga en string datos recibidos
                datosRecibidos = inputLine.split("#");
                
                if (datosRecibidos[1].contains("1"))
                    jugador = Cliente.jugador1;
                else
                    jugador = Cliente.jugador2;
               
                if(datosRecibidos[0].contains("mover"))             //Acciones respectivas a las ordenes de cada jugador.
                { 
                    int x ,y;
                    x = Integer.parseInt(datosRecibidos [2]);
                    y = Integer.parseInt(datosRecibidos [3]);          // carga en x y en y el valor en entero de datos recibidos 2 y 3, luego llama a la funcion mover
                    jugador.mover(x,y);
                }
                
                if(datosRecibidos[0].contains("cargaPaq"))
                { 
                    
                    int x;
                    x = Integer.parseInt(datosRecibidos [2]);   // si datos recibidos tiene cargapaq, lo q haces es imprimir carga, setear la carga en el jugador y cambiar el color a verde
                    System.out.printf(" CARGA = %d",x);
                    jugador.setCarga(x);
                    if (x==1)
                        jugador.setColor(Color.red);
                    else
                        jugador.setColor(Color.green);
                }
                
                if(datosRecibidos[0].contains("descarga"))      //si datos recibidos contienen descarga, setea la descarga,
                { 
                    int x;
                    x = Integer.parseInt(datosRecibidos [2]);
                    jugador.setDescargas(x);
                }
                
                }
            catch (Exception ex)
            {
                System.out.println("Error");
                System.out.println(inputLine);
                System.out.println(ex.toString());
                
                //break;
            }
        }
    }


}
