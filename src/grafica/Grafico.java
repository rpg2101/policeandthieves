
package grafica;

import view.Rotulo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;                   //  proporciona las definiciones de objetos que representan algún tipo de forma geométrica.
import java.util.Iterator;               // utilidad de clase para recorrer una lista
import java.util.List;
import java.util.Vector;               // clase para emplear vectores con diferentes metodos declarados...
import view.Rotulo;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Grafico {

    public static List<Grafico> getLista() {
        return lista;
    }

    public static void setLista(List<Grafico> aLista) {
        lista = aLista;
    }

    protected Integer x = 50,x1;           //origen del rectangulo
    protected Integer y = 50,y1;
    protected Integer w = 20, w1=w;         //dimensiones
    protected Integer h = 20, h1=h;
    protected Integer vida =1;
    protected Integer carga = 0;
    protected Integer descarga = 0;
    protected Integer descargas = 0;

              Integer[] cargaO={1,1,1,1,1};
              Integer[] cargaD={0,0,0,0,0};          //definidios los arrays de 5 elementos...

    protected Rectangle r = new Rectangle(x, y, w, h);
    private Grafico col;                    // colision de grafico
    private Shape clipcont;                 //atributos de dimensiones
    protected Color fondoColor;
    private static List<Grafico> lista= new Vector<Grafico>();

     protected Rotulo rotulo;

    public abstract Boolean colisionoCon(Grafico gr);
    public abstract Boolean colisionoCon(MH gr);
    public abstract Boolean colisionoCon(MV gr);  
    public abstract Boolean colisionoCon(JugadorL gr);
    public abstract Boolean colisionoCon(Policia gr);
    public abstract Boolean colisionoCon(BOrigen gr);
    public abstract Boolean colisionoCon(BDestino gr);

    public void mover(int X, int Y)
    {
        x = X;
        y = Y;
    }
    
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
        r.setLocation(x, y);
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
        r.setLocation(this.x, this.y);
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
        r.setSize(w, h);
    }
    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
        r.setSize(w, h);
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void funColision() {
        List<Grafico> l= new Vector<Grafico>(getLista());
        l.remove(this);
        Iterator<Grafico> it = l.iterator();
        Boolean b;
        for(;it.hasNext();){
            col = it.next();
            b = r.intersects(col.r);
            try {
                getClass().getMethod("funColision" + b.toString(), (Class[]) null).invoke(this, (Object[]) null);
            } catch (Exception ex) {}
        }
    }
    public void funColisiontrue() {
        this.colisionoCon(col);
    }
    public void funColisionfalse() {

    }

    public void setJgoBackground(Color c){
        fondoColor=c;
    }

    public void pintarse(Graphics2D gr) {

    }

    
    public void setRotulo(Rotulo rotulo) {
        this.rotulo = rotulo;
    }

    public void checkVida(){
        try {
            getClass().getMethod("Vida" + getVida().toString(), (Class[]) null).invoke(this, (Object[]) null);
        } catch (Exception ex) {}
    }

    public void Vida0(){
        lista.remove(this);
    }

}
