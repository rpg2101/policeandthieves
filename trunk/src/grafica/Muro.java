package grafica;

public abstract class Muro extends Grafico {

    @Override
    public Boolean colisionoCon(MH gr) {
        return false;
    }

    @Override
    public Boolean colisionoCon(BOrigen gr) {
        return false;
    }

    @Override
    public Boolean colisionoCon(BDestino gr) {
        return false;
    }

    @Override
    public Boolean colisionoCon(MV gr) {
        return false;
    }

    @Override
    public Boolean colisionoCon(JugadorL gr) {
        //this.vida++;
        //System.out.println("vida"+ vida.toString());
        //this.checkVida();
        gr.volverPosicion();
        return true;

    }

    public Boolean colisionoCon(Policia gr) {
        return true;
    }
}
