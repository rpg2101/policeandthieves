
package grafica;

import java.awt.Color;
import java.awt.Graphics2D;


public class BDestino extends Base{

    int i=0;
     int flagDescarga=0;

 @Override
    public Boolean colisionoCon(Grafico gr) {
    return gr.colisionoCon(this);
    }
 @Override
    public Boolean colisionoCon(JugadorL gr)
 {
     
     System.out.println("COLISION CON BASE DESTINO");
     System.out.printf("");
         
     if (flagDescarga==0 && gr.carga==1){
         
         flagDescarga=1;
         gr.descargando=1;

            new TimerBase2(gr, this);

            gr.descargas ++;
          
        System.out.println(" UD REALIZO LA DESCARGA N°: "+ gr.descargas.toString());
        System.out.printf("");

        gr.cargaD[i]=0;
            i++;
            if(i==3)
            {System.out.println("");
             System.out.println("USTED GANO EL JUEGO!!!");
             System.out.println("");
             System.out.println("");
            }
         else
         gr.carga=0;
        return true;
        }
        else {
        System.out.println(" UD ESTA DESCARGADO!! ");
         gr.volverPosicion();
         System.out.printf("");
         }
        return true;

     }
 
 
    @Override
    public void pintarse(Graphics2D gr){
        gr.setColor(Color.BLACK);
        gr.fillRect(x, y, w, h);
    }

 
}