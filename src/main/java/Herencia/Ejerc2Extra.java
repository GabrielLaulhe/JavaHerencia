

package Herencia;
import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicios.servicioEdificio;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author {Gabi}
 */

public class Ejerc2Extra {
   

    public static void main(String[] args) {
        
        ArrayList<Edificio> listaEdificios = new ArrayList<>();
        servicioEdificio serv = new servicioEdificio();
        
        
        Edificio e;
        
        for (int i = 1; i < 5; i++) {
            if (i==1 || i==2) {
                e = new Polideportivo();
                serv.caractPolidep((Polideportivo) e);
                e.calcularSuperficie();
                e.calcularVolumen();
                listaEdificios.add(e);
            }else{
                e= new EdificioDeOficinas();
                serv.crearEdOficina((EdificioDeOficinas) e);
                e.calcularSuperficie();
                e.calcularVolumen();
                listaEdificios.add(e);
            }
            
        }
        
        for (Edificio listaEdificio : listaEdificios) {
            System.out.println(listaEdificio);
            System.out.println("Superficie "+ listaEdificio.calcularSuperficie());
            System.out.println("Volumen" + listaEdificio.calcularVolumen());
            System.out.println("********************************************");
        }
        
        
    }

}
