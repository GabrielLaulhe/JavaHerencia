/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interface.CalculoFormas;

/**
 *
 * @author Asus
 */
public class Circulo implements CalculoFormas {
    
    protected Integer radio;
    protected double area;
    protected double perimetro;

    public Circulo(Integer radio) {
        this.radio = radio;
    }
    
    

    @Override
    public double area() {
        area = PI*radio*radio;
        return area;
    }

    @Override
    public double perimetro() {
       perimetro = PI*radio*2;
       return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }

   
    
    
}
