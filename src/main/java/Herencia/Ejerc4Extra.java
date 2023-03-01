package Herencia;

import Entidades.Persona;
import Servicios.servicioGestionFacultad;
import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Ejerc4Extra {

    public static Scanner leer = new Scanner(System.in);

//    • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.
//• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.
//• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).
//• Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).
    public static void main(String[] args) {
        servicioGestionFacultad serv = new servicioGestionFacultad();
        serv.crearPersona();
        serv.menu();

    }

}
