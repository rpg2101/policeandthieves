
package grafica;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Robot extends Actor implements Runnable {

    protected long vel;
    protected Integer xVel;
    protected Integer yVel;


    public void run() {
        while (vida>0){
            try {
                funColision();
                moverse();
                this.rotulo.repaint();
//                pintarse();
                Thread.sleep(getVel());
            } catch (InterruptedException ex) {
                Logger.getLogger(Robot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public abstract void moverse();


    public long getVel() {
        return vel;
    }

    public void setVel(long vel) {
        this.vel = vel;
    }


}
