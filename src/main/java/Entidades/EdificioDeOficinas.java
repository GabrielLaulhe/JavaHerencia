/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class EdificioDeOficinas extends Edificio{

////    número de oficinas, cantidad de personas
////por oficina y número de pisos.
    
    
    protected Integer nroOficinas;
    protected Integer PersonasPorOficinas;
    protected Integer numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer nroOficinas, Integer PersonasPorOficinas, Integer numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.PersonasPorOficinas = PersonasPorOficinas;
        this.numeroPisos = numeroPisos;
    }

    public Integer getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(Integer nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public Integer getPersonasPorOficinas() {
        return PersonasPorOficinas;
    }

    public void setPersonasPorOficinas(Integer PersonasPorOficinas) {
        this.PersonasPorOficinas = PersonasPorOficinas;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public double calcularSuperficie() {
        double superficie = ancho*largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho*largo*alto;
        return volumen;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "nroOficinas=" + nroOficinas + ", PersonasPorOficinas=" + PersonasPorOficinas + ", numeroPisos=" + numeroPisos + '}';
    }
    
    
    
    
}
