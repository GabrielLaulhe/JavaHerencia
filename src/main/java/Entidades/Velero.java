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
public final class Velero extends Barco {
    
//    • Número de mástiles para veleros.
//• Potencia en CV para barcos a motor.
//• Potencia en CV y número de camarotes para yates de lujo.
    
    protected Integer nroMastiles;

    public Velero() {
    }

    public Velero(Integer nroMastiles, Integer matricula, Integer metrosEslora, Integer aniosFabricacion) {
        super(matricula, metrosEslora, aniosFabricacion);
        this.nroMastiles = nroMastiles;
    }
    
    @Override
    public int costoBarco() {
        
        
        int costoBarc = metrosEslora*10+nroMastiles;
        return costoBarc;
    }

    @Override
    public String toString() {
        return "Velero{" + "nroMastiles=" + nroMastiles + '}';
    }
    
    
    
    
}
