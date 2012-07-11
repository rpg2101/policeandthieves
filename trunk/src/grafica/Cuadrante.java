
package grafica;

import java.util.Collection;


public abstract class Cuadrante extends Actor {
    Collection<JugadorL> Cola;
    CruceCalle cruce;

    int tomado = 0;
    public int getTomado()
    {
        return tomado;
    }
    public void setTomado(int t){
        tomado = t;
    }
    public Collection<JugadorL> getCola() 
    {
        return Cola;
    }
  

}
