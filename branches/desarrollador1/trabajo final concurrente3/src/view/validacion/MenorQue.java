/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.validacion;

/**
 *
 * @author utku32
 */
public class MenorQue extends Validador{
    public static Validador creo(Comparable c){
        MenorQue v= new MenorQue();
        v.set(c);
        return v;
    }
    private Comparable comp;

    @Override
    public Boolean valido(Comparable c) {
        return comp.compareTo(c)<0;
    }

    private void set(Comparable c) {
        comp = c;
    }

}
