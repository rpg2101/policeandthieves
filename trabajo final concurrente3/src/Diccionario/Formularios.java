package Diccionario;

import view.Rotulo;
import java.util.Iterator;
import java.util.Properties;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Formularios extends TreeMap<String, Diccionario>{
    private static Formularios forma = new Formularios();
    
    public Rotulo creoWidget(String f){
        Rotulo rot = Rotulo.creo(f.replace("_", " "), "RotuloJPA");
        get(f).creoWidget(rot);
        return rot;
    }
    
    public static void creo(){
        forma = new Formularios();
        Properties prop = new Properties();
        Diccionario dic= new Diccionario();
        forma.put("diccionarioDatos", dic);
        try {
            prop.load(forma.getClass().getClassLoader().getResourceAsStream("recursos/items.properties"));
        } catch (Exception ex) {
            Logger.getLogger(Formularios.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iterator<Object> it = prop.keySet().iterator();
        String st;
        String[] t;
        for(;it.hasNext();){
            st=(String) it.next();
            t=prop.getProperty(st).split("#");
            dic.put(new DiccionarioItem(st, t[0], t[1], t[2], t[3], t[4]));
        }
        System.out.println(dic);
        
        prop.clear();
        try {
            prop.load(forma.getClass().getClassLoader().getResourceAsStream("recursos/formas.properties"));
        } catch (Exception ex) {
            Logger.getLogger(Formularios.class.getName()).log(Level.SEVERE, null, ex);
        }
        it = prop.keySet().iterator();
        Diccionario dic1;
        for(;it.hasNext();){
            st=(String) it.next();
            dic1=new Diccionario();
            forma.put(st, dic1);
            t=prop.getProperty(st).split("#");
            for(Integer i=0; i< t.length; i++)
                dic1.put(i, dic.get(t[i]));
            System.out.println(dic1);
        }
    }

    public static Formularios getForma() {
        return forma;
    }

}
