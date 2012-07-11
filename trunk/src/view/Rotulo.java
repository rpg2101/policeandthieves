package view;

import java.awt.Color;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.validacion.Validador;

public abstract class Rotulo extends JPanel{
    protected JLabel jL;
    protected JComponent jcomp;
    protected Integer h=22, w=800, wr=800, we=2, hm=h*5, he=2;
    private Color colort=Color.WHITE;
    private Color colorf=Color.RED;
    
    public String getRotulo(){
        return getJL().getText();
    }
    public abstract void set(Comparable c);
    public abstract Comparable get();
    public void set (Map m){};
    public void set (Rotulo ro){};
    public void set (String met, Object ob){};
    public Map <String, Comparable> getALL(){
        return null;
    }
    public void setALL(Map <String, Comparable> m){};
    protected Rotulo (){};
    protected Rotulo (String st){
        this.setLayout(null);
        jL = new JLabel (st);
        this.add(this.jL);
        this.setBackground(colort);
        jL.setBackground(colort);
        ini();
    }
    protected abstract void ini();

    public JComponent getJcomp() {
        return jcomp;
    }

    public void setJcomp(JComponent jcomp) {
        this.jcomp = jcomp;
    }

    public JLabel getJL() {
        return jL;
    }

    public void setJL(JLabel jL) {
        this.jL = jL;
    }
    
    public static Rotulo creo(String ro, String widget){
        Class[] cl = {String.class};
        Object[]ob = {ro};
        try {
            return (Rotulo) Class.forName("view."+widget).getConstructor(cl).newInstance(ob);
        } catch (Exception ex) {
            Logger.getLogger(Rotulo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    protected Validador validador=null;
    
    public Boolean valido() {
        Boolean bool = getValidador().valido(get());
        try {
            getClass().getMethod("valido" + bool.toString(), (Class[]) null).invoke(this, (Object[]) null);
        } catch (Exception ex) {
            Logger.getLogger(Rotulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bool;
    }
    public void validotrue(){
        setBackground(colort);
        System.out.println("Rotulo valido  true "+this.getRotulo());
    }
    public void validofalse(){
        setBackground(colorf);
        System.out.println("Rotulo valido  false "+this.getRotulo());
    }
    public static Rotulo creo(String ro, String widget, String metodo, Object obj){
        Rotulo r = creo(ro, widget);
        r.set(metodo, obj);
        return r;
    }

    public Validador getValidador() {
        return validador;
    }

    public void setValidador(Validador validador) {
        this.validador = validador;
    }
}


