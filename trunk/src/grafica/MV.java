package grafica;

import java.awt.Color;
import java.awt.Graphics2D;

public class MV extends Muro {

    public Boolean colisionoCon(Grafico gr) {
        return gr.colisionoCon(this);
    }

    public Boolean colisionoCon(Policia gr) {
        // gr.volverPocision();
        gr.invertirVelX();


        return true;
    }

    @Override
    public void pintarse(Graphics2D gr) {
        gr.setColor(Color.BLACK);
        gr.fillRect(x, y, w, h);
    }
}
