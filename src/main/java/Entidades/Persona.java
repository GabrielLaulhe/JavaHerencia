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
public class Persona {
//    Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.
    
    protected String nombre;
    protected String apellido;
    protected Integer ID;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void cambioEstadoCivil() {
        boolean aux = true;
        while (aux) {
            System.out.println("Ingrese su nuevo estado civil - CASADO/SOLTERO/VIUDO/DIVORCIADO/CONCUBINATO");
            String resp = leer.next();
            for (EstadoCivil estado : EstadoCivil.values()) {
                if (estado.name().equalsIgnoreCase(resp)) {
                    estadoCivil = estado;
                    aux = false;
                    break;
                }
            }
        }
        System.out.println("Se ha cambiado el estado civil a: " + estadoCivil);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estadoCivil=" + estadoCivil + '}';
    }

   

    
    
    
}
