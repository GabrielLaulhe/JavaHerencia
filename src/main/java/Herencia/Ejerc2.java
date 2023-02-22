package Herencia;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.servicioElectrodomestico;
import Servicios.servicioLavadora;
import Servicios.servicioTelevisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Ejerc2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Electrodomestico> elec = new ArrayList();
        
        servicioLavadora serv = new servicioLavadora();
        servicioTelevisor serv1 = new servicioTelevisor();
        servicioElectrodomestico ser = new servicioElectrodomestico();
        
        serv.mostrarLista(elec);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Que electrodomestico desea cargar? Televisor o Lavadora?");
            
            if (leer.nextLine().equalsIgnoreCase("Televisor")) {
                Televisor televisor = serv1.crearTelevisor();
                elec.add(televisor);
            }else {
                elec.add(serv.crearLavadora());
            }
        }
        int cont1 = 0;
        int contTv = 0;
        int contLav = 0;
        for (Electrodomestico electrodomestico : elec) {
            System.out.println(electrodomestico.getPrecio());
            cont1 += electrodomestico.getPrecio();
            if (electrodomestico instanceof Televisor) {
                contTv = electrodomestico.getPrecio() + contTv;
            }else {
                contLav = electrodomestico.getPrecio() + contLav;
            }
        }
        System.out.println("El precio acumulado de los productos es " + cont1);
        System.out.println("El precio acumulado de los Televisores es " + contTv);
        System.out.println("El precio acumulado de las lavadoras es " + contLav);
        
    }

}
