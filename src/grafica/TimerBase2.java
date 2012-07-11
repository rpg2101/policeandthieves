package grafica;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TimerBase2 extends Thread {

    public TimerBase2(JugadorL gr, BDestino base) {
        try {

            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TimerBase2.class.getName()).log(Level.SEVERE, null, ex);
        }
        gr.descargando = 0;
        base.flagDescarga = 0;
    }
}