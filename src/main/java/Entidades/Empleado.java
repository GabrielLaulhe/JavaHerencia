/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import static Herencia.Ejerc4Extra.leer;
import Utilidades.EstadoCivil;

/**
 *
 * @author Asus
 */
public class Empleado extends Persona {
    //    Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
    //incorporación a la facultad y qué número de despacho tienen asignado.
    protected Integer anioIncorp;
    protected Integer nroDespacho;

    public Empleado() {
    }

    public Empleado(Integer anioIncorp, Integer nroDespacho, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.nroDespacho = nroDespacho;
    }

    public Integer getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(Integer anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    public void cambioNroDespacho() {
         System.out.println("Ingrese el numero de despacho");

        while (!leer.hasNextInt()) {
            System.out.println("el numero es incorrecto, ingreselo nuevamente");
            leer.next();  // Limpia la entrada del usuario
        }
        
        int nroD = leer.nextInt(); // Lee el número entero ingresado
        System.out.println("El número ingresado es: " + nroD);

        nroDespacho=nroD;
        System.out.println("su nuevo despacho es: " + nroDespacho);
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "anioIncorp=" + anioIncorp + ", nroDespacho=" + nroDespacho + '}';
    }

   
    
    
}
