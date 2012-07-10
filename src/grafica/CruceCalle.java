/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Administrador
 */
public class CruceCalle {
    Collection<Cuadrante> cuadrantes;
    public void agregarCuadrante(Cuadrante cuad)
    {
        cuadrantes.add(cuad);
        cuad.cruce = this;
    }
    public CruceCalle()
    {
        cuadrantes = new ArrayList<Cuadrante>();
    }
    public boolean maximoColas()
    {
        int cantOcupados=0;
        Iterator<Cuadrante> it=cuadrantes.iterator();
        Cuadrante cuad;
        
        while (it.hasNext())
        {
            cuad=it.next();
            if (cuad.getCola().isEmpty()==false)
             cantOcupados++;   
        }
        if (cantOcupados >2)
            return true;
        else
            return false;
    }

}
