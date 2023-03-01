/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Utilidades.EnumCursos;
import Utilidades.EstadoCivil;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Estudiante extends Persona {
    //    En cuanto a los estudiantes, se requiere almacenar el curso en el que están
    //matriculados.
    
    protected EnumCursos curso;

    public Estudiante() {
    }

    public Estudiante(EnumCursos curso, String nombre, String apellido, Integer ID, EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.curso = curso;
    }

    public EnumCursos getCurso() {
        return curso;
    }

    public void setCurso(EnumCursos curso) {
        this.curso = curso;
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
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Integer getID() {
        return ID;
    }

    @Override
    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + 
                "/n, ID=" + ID + ", estadoCivil=" + estadoCivil + ", Curso " + curso + '}';
    }
    
    

  
    
    
    
    
}
