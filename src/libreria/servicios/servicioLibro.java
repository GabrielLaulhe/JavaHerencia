/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


/**
 *
 * @author Asus
 */
public class servicioLibro {
    
//    private Long isbn;
//    private String titulo;
//    private Integer anio;
//    private Integer ejemplares;
//    private Integer ejemplaresPrestados;
//    private Integer ejemplaresRestantes;
//    private Boolean alta = true;
//    @ManyToOne
//    private Autor autor;
//    @ManyToOne
//    private Editorial editorial;
    Scanner leer = new Scanner(System.in);
    //EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager(); // lo mismo que la linea 19 y 20
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    
    servicioAutor sa;
    servicioEditorial se;
    public servicioLibro() {
        sa = new servicioAutor();
        se = new servicioEditorial();
    }
    
    public Libro crearLibro() {
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el anio");
        int anio = leer.nextInt();
        System.out.println("Ingrese la cantidad de ejemplares que hay en stock");
        int cantEjemplares = leer.nextInt();
        
        System.out.println("Ingrese el nombre de autor");
        String nombre = leer.next();
        Autor a = sa.validarAutor(nombre);
        
        System.out.println("Ingrese el nombre de la editorial");
        String nombre1 = leer.next();
        Editorial e = se.validarEditorial(nombre1);
        return new Libro(titulo, anio, cantEjemplares, a, e);  
    }
    
    public void guardarLibro() {
        Libro l = crearLibro();
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        
    }
    
    
    
}
