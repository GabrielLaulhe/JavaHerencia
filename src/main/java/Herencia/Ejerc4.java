

package Herencia;
import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author {Gabi}
 */

public class Ejerc4 {
    

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(10, 20);
        r1.area();
        r1.perimetro();
        System.out.println(r1);
        Circulo c1 = new Circulo(10);
        c1.area();
        c1.perimetro();
        System.out.println(c1);
    }

}
