/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidades.Alojamiento;
import java.util.Comparator;

/**
 *
 * @author Asus
 */
public class Comparadores {
    
    public static Comparator<Alojamiento> ordenarPrecio = new Comparator<Alojamiento>() {
        @Override
        public int compare(Alojamiento t, Alojamiento t1) {
            return t1.getPrecioHabitacion().compareTo(t.getPrecioHabitacion());
        }
    };

    
    
    
    
    
    
            
    
}
