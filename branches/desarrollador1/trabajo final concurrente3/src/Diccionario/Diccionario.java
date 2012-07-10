package Diccionario;

import view.Rotulo;
import java.util.Iterator;
import java.util.TreeMap;

public class Diccionario extends TreeMap<Comparable, DiccionarioItem>{
    
    public void put(DiccionarioItem di){
        put(di.getNombre(), di);
    }
    
    public void creoWidget(Rotulo ro){
        Iterator<Comparable> it = this.keySet().iterator();
        for(;it.hasNext();){
            ro.set(get(it.next()).creoWidget());
        }
    }

}
