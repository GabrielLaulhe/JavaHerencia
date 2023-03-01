/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Hotel5Estrellas1 extends Hotel4Estrellas1 {
//    Hotel *****  Gimnasio,
// Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas

    
    
    protected Integer cantSalones;
    protected Integer cantSuites;
    protected Integer cantLimosinas;

    public Hotel5Estrellas1() {
    }

    public Hotel5Estrellas1(Integer cantSalones, Integer cantSuites, Integer cantLimosinas, String restaurante, Integer capacidadRestaurante, String gimnasio, Integer cantidadHabitaciones, Integer nroCamas, Integer cantidadPisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(restaurante, capacidadRestaurante, gimnasio, cantidadHabitaciones, nroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    @Override
    public int precioHabitacion() {
        precioHabitaciones = super.precioHabitacion()+VALimosina();
        return precioHabitaciones;
    }

    public int VALimosina() {
        return 15*cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas1{" + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }
    
    
        
}
