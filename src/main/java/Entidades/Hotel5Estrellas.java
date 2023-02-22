/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Hotel5Estrellas extends Hotel4Estrellas {
//    Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas,
    
    protected Integer salonConferencia;
    protected Integer suites;
    protected Integer limosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer salonConferencia, Integer suites, Integer limosinas, String restaurante, Integer capacidadRestaurante, String gimnasio, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, String nombre, String localidad, String encargado, Integer precioHabitacion) {
        super(restaurante, capacidadRestaurante, gimnasio, cantidadHabitaciones, numeroCamas, cantidadPisos, nombre, localidad, encargado, precioHabitacion);
        this.salonConferencia = salonConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    

    public Integer getSalonConferencia() {
        return salonConferencia;
    }

    public void setSalonConferencia(Integer salonConferencia) {
        this.salonConferencia = salonConferencia;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
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

    public String getEncargado() {
        return encargado;
    }

    @Override
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    
    
     @Override
    public int precioHabitacion() {
        precioHabitacion = 50 + cantidadHabitaciones*numeroCamas + VARestaurante() + VAGimnasio() + VALimosina();
        return precioHabitacion;
    }

    @Override
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

    @Override
    public int VAGimnasio() {
        if (gimnasio.equals("A")) {
            return 50;
        }else {
            return 30;
        }
    }

    
    public int VALimosina() {
        return 15*limosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "nombre=" + nombre + ", localidad=" + localidad + ", encargado=" 
                + encargado + "restaurante=" + restaurante + ", capacidadRestaurante=" 
                + capacidadRestaurante + ", gimnasio=" + gimnasio + "salonConferencia=" 
                + salonConferencia + ", suites=" + suites + ", limosinas=" + limosinas + "precioHanitacion " + precioHabitacion + '}';
    }
    
    
}
