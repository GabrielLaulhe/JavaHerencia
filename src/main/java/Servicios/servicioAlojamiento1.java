/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;



import Entidades.Alojamiento1;
import Entidades.Camping1;
import Entidades.Hotel4Estrellas1;
import Entidades.Hotel5Estrellas1;
import Entidades.Residencia1;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class servicioAlojamiento1 {
    
    public servicioAlojamiento1() {
        ArrayList<Alojamiento1> listaAlojam = new ArrayList<>();
        
        Hotel4Estrellas1 a = new Hotel4Estrellas1("LaComilona", 25, "A", 35, 2, 6, 0, null, null, null, null);
        a.precioHabitacion();
        listaAlojam.add(a);
        Hotel4Estrellas1 a1 = new Hotel4Estrellas1("LaCasona", 20, "B", 40, 1, 3,0, null, null, null, null);
        a1.precioHabitacion();
        listaAlojam.add(a1);
        Hotel4Estrellas1 a2 = new Hotel4Estrellas1("LaCocina", 30, "A", 45, 3, 5, 0, "Hotelito", "VillaMaria", "Pepe", null);
        a2.precioHabitacion();
        listaAlojam.add(a);
        
        Hotel5Estrellas1 a3 = new Hotel5Estrellas1(3, 5, 2, "Resto1", 40, "A", 30, 2, 6, 0, null, null, null, null);
        a3.precioHabitacion();
        listaAlojam.add(a3);
        Hotel5Estrellas1 a4 = new Hotel5Estrellas1(1, 3, 0, "LaPizzeria", 35, "A", 80, 2, 4, 0, "HotelUno", "SanFrancisco", "Luciano", null);
        a4.precioHabitacion();
        listaAlojam.add(a4);
        Hotel5Estrellas1 a5 = new Hotel5Estrellas1(0, 2, 1, "LaCasaDeLaComida", 45, "A", 60, 3, 4, 0, "HotelDos", "CordobaCapital", "Gabi", null);
        a5.precioHabitacion();
        listaAlojam.add(a5);
        
        Camping1 a6 = new Camping1(40, 5, true, true, 500, null, null, null, null);
        listaAlojam.add(a6);
        Camping1 a7 = new Camping1(30, 4, false, true, 600, null, null, null, null);
        listaAlojam.add(a7);
        Camping1 a8 = new Camping1(25, 6, true, false, 1000, null, null, null, null);
        listaAlojam.add(a8);
        
        Residencia1 a9 = new Residencia1(15, true, true, true, 1200, null, null, null, null);
        listaAlojam.add(a9);
        Residencia1 a10 = new Residencia1(20, false, false, true, 1000, null, null, null, null);
        listaAlojam.add(a10);
        Residencia1 a11 = new Residencia1(30, true, true, false, 900, null, null, null, null);
        listaAlojam.add(a11);
        
    }
    
    
}
