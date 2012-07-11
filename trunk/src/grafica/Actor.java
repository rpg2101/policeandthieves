package grafica;

public abstract class Actor extends Grafico {        //clase q tiene los metodos de volver posicion y de setear las posiciones.. ( movilidad)
    protected Integer xAnt, yAnt;

    public void volverPosicion() {

        x = xAnt;
        y = yAnt;
    }

    public void setPosicionAnterior(Integer x, Integer y) {
        xAnt = x;
        yAnt = y;
    }

    public void setPosicionAnterior() {
        xAnt = x;
        yAnt = y;
    }
}
