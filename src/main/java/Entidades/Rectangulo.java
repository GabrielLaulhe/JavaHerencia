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
public class Rectangulo implements CalculoFormas {
    
    
    protected Integer base;
    protected Integer altura;
    protected double area;
    protected double perimetro;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public double area() {
        area = base*altura;
        return area;
    }

    @Override
    public double perimetro() {
       perimetro = base*2 + altura*2;
       return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }

   

   
    
    
}
