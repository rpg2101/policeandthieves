package trabajofinalconcurrente;

import Conexion.Cliente;
import Conexion.HiloServidor;
import Conexion.Servidor;
import Diccionario.Formularios;
import java.net.Socket;
import javax.swing.JFrame;
import view.Rotulo;

public class Main {

    private Rotulo rot;

    public static void main2() {
        //new ServidorCliente().setVisible(true);
        if (!Servidor.isServidor()) {
            while (Cliente.getCliente().isConnected() == false) {
            }
            //Espera que se conecte
        } else {
            Socket servidor1 = Servidor.getSocket1();
            while (servidor1.isConnected() == false) {
                servidor1 = Servidor.getSocket1();
            }
            try {

                Thread hiloS = new HiloServidor(servidor1, 1);
                hiloS.start();
            } catch (Exception ex) {
                //System.console().printf("No se pudo abrir el puerto %d",puerto);
            }
            Socket servidor2 = Servidor.getSocket2();
            while (servidor2.isConnected() == false) {
                servidor2 = Servidor.getSocket2();
            }
            try {

                Thread hiloS2 = new HiloServidor(servidor2, 2);
                hiloS2.start();
            } catch (Exception ex) {
                //System.console().printf("No se pudo abrir el puerto %d",puerto);
            }
        }
        Socket cliente = Cliente.getCliente();
        Formularios.creo();
        Main m = new Main();
        JFrame jf = new JFrame();
        jf.getContentPane().setLayout(null);
        String stit = "Juego";
        Rotulo r1 = Formularios.getForma().creoWidget(stit);
        m.rot = r1;
//        Rotulo rbo = Rotulo.creo("Boton", "RotuloJBu", "metodo", m);
//        r1.set(rbo);
        r1.setLocation(15, 15);

        jf.getContentPane().add(r1);
        jf.setSize(500, 500);           //TAMAÑO DEL PANEL CONTENEDOR BLANCO
        jf.setVisible(true);
    }

    public void metodo() {
        System.out.println("Aprete el Boton " + rot.getALL() + "  " + rot.valido());
//        Map mapa = rot.getALL();
//        mapa.put("Prueba3", mapa.get("Prueba1"));
//        mapa.put("Prueba2", "Hola");
//        rot.setALL(mapa);
    }
}
