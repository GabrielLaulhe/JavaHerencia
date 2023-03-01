/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public final class Residencia extends ExtraHotelero {
    
    protected Integer cantidadHabitacionesR;
    protected boolean conDescuento;
    protected boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantidadHabitacionesR, boolean conDescuento, boolean campoDeportivo, boolean privado, Integer metros2, String nombre, String localidad, String encargado, Integer precioHabitacion) {
        super(privado, metros2, nombre, localidad, encargado, precioHabitacion);
        this.cantidadHabitacionesR = cantidadHabitacionesR;
        this.conDescuento = conDescuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadHabitacionesR() {
        return cantidadHabitacionesR;
    }

    public void setCantidadHabitacionesR(Integer cantidadHabitacionesR) {
        this.cantidadHabitacionesR = cantidadHabitacionesR;
    }

    public boolean isConDescuento() {
        return conDescuento;
    }

    public void setConDescuento(boolean conDescuento) {
        this.conDescuento = conDescuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        return "Residencia{" + "nombre=" + nombre + ", localidad=" + localidad + ", encargado=" 
                + encargado + "privado=" + privado + ", metros2=" + metros2
                + "cantidadHabitacionesR=" + cantidadHabitacionesR + ", conDescuento=" + conDescuento 
                + ", campoDeportivo=" + campoDeportivo + "PrecioHabitacion " + precioHabitacion + '}';
    }
    
    
    
    
}
