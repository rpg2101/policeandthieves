

package grafica;

import Conexion.Cliente;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintWriter;

public class KeyListenerCliente  implements KeyListener{

    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //aca ta la papa
        String teclaApretada = JugadorL.getTeclas().get(e.getKeyCode());
        
        try{
                PrintWriter out = new PrintWriter(Cliente.getCliente().getOutputStream(), true);     
                out.println("aprete:"+teclaApretada);
            }
            catch(Exception ex){
                
                System.out.println("Houston we have a problem con la tecla");
        
        }
    }

    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}
