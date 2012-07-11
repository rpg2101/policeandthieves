/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.validacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utku32
 */
public abstract class Validador {

    public static Validador creo(String val) {
        System.out.println(val);
        String[] st = val.split("%");
        Class[] cl = {String.class};
        Object[] ob = {val};
        try {
            return (Validador) Class.forName("view.validacion." + st[0]).getMethod("creo", cl).invoke(null, ob);
        } catch (Exception ex) {
            System.out.println("subindice " + st.length);
            Logger.getLogger(Validador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public abstract Boolean valido(Comparable c);
}
