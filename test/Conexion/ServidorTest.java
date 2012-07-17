/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.net.Socket;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author rpg
 */
public class ServidorTest {
    
    public ServidorTest() {
    }

    @Test
    public void testGetSocket1() {

    }

    /**
     * Test of getSocket2 method, of class Servidor.
     */
    @Test
    public void testGetSocket2() {

    }

    /**
     * Test of isServidor method, of class Servidor.
     */
    @Test
    public void testIsServidor() {
        Servidor serverprueba = new Servidor(6666);
        boolean expResult = true;
        boolean result = serverprueba.isServidor();
        assertEquals(expResult, result);
    }
}
