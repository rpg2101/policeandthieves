package view;

import Conexion.Cliente;
import grafica.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class RotuloGrafico extends Rotulo {

    private Boolean focotrue;
    private List<Grafico> todos = new Vector<Grafico>();

    @SuppressWarnings("empty-statement")
    public RotuloGrafico(String st) {
        super(st);
        focotrue = true;
        Integer[] ent = {new Integer(38), new Integer(40), new Integer(37), new Integer(39), new Integer(32)};

        this.creoJugador(ent, 50, 30, 1);
        this.creoJugador(ent, 350, 330, 2);

        creoMuroVertical(0, 0, 400);
        creoMuroVertical(393, 0, 400);
        creoMuroHorizontal(0, 0, 500);
        creoMuroHorizontal(0, 394, 400);

        creoBOrigen(164, 10, 30);
        creoBDestino(120, 390, 30);

        //1
        creoLadrillo(66, 73, 48);
        creoLadrillo(66, 124, 48);
        creoLadrillov(63, 75, 50);
        creoLadrillov(113, 75, 50);

        //2
        creoLadrillo(166, 73, 48);
        creoLadrillo(166, 124, 48);
        creoLadrillov(163, 75, 50);
        creoLadrillov(213, 75, 50);

        //3
        creoLadrillo(266, 73, 48);
        creoLadrillo(266, 124, 48);
        creoLadrillov(263, 75, 50);
        creoLadrillov(313, 75, 50);

        //4
        creoLadrillo(63, 173, 48);
        creoLadrillo(63, 224, 48);
        creoLadrillov(61, 175, 50);
        creoLadrillov(111, 175, 50);

        //5
        creoLadrillo(166, 173, 48);
        creoLadrillo(166, 223, 48);
        creoLadrillov(163, 175, 50);
        creoLadrillov(213, 175, 50);

        //6
        creoLadrillo(263, 175, 48);
        creoLadrillo(263, 225, 48);
        creoLadrillov(260, 176, 50);
        creoLadrillov(310, 176, 50);

        //7
        creoLadrillo(63, 273, 48);
        creoLadrillo(63, 325, 48);
        creoLadrillov(61, 275, 50);
        creoLadrillov(111, 275, 50);

        //8
        creoLadrillo(166, 273, 48);
        creoLadrillo(166, 323, 48);
        creoLadrillov(163, 275, 50);
        creoLadrillov(212, 275, 50);

        //9
        creoLadrillo(266, 273, 48);
        creoLadrillo(266, 323, 48);
        creoLadrillov(263, 275, 50);
        creoLadrillov(312, 275, 50);



        creoPolicia(107, 330, -100, -100);

        int x, y;
        int ancho, alto;


        crearCuadrante(115, 125, todos);
        crearCuadrante(115, 225, todos);
        crearCuadrante(215, 125, todos);
        crearCuadrante(215, 225, todos);



        Grafico.setLista(todos);
//        Integer[] ent1={new Integer(87),new Integer(90),new Integer(65),new Integer(83),new Integer(32)};
//        this.creoJugador(ent1, 40, 100);
    }

    private void crearCuadrante(int x, int y, List<Grafico> todos) {
        CruceCalle c = new CruceCalle();
        Cuadrante cuad;
        cuad = new Cuadrante1(x, y, todos);
        c.agregarCuadrante(cuad);
        cuad = new Cuadrante2(x + 26, y, todos);
        c.agregarCuadrante(cuad);
        cuad = new Cuadrante3(x, y + 26, todos);
        c.agregarCuadrante(cuad);
        cuad = new Cuadrante4(x + 26, y + 26, todos);
        c.agregarCuadrante(cuad);

    }

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

    public void creoJugador(Integer[] ent, Integer x, Integer y, Integer Numero) {
        JugadorL jug = new JugadorL();
        KeyListenerCliente listener = new KeyListenerCliente();
        //jug.setJgoBackground(getBackground());
        jug.setJgoBackground(Color.GRAY);
        jug.setRotulo(this);
        jug.setTecla(ent);
        todos.add(jug);
        jug.setH(17);
        jug.setW(17);
        jug.setX(x);
        jug.setY(y);
        jug.setVida(5);
        //this.addKeyListener(jug);
        addKeyListener(listener);
        this.repaint();
        if (Numero == 1) {
            Cliente.jugador1 = jug;
            jug.setJgoBackground(Color.RED);
        } else {
            jug.setJgoBackground(Color.BLUE);
            Cliente.jugador2 = jug;
        }
    }

    private void creoMuroVertical(Integer x, Integer y, Integer h) {
        MV muro = new MV();
        muro.setW(7);
        muro.setH(h);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(-1);
        todos.add(muro);
        this.repaint();
    }

    private void creoMuroHorizontal(Integer x, Integer y, Integer w) {
        MH muro = new MH();
        muro.setW(w);
        muro.setH(7);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(-1);
        todos.add(muro);
        this.repaint();
    }

    private void creoBOrigen(Integer x, Integer y, Integer w) {
        BOrigen base = new BOrigen();
        base.setW(50);
        base.setH(3);
        base.setX(x);
        base.setY(y);
        base.setVida(1);
        todos.add(base);
        this.repaint();
    }

    private void creoLadrillo(Integer x, Integer y, Integer w) {
        MH muro = new MH();
        muro.setW(w);
        muro.setH(3);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(1);
        todos.add(muro);
        this.repaint();
    }

    private void creoLadrillov(Integer x, Integer y, Integer w) {
        MV muro = new MV();
        muro.setW(3);
        muro.setH(50);
        muro.setX(x);
        muro.setY(y);
        muro.setVida(1);
        todos.add(muro);
        this.repaint();
    }

    private void creoPolicia(Integer x, Integer y, Integer xVel, Integer yVel) {
        Policia p = new Policia(xVel, yVel);
        p.setW(17);
        p.setH(17);
        p.setX(225);
        p.setY(195);
        p.setVel(14);
        p.setJgoBackground(Color.GRAY);
        p.setRotulo(this);
        todos.add(p);
        Thread hilo = new Thread(p);

        this.repaint();

        Policia p2 = new Policia(xVel, yVel);
        p2.setW(17);
        p2.setH(17);
        p2.setX(132);
        p2.setY(132);
        p2.setVel(14);
        p2.setJgoBackground(Color.GRAY);
        p2.setRotulo(this);
        todos.add(p2);
        Thread hilo2 = new Thread(p2);

        this.repaint();

        Policia p3 = new Policia(xVel, yVel);
        p3.setW(17);
        p3.setH(17);
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

    @Override
    public void set(Comparable c) {
    }

    @Override
    public Comparable get() {
        return null;
    }

    @Override
    protected void ini() {
        this.setBounds(0, 0, 400, 400);
        this.jL.setBounds(2, 2, 396, 20);
        this.setBackground(Color.GRAY);
//        iniciar();
    }

    public List<Grafico> getTodos() {
        return todos;
    }

    public void setTodos(List<Grafico> todos) {
        this.todos = todos;
    }

    @Override
    public void paintComponent(Graphics gr) {
        Iterator<Grafico> it = todos.iterator();
        gr.setColor(Color.GRAY);
        gr.fillRect(0, 0, 400, 400);
        for (; it.hasNext();) {
            it.next().pintarse((Graphics2D) gr);
        }
    }

    @Override
    public boolean isFocusable() {
        return focotrue;
    }
}
