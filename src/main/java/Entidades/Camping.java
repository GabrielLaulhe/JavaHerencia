/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Camping extends ExtraHotelero {
    
    
    protected Integer capacidadCarpas;
    protected Integer banios;
    protected boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(Integer capacidadCarpas, Integer banios, boolean tieneRestaurante, boolean privado, Integer metros2, String nombre, String localidad, String encargado, Integer precioHabitacion) {
        super(privado, metros2, nombre, localidad, encargado, precioHabitacion);
        this.capacidadCarpas = capacidadCarpas;
        this.banios = banios;
        this.tieneRestaurante = tieneRestaurante;
    }

    

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros2() {
        return metros2;
    }

    public void setMetros2(Integer metros2) {
        this.metros2 = metros2;
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
    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    @Override
    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    
    
    
    @Override
    public String toString() {
        return "Camping{" + "nombre=" + nombre + ", localidad=" + localidad + ", encargado=" 
                + encargado + "privado=" + privado + ", metros2=" + metros2
                + "capacidadCarpas=" + capacidadCarpas + ", banios=" + banios 
                + ", tieneRestaurante=" + tieneRestaurante + "precioHabitacion " + precioHabitacion + '}';
    }
    
    
}
