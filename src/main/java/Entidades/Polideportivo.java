/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Polideportivo extends Edificio {

    protected String nombre;
    protected String tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        double superficie = ancho * largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho * largo * alto;
        return volumen;

    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoDeInstalacion=" + tipoDeInstalacion + '}';
    }
}
