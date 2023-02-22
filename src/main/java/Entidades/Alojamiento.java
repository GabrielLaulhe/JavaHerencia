/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public abstract class Alojamiento {
    
//    Los alojamientos se identifican por un nombre, una dirección,
//una localidad y un gerente encargado del lugar.
    
    protected String nombre;
    protected String localidad;
    protected String encargado;
    protected Integer precioHabitacion;
    
    public Alojamiento() {
    }

    public Alojamiento(String nombre, String localidad, String encargado, Integer precioHabitacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.encargado = encargado;
        this.precioHabitacion = precioHabitacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

   

    public abstract int precioHabitacion();

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", localidad=" + localidad + ", encargado=" + encargado + '}';
    }
    
    
    
//    public abstract void precioHabitacion();
//    public abstract int VARestaurante();
//    public abstract int VAGimnasio();
//    public abstract int VALimosina();
//    public abstract boolean conRestaurante();
//    public abstract boolean conDescuento();
}
