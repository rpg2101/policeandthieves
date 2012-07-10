
package grafica;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TimerBase extends Thread {
    
    public TimerBase (JugadorL gr, BOrigen base ){
        try {

            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TimerBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        gr.cargando=0;
        base.flagCarga =0;
    }

}
