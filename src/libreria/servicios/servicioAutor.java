/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Asus
 */
public class servicioAutor {
    Scanner leer = new Scanner(System.in);
    
    AutorDAO dao;
    
    public servicioAutor() {
        dao = new AutorDAO();
        
    }
    
    public void guardarAutor() {
        try {
            Autor a = new Autor();
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.next();
            a.setNombre(nombre);
            dao.guardar(a);
        } catch (Exception e) {
            System.out.println("Error al crear autor" + e.getMessage());
        }
    }
    
    public Autor buscarAutorId(Integer id) {
      
        
    }
    
    public Autor buscarAutorNombre() {
        Autor autor = null;
        try {
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.next();
            if (nombre == null) {
                System.out.println("Debe ingresar un nombre");
                buscarAutorNombre();
            }
            autor = dao.buscarPorNombre(nombre);
            return autor;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return autor;
        }
    }
    
    public Autor validarAutor(String nombre) {
        Autor a = buscarAutorNombre(nombre);
        if (a==null) {
            guardarAutor(nombre);
            return buscarAutorNombre(nombre);
        }
        return a;
    }

}
