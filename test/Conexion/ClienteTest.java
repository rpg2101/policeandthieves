/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author rpg
 */
public class ClienteTest {
    
    public ClienteTest() {
        Servidor serverprueba = new Servidor(6668);
    }


    @Test
    public void testGetCliente() {
        Cliente clienteprueba = new Cliente("127.0.0.1",6668);
        Socket expResult = null;
        try {
            expResult = new Socket("127.0.0.1",6668);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClienteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Socket result = Cliente.getCliente();
        assertEquals(expResult.getClass(), result.getClass());
    }
}
