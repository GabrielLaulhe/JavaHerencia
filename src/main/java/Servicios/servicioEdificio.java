/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioEdificio {

    Scanner leer = new Scanner(System.in);

    public void crearEdOficina(EdificioDeOficinas eo1) {
        
        System.out.println("---------Edificio de Oficinas---------");
        System.out.println("Ingrese las medidas del edificio, ancho/largo/alto");
        eo1.setAncho(leer.nextInt());
        eo1.setLargo(leer.nextInt());
        eo1.setAlto(leer.nextInt());

        System.out.println("Ingrese la cantidad de personas que entran por oficina");
        eo1.setPersonasPorOficinas(leer.nextInt());

        System.out.println("Ingrese la cantidad de oficinas por piso");
        eo1.setNroOficinas(leer.nextInt());

        System.out.println("Ingrese la cantidad de pisos del edificio");
        eo1.setNumeroPisos(leer.nextInt());
    }

    public int cantPers(EdificioDeOficinas eo1) {

        int cantPers = eo1.getPersonasPorOficinas() * eo1.getNroOficinas() * eo1.getNumeroPisos();
        return cantPers;
    }

    public void caractPolidep(Polideportivo p1) {
        System.out.println("-------Polideportivo--------");

        System.out.println("Ingrese las medidas del Polideportivo, ancho/largo/alto");
        p1.setAncho(leer.nextInt());
        p1.setLargo(leer.nextInt());
        p1.setAlto(leer.nextInt());

        System.out.println("Indique el nombre del Polideportivo");
        p1.setNombre(leer.next());

        System.out.println("Indique si con 1 si es techado y con 2 si es abierto");
        int opcion = leer.nextInt();

        if (opcion == 1) {
            p1.setTipoDeInstalacion("Techado");
        } else {
            p1.setTipoDeInstalacion("Abierto");
        }

    }

}
