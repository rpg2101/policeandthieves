
package grafica;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Policia extends Robot {

     public Policia(Integer xVel, Integer yVel){
        this.xVel = xVel;
        this.yVel = yVel;
        r = new Rectangle(x, y, w, h);
    }

    public Boolean colisionoCon(Grafico gr){
        return gr.colisionoCon(this);
    }

    @Override
    public void moverse() {
        setPosicionAnterior();
        setX((int)(x + xVel * vel / 1000));
        setY((int)(y + yVel * vel / 1000));
        r.setLocation(x, y);
    }

    public void invertirVelX(){
        this.xVel *= -1;
    }

    public void invertirVelY(){
        this.yVel *= -1;
    }

    @Override
    public void pintarse(Graphics2D gr){
        gr.setColor(Color.RED);
        gr.fillOval(x, y, w, h);
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
        System.out.println("Choco Policia");
           System.out.println(" ");
               return true;

    }

    @Override
    public Boolean colisionoCon(Policia gr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean colisionoCon(BDestino gr) {
        return false;
 }
    @Override
    public Boolean colisionoCon(BOrigen gr) {
        return false;
}
}

