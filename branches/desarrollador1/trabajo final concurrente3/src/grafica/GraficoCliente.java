/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafica;

import java.awt.Color;

/**
 *
 * @author Administrador
 */
public class GraficoCliente {
    Color color;
    int x,y,ancho,alto,rotacion;
    GraficoCliente(int x,int y, int alto, int ancho,Color color)
    {
        this.x=x;
        this.y=y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }
    
    void mover(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    
    void cambiarColor(Color color)
    {
        this.color = color;
    }
    
    void dibujar()
    {
        
    }
    /*
     private void creoBDestino(Integer x, Integer y, Integer w) {
        BDestino base = new BDestino();
        base.setW(50);
        base.setH(3);
        base.setX(x);
        base.setY(y);
        base.setVida(1);
        todos.add(base);
        this.repaint();
    }

    public void creoJugador(Integer[] ent, Integer x, Integer y,Integer Numero){
        JugadorL jug = new JugadorL();
        KeyListenerCliente listener = new KeyListenerCliente();
        //jug.setJgoBackground(getBackground());
        jug.setJgoBackground(Color.GRAY);
        jug.setRotulo(this);
        jug.setTecla(ent);
        todos.add(jug);
        jug.setH(21);
        jug.setW(22);
        jug.setX(x);
        jug.setY(y);
        jug.setVida(5);
        //this.addKeyListener(jug);
        addKeyListener(listener);
        this.repaint();
        if (Numero == 1)
        {
            Cliente.jugador1 = jug;
            jug.setJgoBackground(Color.RED);
        }
        else
        {
            jug.setJgoBackground(Color.BLUE);
            Cliente.jugador2 = jug;   
        }
    }
    
    private void creoMuroVertical(Integer x, Integer y, Integer h){
        MV muro = new MV();
        muro.setW(7);
        muro.setH(h);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(-1);
        todos.add(muro);
        this.repaint();
    }

    private void creoMuroHorizontal(Integer x, Integer y, Integer w){
        MH muro = new MH();
        muro.setW(w);
        muro.setH(7);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(-1);
        todos.add(muro);
        this.repaint();
    }
    private void creoBOrigen(Integer x, Integer y, Integer w){
        BOrigen base = new BOrigen();
        base.setW(50);
        base.setH(3);
        base.setX(x);
        base.setY(y);
        base.setVida(1);
        todos.add(base);
        this.repaint();
    }
    
    private void creoLadrillo(Integer x, Integer y, Integer w){
        MH muro = new MH();
        muro.setW(w);
        muro.setH(3);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(1);
        todos.add(muro);
        this.repaint();
    }

    private void creoLadrillov(Integer x, Integer y, Integer w){
        MV muro = new MV();
        muro.setW(3);
        muro.setH(50);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(1);
        todos.add(muro);
        this.repaint();
    }





    private void creoPolicia(Integer x, Integer y, Integer xVel, Integer yVel){
        Policia p = new Policia(xVel, yVel);
        p.setW(20);
        p.setH(20);
        p.setX(225);
        p.setY(195);
        p.setVel(14);
        p.setJgoBackground(Color.GRAY);
        p.setRotulo(this);
        todos.add(p);
        Thread hilo = new Thread(p);
       
        this.repaint();

         Policia p2 = new Policia(xVel, yVel);
        p2.setW(20);
        p2.setH(20);
        p2.setX(132);
        p2.setY(132);
        p2.setVel(14);
        p2.setJgoBackground(Color.GRAY);
        p2.setRotulo(this);
        todos.add(p2);
        Thread hilo2 = new Thread(p2);
        
        this.repaint();

        Policia p3 = new Policia(xVel, yVel);
        p3.setW(20);
        p3.setH(20);
        p3.setX(x);
        p3.setY(y);
        p3.setVel(14);
        p3.setJgoBackground(Color.GRAY);
        p3.setRotulo(this);
        todos.add(p3);
        Thread hilo3 = new Thread(p3);
        
        this.repaint();

         hilo.start();
         hilo2.start();
         hilo3.start();
    }
   
*/
}
