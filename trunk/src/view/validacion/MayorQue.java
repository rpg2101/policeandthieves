/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.validacion;

/**
 *
 * @author utku32
 */
public class MayorQue extends Validador{
    public static Validador creo(String c){
        MayorQue v= new MayorQue();
        String[] st = c.split("%");
        v.set(st[1]);
        return v;
    }
    private Comparable comp;

    @Override
    public Boolean valido(Comparable c) {
        return comp.compareTo(c)<=0;
    }

    private void set(Comparable c) {
        comp = c;
    }

}
