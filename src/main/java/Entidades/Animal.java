/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Animal {
    // Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
    // La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse() {
        System.out.println("Se alimenta de comida");
    }
    
}
