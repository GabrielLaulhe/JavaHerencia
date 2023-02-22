/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.temporal.ChronoUnit;


/**
 *
 * @author Asus
 */
public class Barco {
//    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    
    protected Integer matricula;
    protected Integer metrosEslora;
    protected Integer aniosFabricacion;

    public  Barco() {
    }

    public Barco(Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.aniosFabricacion = aniosFabricacion;
    }
    
    public int costoBarco() {
        
        
        int costoBarc =metrosEslora*10;
        return costoBarc;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", metrosEslora=" + metrosEslora + ", aniosFabricacion=" + aniosFabricacion + '}';
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(Integer metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public Integer getAniosFabricacion() {
        return aniosFabricacion;
    }

    public void setAniosFabricacion(Integer aniosFabricacion) {
        this.aniosFabricacion = aniosFabricacion;
    }
    
    
    
}
