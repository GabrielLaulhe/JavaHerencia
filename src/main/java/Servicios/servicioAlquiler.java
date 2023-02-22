/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.YateLujo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class servicioAlquiler {

////      private String nombreCliente;
////    private int documento;
////    private LocalDate fechaAlquiler;
////    private LocalDate fechaDevolucion;
////    private String posicionAmarre;
////    private Barco nombreBarco;
    Scanner leer = new Scanner(System.in);

//    public void crearBarcos() {
//
//        Barco b1 = new Barco(234512, 20, 2010);
//
//        Barco v1 = new Velero(2, 356324, 12, 2015);
//
//        Barco bm1 = new BarcoMotor(120, 353642, 35, 2005);
//
//        Barco y1 = new YateLujo(10, 100, 653214, 40, 2020);
//
//    }
    public void crearContratoAlquier() {
////        el
////nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
////amarre y el barco que lo ocupará.

        Alquiler c1 = new Alquiler("Adolfo", 32124632, null, null, "muelle1", null);

        System.out.println("Ingrese fecha de alquiler dd/mm/aaaa");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();

        c1.setFechaAlquiler(LocalDate.of(anio, mes, dia));

        System.out.println("Ingrese la fecha de devolucion dd/mm/aaaa");
        int dia1 = leer.nextInt();
        int mes1 = leer.nextInt();
        int anio1 = leer.nextInt();
        c1.setFechaDevolucion(LocalDate.of(anio1, mes1, dia1));
        System.out.println("El valor del alquiler para el barco elegido es " + precioAlquiler(c1));

    }

    public Barco tipoBarco(Alquiler c1) {

        System.out.println("Ingrese el tipo de barco");
        System.out.println("1.Barco comun");
        System.out.println("2.Velero");
        System.out.println("3.Barco a Motor");
        System.out.println("4.Yate de Lujo");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:

                Barco b1 = new Barco(234512, 20, 2010);

                return b1;

            case 2:
                Barco v1 = new Velero(2, 356324, 12, 2015);
                return v1;
            case 3:
                Barco bm1 = new BarcoMotor(120, 353642, 35, 2005);
                return bm1;
            case 4:
                Barco y1 = new YateLujo(10, 100, 653214, 40, 2020);
                return y1;

        }
        return null;
    }

    public int precioAlquiler(Alquiler c1) {
        int diasOcupacion = (int) ChronoUnit.DAYS.between(c1.getFechaAlquiler(), c1.getFechaDevolucion());
        System.out.println("dias de ocupacion" + diasOcupacion);
        System.out.println("");
        int precioAlquiler = diasOcupacion * (tipoBarco(c1).costoBarco());
        return precioAlquiler;
    }

//    public void catalogoBarcosComun() {
//        System.out.println("Este es nuestro catalogo de barcos comunes para elegir");
//        ArrayList<Barco> listaBarcoComun = new ArrayList();
//
//        Barco b1 = new Barco(234512, 20, 2010);
//        Barco b2 = new Barco(234512, 20, 2010);
//        Barco b3 = new Barco(234512, 20, 2010);
//
//    }
//    
//    public void catalogoVeleros() {
//        
//        ArrayList<Barco> ListaVelero = new ArrayList();
//        Barco v1 = new Velero(2, 356324, 12, 2015);
//        Barco v2 = new Velero(2, 356324, 12, 2015);
//        Barco v3 = new Velero(2, 356324, 12, 2015);
//        Barco v4 = new Velero(2, 356324, 12, 2015);
//        ListaVelero.add(v4);
//        
//    }

}
