package grafica;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Cuadrante4 extends Cuadrante {

    JugadorL cuad4 = null;

    public Cuadrante4(int x, int y, List<Grafico> todos) {
        this.x = x;
        this.y = y;
        this.w = 25;
        this.h = 25;
        this.r.setLocation(x, y);
        this.r.setSize(25, 25);
        todos.add(this);
        Cola = new ArrayList<JugadorL>();
    }

    @Override
    public Boolean colisionoCon(Grafico gr) {
        // throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(MH gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(MV gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(JugadorL gr) {

        System.out.println("Colision de cuadrante4 con Jugador");

        Rectangle rectChico = new Rectangle();

        if (cuad4 != null) {
            rectChico.x = this.x;
            rectChico.y = this.y;
            rectChico.width = this.w / 2;
            rectChico.height = this.h / 2;

            if (cuad4.r.intersects(rectChico) == false) {
                cuad4 = null;
            }
        }
        if (Monitor.getMonitor().tomarCuadrante(this, gr) == false) {
            System.out.println("ya esta tomado");
            gr.volverPosicion();
        } else {
            System.out.println("Ya lo tome");
        }

        return true;
    }

    @Override
    public Boolean colisionoCon(Policia gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(BOrigen gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public Boolean colisionoCon(BDestino gr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }
}
