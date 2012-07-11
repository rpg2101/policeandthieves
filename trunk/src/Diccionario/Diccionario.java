package Diccionario;

import java.util.Iterator;
import java.util.TreeMap;
import view.Rotulo;

public class Diccionario extends TreeMap<Comparable, DiccionarioItem> {

    public void put(DiccionarioItem di) {
        put(di.getNombre(), di);
    }

    public void creoWidget(Rotulo ro) {
        Iterator<Comparable> it = this.keySet().iterator();
        for (; it.hasNext();) {
            ro.set(get(it.next()).creoWidget());
        }
    }
}
