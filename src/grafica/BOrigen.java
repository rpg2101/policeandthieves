package grafica;

import java.awt.Color;
import java.awt.Graphics2D;

public class BOrigen extends Base {

    int flagCarga = 0;

    @Override
    public Boolean colisionoCon(Grafico gr) {
        return gr.colisionoCon(this);
    }

    @Override
    public Boolean colisionoCon(JugadorL gr) {
        int i = 0;
        System.out.println("COLISION CON BASE ORIGEN ");
        System.out.println(" ");
        if (flagCarga == 0) {
            flagCarga = 1;

            gr.cargando = 1;
            new TimerBase(gr, this);     // larga de timer de carga
            gr.carga = 1;
            gr.cargaO[i] = 0;
            i++;
            if (i == 5) {
                System.out.println("USTED NO PUEDE CARGAR MAS");
            }

        } else {
            gr.volverPosicion();
        }
        return true;
    }
    //}

    @Override
    public void pintarse(Graphics2D gr) {
        gr.setColor(Color.BLACK);
        gr.fillRect(x, y, w, h);
    }
}
