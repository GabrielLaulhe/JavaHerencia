/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class ExtraHotelero extends Alojamiento {
    
    protected boolean privado;
    protected Integer metros2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, Integer metros2, String nombre, String localidad, String encargado, Integer precioHabitacion) {
        super(nombre, localidad, encargado, precioHabitacion);
        this.privado = privado;
        this.metros2 = metros2;
    }

   

   

    

   
    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", metros2=" + metros2 + '}';
    }

    @Override
    public int precioHabitacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
    

  
    
}
