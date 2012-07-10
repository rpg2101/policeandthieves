
package view.validacion;


public class Igual extends Validador{
    public static Validador creo(Comparable c){
        Igual v= new Igual();
        v.set(c);
        return v;
    }
    private Comparable comp;

    @Override
    public Boolean valido(Comparable c) {
        return comp.compareTo(c)==0;
    }

    private void set(Comparable c) {
        comp = c;
    }

}
