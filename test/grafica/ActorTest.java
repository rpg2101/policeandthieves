/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author rpg
 */
public class ActorTest {
    
    public ActorTest() {
    }

    @Test
    public void testVolverPosicion() {
        System.out.println("volverPosicion");
        Actor instance = new ActorImpl();
        instance.volverPosicion();
        assertEquals(instance.x, Integer.valueOf(50));
    }

    @Test
    public void testSetPosicionAnterior_Integer_Integer() {
        System.out.println("setPosicionAnterior");
        Integer x = null;
        Integer y = null;
        Actor instance = new ActorImpl();
        instance.setPosicionAnterior(x, y);
        // TODO review the generated test code and remove the default call to fail.

    }


    @Test
    public void testSetPosicionAnterior_0args() {
        System.out.println("setPosicionAnterior");
        Actor instance = new ActorImpl();
        instance.setPosicionAnterior();
        // TODO review the generated test code and remove the default call to fail.

    }

    public class ActorImpl extends Actor {

        @Override
        public Boolean colisionoCon(Grafico gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Boolean colisionoCon(MH gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Boolean colisionoCon(MV gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Boolean colisionoCon(JugadorL gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Boolean colisionoCon(Policia gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Boolean colisionoCon(BOrigen gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Boolean colisionoCon(BDestino gr) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
