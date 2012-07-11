package grafica;

import java.awt.Color;
import java.awt.Graphics2D;

public class MH extends Muro {

    public Boolean colisionoCon(Grafico gr) {
        return gr.colisionoCon(this);
    }

    @Override
    public Boolean colisionoCon(Policia gr) {

        //this.vida--;
        //System.out.println(" "+ vida.toString());
        //this.checkVida();
        //System.out.println(" "+ vida.toString());
        gr.volverPosicion();
        gr.invertirVelY();
        return true;
    }

    @Override
    public void pintarse(Graphics2D gr) {
        gr.setColor(Color.BLACK);
        gr.fillRect(x, y, w, h);
    }
}
