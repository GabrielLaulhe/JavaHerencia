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
public final class YateLujo extends BarcoMotor {
    
    
  protected Integer nroCamarotes;

    public YateLujo() {
    }

    public YateLujo(Integer nroCamarotes, Integer potenciaMotor, Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        super(potenciaMotor, matricula, metrosEslora, aniosFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    
    @Override
    public int costoBarco() {
        
        
        int costoBarc = metrosEslora*10+potenciaMotor+nroCamarotes;
        return costoBarc;
    }
    
    @Override
    public String toString() {
        return "YateLujo{" + "nroCamarotes=" + nroCamarotes + '}';
    }
  
    
  
}
