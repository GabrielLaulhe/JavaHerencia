/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Hoteles;
import Entidades.Residencia;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public final class servicioAlojamiento {

    Scanner leer = new Scanner(System.in);
    Alojamiento a;

    public servicioAlojamiento() {

        ArrayList<Alojamiento> listaAlojam = new ArrayList();
        ArrayList<Camping> listaCamping = new ArrayList();
        ArrayList<Residencia> listaResidencia = new ArrayList();

        catalogoH4Estrellas(listaAlojam);

        catalogoH5Estrellas(listaAlojam);

        catalogoCamping(listaAlojam, listaCamping);

        catalogoResidencia(listaAlojam, listaResidencia);

        menu(listaAlojam, listaCamping, listaResidencia);
    }

    public ArrayList catalogoH4Estrellas(ArrayList listaAlojam) {

        a = new Hotel4Estrellas("LaComilona", 40, "B", 45, 2, 4, "ElHotelucho", "Cordoba", "Juan", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel4Estrellas("LaCasona", 20, "B", 40, 1, 3, "LaCasonaDeJose", "RioCuarto", "Jose", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel4Estrellas("LaCocina", 30, "A", 45, 3, 5, "Hotelito", "VillaMaria", "Pepe", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel4Estrellas("ElChef", 20, "B", 35, 2, 5, "ElHotelaso", "CarlosPaz", "Fer", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel4Estrellas("Picante", 15, "B", 20, 1, 3, "LaCasaDeAltaGracia", "AltaGracia", "Facu", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        return listaAlojam;
    }

    public ArrayList catalogoH5Estrellas(ArrayList listaAlojam) {

        a = new Hotel5Estrellas(2, 5, 4, "ElGourmet", 60, "A", 130, 3, 8, "ElGranHotel", "VillaGralBelgrano", "Pablo", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel5Estrellas(1, 3, 0, "LaPizzeria", 35, "A", 80, 2, 4, "HotelUno", "SanFrancisco", "Luciano", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel5Estrellas(0, 2, 1, "LaCasaDeLaComida", 45, "A", 60, 3, 4, "HotelDos", "CordobaCapital", "Gabi", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel5Estrellas(3, 8, 4, "Betos", 60, "A", 120, 3, 10, "HotelTres", "SantaRosa", "Nico", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        a = new Hotel5Estrellas(1, 3, 0, "ElResto", 60, "B", 70, 4, 3, "HotelCuatro", "Tanti", "Juli", null);
        a.precioHabitacion();
        listaAlojam.add(a);
        return listaAlojam;

    }

    public ArrayList catalogoCamping(ArrayList listaAlojam, ArrayList listaCamping) {
        
        a = new Camping(60, 10, true, true, 600, "ElCamping", "IchoCruz", "Tito", 50);
        listaAlojam.add(a);
        listaCamping.add((Camping) a);
        a = new Camping(30, 5, false, true, 500, "CercaDelRio", "TalaHuasi", "Fabio", 60);
        listaAlojam.add(a);
        listaCamping.add((Camping) a);
        a = new Camping(100, 15, true, false, 850, "Municipal", "LosReartes", "Gaston", 30);
        listaAlojam.add(a);
        listaCamping.add((Camping) a);
        return listaCamping;
    }

    public ArrayList catalogoResidencia(ArrayList listaAlojam, ArrayList listaResidencia) {

        a = new Residencia(15, true, true, true, 1200, "LaResi", "Cordoba", "Toto", 90);
        listaAlojam.add(a);
        listaResidencia.add(a);
        a = new Residencia(30, true, true, true, 2500, "LaGrande", "RioTercero", "Vero", 50);
        listaAlojam.add(a);
        listaResidencia.add(a);
        a = new Residencia(25, false, false, true, 1500, "ComoEnCasa", "RioPrimero", "Chicho", 60);
        listaAlojam.add(a);
        listaResidencia.add(a);
        return listaResidencia;
    }

    public void mostrarAlojamiento(ArrayList listaAlojam) {

        for (Iterator it = listaAlojam.iterator(); it.hasNext();) {
            Alojamiento alojamiento = (Alojamiento) it.next();
            System.out.println(alojamiento);
            System.out.println("");
        }
    }
    
    

   

    public void menu(ArrayList listaAlojam, ArrayList listaCamping, ArrayList listaResidencia) {

        System.out.println("Ingrese una de las opciones");
        System.out.println("• 1.todos los alojamientos.\n"
                + "• 2.todos los hoteles de más caro a más barato.\n"
                + "• 3.todos los campings con restaurante\n"
                + "• 4.todos las residencias que tienen descuento.");

        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                mostrarAlojamiento(listaAlojam);
                menu(listaAlojam, listaCamping, listaResidencia);
                break;
            case 2:
                Collections.sort(listaAlojam, Comparadores.ordenarPrecio);
                for (Iterator it = listaAlojam.iterator(); it.hasNext();) {
                    Alojamiento alojamiento = (Alojamiento) it.next();
                    System.out.println(alojamiento);
                    System.out.println("");
                }
                menu(listaAlojam, listaCamping, listaResidencia);
                break;
            case 3:
                for (Iterator it = listaCamping.iterator(); it.hasNext();) {
                    Camping alojamiento = (Camping) it.next();
                    if (alojamiento.isTieneRestaurante()) {
                        System.out.println(alojamiento);
                        System.out.println("");
                    }
                }
                menu(listaAlojam, listaCamping, listaResidencia);
                break;
            case 4:
                for (Iterator it = listaResidencia.iterator(); it.hasNext();) {
                    Residencia alojamiento = (Residencia) it.next();
                    if (alojamiento.isConDescuento()) {
                        System.out.println(alojamiento);
                        System.out.println("");
                    }
                }
                menu(listaAlojam, listaCamping, listaResidencia);
                break;
            
                
        }
    }

   

}
