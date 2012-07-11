package view;

import javax.swing.JTextField;

public class RotuloJTF extends Rotulo{
    
    public RotuloJTF (String st){
        super (st);
    }

    @Override
    public void set(Comparable c) {
        ((JTextField) jcomp).setText((String) c);
    }

    @Override
    public Comparable get() {
        return ((JTextField) jcomp).getText();
    }

    @Override
    protected void ini() {
        this.setBounds(0, 0, w, h);
        this.jL.setBounds(we, he, wr, h-2*he);
        this.jcomp = new JTextField();
        this.jcomp.setBounds(wr+2*we, he, w-(wr+3*we), h-2*he);
        add(jcomp);
    }

}
