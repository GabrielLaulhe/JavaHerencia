/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Utilidades.EnumSeccion;
import Utilidades.EstadoCivil;

/**
 *
 * @author Asus
 */
public final class PersonalServicio extends Empleado {
    
    protected EnumSeccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(EnumSeccion seccion, Integer anioIncorp, Integer nroDespacho, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(anioIncorp, nroDespacho, nombre, apellido, ID, estadoCivil);
        this.seccion = seccion;
    }

    public EnumSeccion getSeccion() {
        return seccion;
    }

    public void setSeccion(EnumSeccion seccion) {
        this.seccion = seccion;
    }

   

   
    @Override
    public String toString() {
        return "PersonalServicio{" + " nombre=" + nombre + ", apellido=" + apellido + 
                "/n, ID=" + ID + ", estadoCivil=" + estadoCivil+ ", seccion=" + seccion + 
                "/n, anioIncorp=" + anioIncorp + ", nroDespacho=" + nroDespacho + '}';
    }
    
    
    
}
