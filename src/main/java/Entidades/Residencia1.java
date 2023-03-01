/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Residencia1 extends ExtraHotelero1 {
//    la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo.
    
    protected Integer cantHabitaciones;
    protected boolean descuento;
    protected boolean campoDeportivo;

    public Residencia1() {
    }

    public Residencia1(Integer cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, double mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia1{" + "cantHabitaciones=" + cantHabitaciones + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
