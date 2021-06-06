package com.ar.org.java.entities.test;

import com.ar.org.java.entities.Curso;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestCursoJpa {
    public static void main(String[] args) {
        
        //establece la conexión con la db
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        //envia intrucciones a la db
        //EntityManager em = emf.createEntityManager();
        
        Curso curso = new Curso("JavaScrip", "Susana", "MIERCOLES", "NOCHE");
        /*
        //para realizar el CRUD debemos utilizar getTransaction();
        em.getTransaction().begin();
        //Guardamos el objeto curso en la db. 
        em.persist(curso);
        //terminamos la trasaccion y finalizamos el guardado
        em.getTransaction().commit();
        System.out.println(curso);
        */
        /*
        //REMOVE Para eliminar un registro, debemos utilizar las transacciones y el nameQuery 
        em.getTransaction().begin();
        Query query = em.createNamedQuery("Curso.findById");
        query.setParameter("id", 5);
        em.remove(query.getSingleResult());
        em.getTransaction().commit();
        */
        //UPDATE
        /*
        Query query = em.createNamedQuery("Curso.findById");
        query.setParameter("id", 2);
        curso=(Curso) query.getSingleResult();
        if(curso!=null){
            curso.setDia("JUEVES");
            curso.setTurno("MAÑANA");
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
        }
        */
        //Para realizar consultas namedQuery
        //em.createNamedQuery("Curso.findAll").getResultList().forEach(System.out::println);
        
        /*
        //Las consultas que piden  parametros necesitan una variable 
        del tipo Query para poder ejecutar la sentencia 
        Query query =em.createNamedQuery("Curso.findByTitulo");
        query.setParameter("titulo", "java");
        query.getResultList().forEach(System.out::println);
        */
        
        //cerramos las conexiónes
        //em.close();
        //emf.close();
    }
    
}
