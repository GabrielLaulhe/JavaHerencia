/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Utilidades.EnumDepartamento;
import Utilidades.EstadoCivil;

/**
 *
 * @author Asus
 */
public final class Profesor extends Empleado {
    //    Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
    //pertenecen (lenguajes, matemáticas, arquitectura, ...).
    
    protected EnumDepartamento departamento;
    

    public Profesor() {
    }

    public Profesor(EnumDepartamento departamento, Integer anioIncorp, Integer nroDespacho, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(anioIncorp, nroDespacho, nombre, apellido, ID, estadoCivil);
        this.departamento = departamento;
    }

    public EnumDepartamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(EnumDepartamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + " nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + 
                "/n, estadoCivil=" + estadoCivil + ", departamento=" + departamento
                + "/n anioIncorp=" + anioIncorp + ", nroDespacho=" + nroDespacho + '}';
    }

    

    

    
    

    
    
    
}
