/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import view.Rotulo;

/**
 *
 * @author rpg
 */
public class GraficoTest {
    
    public GraficoTest() {
    }


    @Test
    public void testGetLista() {
        System.out.println("getLista");
        List expResult = null;
        List result = Grafico.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setLista method, of class Grafico.
     */
    @Test
    public void testSetLista() {
        System.out.println("setLista");
        List<Grafico> aLista = null;
        Grafico.setLista(aLista);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_Grafico() {
        System.out.println("colisionoCon");
        Grafico gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_MH() {
        System.out.println("colisionoCon");
        MH gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_MV() {
        System.out.println("colisionoCon");
        MV gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_JugadorL() {
        System.out.println("colisionoCon");
        JugadorL gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_Policia() {
        System.out.println("colisionoCon");
        Policia gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_BOrigen() {
        System.out.println("colisionoCon");
        BOrigen gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of colisionoCon method, of class Grafico.
     */
    @Test
    public void testColisionoCon_BDestino() {
        System.out.println("colisionoCon");
        BDestino gr = null;
        Grafico instance = new GraficoImpl();
        Boolean expResult = null;
        Boolean result = instance.colisionoCon(gr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of mover method, of class Grafico.
     */
    @Test
    public void testMover() {
        System.out.println("mover");
        int X = 0;
        int Y = 0;
        Grafico instance = new GraficoImpl();
        instance.mover(X, Y);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getX method, of class Grafico.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Grafico instance = new GraficoImpl();
        Integer expResult = null;
        Integer result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setX method, of class Grafico.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        Integer x = null;
        Grafico instance = new GraficoImpl();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getY method, of class Grafico.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Grafico instance = new GraficoImpl();
        Integer expResult = null;
        Integer result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setY method, of class Grafico.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        Integer y = null;
        Grafico instance = new GraficoImpl();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of getW method, of class Grafico.
     */
    @Test
    public void testGetW() {
        System.out.println("getW");
        Grafico instance = new GraficoImpl();
        Integer expResult = null;
        Integer result = instance.getW();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of setW method, of class Grafico.
     */
    @Test
    public void testSetW() {
        System.out.println("setW");
        Integer w = null;
        Grafico instance = new GraficoImpl();
        instance.setW(w);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of getH method, of class Grafico.
     */
    @Test
    public void testGetH() {
        System.out.println("getH");
        Grafico instance = new GraficoImpl();
        Integer expResult = null;
        Integer result = instance.getH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setH method, of class Grafico.
     */
    @Test
    public void testSetH() {
        System.out.println("setH");
        Integer h = null;
        Grafico instance = new GraficoImpl();
        instance.setH(h);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getVida method, of class Grafico.
     */
    @Test
    public void testGetVida() {
        System.out.println("getVida");
        Grafico instance = new GraficoImpl();
        Integer expResult = null;
        Integer result = instance.getVida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of setVida method, of class Grafico.
     */
    @Test
    public void testSetVida() {
        System.out.println("setVida");
        Integer vida = null;
        Grafico instance = new GraficoImpl();
        instance.setVida(vida);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of funColision method, of class Grafico.
     */
    @Test
    public void testFunColision() {
        System.out.println("funColision");
        Grafico instance = new GraficoImpl();
        instance.funColision();
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of funColisiontrue method, of class Grafico.
     */
    @Test
    public void testFunColisiontrue() {
        System.out.println("funColisiontrue");
        Grafico instance = new GraficoImpl();
        instance.funColisiontrue();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of funColisionfalse method, of class Grafico.
     */
    @Test
    public void testFunColisionfalse() {
        System.out.println("funColisionfalse");
        Grafico instance = new GraficoImpl();
        instance.funColisionfalse();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setJgoBackground method, of class Grafico.
     */
    @Test
    public void testSetJgoBackground() {
        System.out.println("setJgoBackground");
        Color c = null;
        Grafico instance = new GraficoImpl();
        instance.setJgoBackground(c);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of pintarse method, of class Grafico.
     */
    @Test
    public void testPintarse() {
        System.out.println("pintarse");
        Graphics2D gr = null;
        Grafico instance = new GraficoImpl();
        instance.pintarse(gr);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setRotulo method, of class Grafico.
     */
    @Test
    public void testSetRotulo() {
        System.out.println("setRotulo");
        Rotulo rotulo = null;
        Grafico instance = new GraficoImpl();
        instance.setRotulo(rotulo);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of checkVida method, of class Grafico.
     */
    @Test
    public void testCheckVida() {
        System.out.println("checkVida");
        Grafico instance = new GraficoImpl();
        instance.checkVida();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of Vida0 method, of class Grafico.
     */
    @Test
    public void testVida0() {
        System.out.println("Vida0");
        Grafico instance = new GraficoImpl();
        instance.Vida0();
        // TODO review the generated test code and remove the default call to fail.
  
    }

    public class GraficoImpl extends Grafico {

        public Boolean colisionoCon(Grafico gr) {
            return null;
        }

        public Boolean colisionoCon(MH gr) {
            return null;
        }

        public Boolean colisionoCon(MV gr) {
            return null;
        }

        public Boolean colisionoCon(JugadorL gr) {
            return null;
        }

        public Boolean colisionoCon(Policia gr) {
            return null;
        }

        public Boolean colisionoCon(BOrigen gr) {
            return null;
        }

        public Boolean colisionoCon(BDestino gr) {
            return null;
        }
    }
}
