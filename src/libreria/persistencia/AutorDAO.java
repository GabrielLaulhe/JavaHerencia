/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Asus
 */

public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(String id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a ").getResultList();
        desconectar();
        return autores;
    }

    public Autor buscarPorId(String id) throws Exception {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id").setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }
    
    public Autor buscarPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("", nombre).getSingleResult();
        desconectar();
        return autor;
    }
}
