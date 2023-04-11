/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;


/**
 *
 * @author Asus
 */
public class servicioEditorial {
    Scanner leer = new Scanner(System.in);
    //EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager(); // lo mismo que la linea 19 y 20
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    public void guardarEditorial(String nombre) {
        
        Editorial e = new Editorial();
        e.setNombre(nombre);
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
    }
    
    public Editorial buscarEditorialId(Integer id) {
        Editorial e1 = (Editorial) em.createQuery("SELECT a FROM Editorial a "
                                            + "WHERE a.id = :id").setParameter("id", id).getSingleResult();
        return e1;
    }
    
    public Editorial buscarEditorialNombre(String nombre) {
        Editorial e1 = (Editorial) em.createQuery("SELECT a FROM Editorial a "
                                            + "WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        return e1;
    }
    
    public Editorial validarEditorial(String nombre) {
        Editorial e = buscarEditorialNombre(nombre);
        if (e==null) {
            guardarEditorial(nombre);
            return buscarEditorialNombre(nombre);
        }
        return e;
    }
    
}
