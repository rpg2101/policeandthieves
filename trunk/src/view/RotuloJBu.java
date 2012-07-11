package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class RotuloJBu extends Rotulo implements ActionListener{
    private String metodo;
    private Object objeto;
    
    public RotuloJBu (String st){
        super();
        ini();
        ((JButton) jcomp).setText(st);
        ((JButton) jcomp).addActionListener(this);
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
        this.setBounds(0, 0, wr, 2*h);
        jcomp = new JButton();
        add(jcomp);
    }
    
    @Override
    public void set (String met, Object ob){
        metodo = met;
        objeto = ob;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            objeto.getClass().getMethod(metodo, (Class[]) null).invoke(objeto, (Object[]) null);
        } catch (Exception ex) {
            System.out.println("Error!!! "+ex);
        }
    }
    public Boolean valido(){
        return true;
    }

}
