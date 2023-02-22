/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Hotel4Estrellas extends Hoteles {

//   Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante

    protected String restaurante;
    protected Integer capacidadRestaurante;
    protected String gimnasio;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String restaurante, Integer capacidadRestaurante, String gimnasio, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, String nombre, String localidad, String encargado, Integer precioHabitacion) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, nombre, localidad, encargado, precioHabitacion);
        this.restaurante = restaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasio = gimnasio;
    }

   

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String getEncargado() {
        return encargado;
    }

    @Override
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    
    
    
    
     @Override
    public int precioHabitacion() {
        precioHabitacion = 50 + cantidadHabitaciones*numeroCamas + VARestaurante() + VAGimnasio();
        return precioHabitacion;
    }

    
    public int VARestaurante() {
        if (capacidadRestaurante<30) {
            return 10;
        }else {
            if (capacidadRestaurante>=30 && capacidadRestaurante<=50) {
                return 30;
            }else{
                return 50;
            }
        }
    }

    
    public int VAGimnasio() {
        if (gimnasio.equals("A")) {
            return 50;
        }else {
            return 30;
        }
    }

    

   

   

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "nombre=" + nombre + ", localidad=" + localidad + ", encargado=" + encargado
                + "restaurante=" + restaurante + ", capacidadRestaurante=" 
                + capacidadRestaurante + ", gimnasio=" + gimnasio + "cantidadHabitaciones=" 
                + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" 
                + cantidadPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

    

 

   
    
    
    
    
}
