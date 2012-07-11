package view;

import java.awt.Color;
import java.awt.Component;
import java.util.Map;
import java.util.TreeMap;

public class RotuloJPA extends Rotulo{
    
    public RotuloJPA (String st){
        super(st);
    }

    @Override
    public void set(Comparable c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Comparable get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void ini() {
        this.setBounds(0, 0, w, h);
        this.jL.setBounds(we, he, w-2*we, h-2*he);
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void set (Rotulo ro){
        Component ob = this.getComponent(this.getComponentCount()-1);
        ro.setLocation(we, ob.getY()+ob.getHeight()+he);
        add(ro);
        ob = this.getComponent(this.getComponentCount()-1);
        setSize(w+2*we, ob.getY()+ob.getHeight()+he);
    }
    @Override
    public Map<String, Comparable> getALL(){
        Map<String, Comparable> map = new TreeMap<String, Comparable>();
        for(int i=1;i<getComponentCount()-1;i++){
            String clave = ((Rotulo)getComponent(i)).getRotulo();
            Comparable valor = ((Rotulo)getComponent(i)).get();
            map.put(clave, valor);
            //map.put(((Rotulo)getComponent(i)).getRotulo(), ((Rotulo)getComponent(i)).get());
        }
        System.out.println(map);
        return map;
    }
    @Override
    public void setALL(Map<String, Comparable> map){
        for(int i=1;i<getComponentCount()-1;i++){
            String clave = ((Rotulo)getComponent(i)).getRotulo();
            ((Rotulo)getComponent(i)).set(map.get(clave));
            //((Rotulo)getComponent(i)).set(map.get(((Rotulo)getComponent(i)).getRotulo()));
        }
    }
    
    public Boolean valido(){
        Boolean val= true;

        for(int i=1;i<getComponentCount()-1;i++){
            val =  ((Rotulo)getComponent(i)).valido() && val ;
            System.out.println(i+"  "+val);
        }
        
        return val;
    }

}