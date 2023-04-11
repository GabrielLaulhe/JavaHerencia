/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioMenu {

    Scanner leer = new Scanner(System.in);

    public void menu() {
        System.out.println("------------MENU BIBLIOTECA-------------");
        System.out.println("Ingrese alguna de las siguientes opciones");
        System.out.println("1) Búsqueda de un Autor por nombre.\n"
                + "2) Búsqueda de un libro por ISBN.\n"
                + "3) Búsqueda de un libro por Título.\n"
                + "4) Búsqueda de un libro/s por nombre de Autor.\n"
                + "5) Búsqueda de un libro/s por nombre de Editorial\n"
                + "6) Salir.");

        Integer opc = leer.nextInt();
        switch (opc) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                throw new AssertionError();
        }

    }

}
