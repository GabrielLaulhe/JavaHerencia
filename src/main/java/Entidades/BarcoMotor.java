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
public class BarcoMotor extends Barco {
    
    protected Integer potenciaMotor;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaMotor, Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        super(matricula, metrosEslora, aniosFabricacion);
        this.potenciaMotor = potenciaMotor;
    }
    
    
    @Override
    public int costoBarco() {
        
        
        int costoBarc = metrosEslora*10+potenciaMotor;
        return costoBarc;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaMotor=" + potenciaMotor + '}';
    }
    
    
}
