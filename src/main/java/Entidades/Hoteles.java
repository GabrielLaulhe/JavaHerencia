/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Hoteles extends Alojamiento {
    
//    Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones.
    
    
    protected Integer cantidadHabitaciones;
    protected Integer numeroCamas;
    protected Integer cantidadPisos;
    

    public Hoteles() {
    }

    public Hoteles(Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, String nombre, String localidad, String encargado, Integer precioHabitacion) {
        super(nombre, localidad, encargado, precioHabitacion);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
    }
    @Override
    public String toString() {
        return "Hoteles{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
    @Override
     public int precioHabitacion() {
         return precioHabitacion;
     }
     
}
