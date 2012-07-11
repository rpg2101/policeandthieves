package Diccionario;

import view.Rotulo;
import view.validacion.Validador;

public class DiccionarioItem {
    private String nombre, rotuloF, rotuloL, clase, tipoWidget;
    private Validador val;
    
    public DiccionarioItem(String n,String rf,String rl,String c,String tw, String val){
        nombre=n;
        rotuloF=rf;
        rotuloL=rl;
        tipoWidget=tw;
        clase=c;
        this.val= Validador.creo(val);
    }
    
    public Rotulo creoWidget(){
        Rotulo r1 = Rotulo.creo(rotuloF, tipoWidget);
        
        r1.setValidador(val);
        return r1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRotuloF() {
        return rotuloF;
    }

    public void setRotuloF(String rotuloF) {
        this.rotuloF = rotuloF;
    }

    public String getRotuloL() {
        return rotuloL;
    }

    public void setRotuloL(String rotuloL) {
        this.rotuloL = rotuloL;
    }

    public String getTipoWidget() {
        return tipoWidget;
    }

    public void setTipoWidget(String tipoWidget) {
        this.tipoWidget = tipoWidget;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    @Override
    public String toString(){
        return nombre+", "+rotuloF+", "+rotuloL+", "+clase+", "+tipoWidget;
    }

}
