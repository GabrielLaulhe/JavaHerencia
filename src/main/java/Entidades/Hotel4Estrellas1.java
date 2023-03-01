/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Hotel4Estrellas1 extends Hoteles1 {

//    Hotel ****  Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante
//    
    protected String restaurante;
    protected Integer capacidadRestaurante;
    protected String gimnasio;

    public Hotel4Estrellas1() {
    }

    public Hotel4Estrellas1(String restaurante, Integer capacidadRestaurante, String gimnasio, Integer cantidadHabitaciones, Integer nroCamas, Integer cantidadPisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, nroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
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

    @Override
    public int precioHabitacion() {
        precioHabitaciones = 50 + cantidadHabitaciones*nroCamas*cantidadPisos + VARestaurante() + VAGimnasio();
        return precioHabitaciones;
    }

    public int VARestaurante() {
        if (capacidadRestaurante < 30) {
            return 10;
        }
        if (capacidadRestaurante <= 50) {
            return 30;
        } else {
            return 50;
        }
    }

    public int VAGimnasio() {
        if (gimnasio.equalsIgnoreCase("A")) {
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas1{" + "restaurante=" + restaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", gimnasio=" + gimnasio + '}';
    }

}
