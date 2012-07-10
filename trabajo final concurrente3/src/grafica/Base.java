

package grafica;
                        // clase madre para base origen y destino.. ( media al pedo.. ) jeje
public abstract class Base extends Grafico {

    

 @Override
    public Boolean colisionoCon(MH gr) {
        return false;
    }

    @Override
    public Boolean colisionoCon(MV gr) {
        return false;
    }

     @Override
    public Boolean colisionoCon(JugadorL gr) {
        return true;

     }
       public Boolean colisionoCon(Policia gr) {
           return true;
    }
      
    @Override
    public Boolean colisionoCon(BDestino gr) {
        return false;
    }
 @Override
    public Boolean colisionoCon(BOrigen gr) {
        return false;
 }
}
