package com.ar.org.java.repositories.jpa;

import com.ar.org.java.entities.Curso;
import com.ar.org.java.repositories.interfaces.I_CursoRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

public class CursoRepository implements I_CursoRepository{

    //private  EntityManagerFactory emf;
    private  EntityManager em;
    
    public CursoRepository(EntityManager em){this.em = em;}
    
    @Override
    public void save(Curso curso) {
        if(curso==null)return;
        ///EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
        //em.close();
    }

    @Override
    public void remove(Curso curso) {
        if(curso==null)return;
        //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //con merge consideramos consideramos el objeto 
        //con el mismo estado que esta en la db
        em.remove(em.merge(curso));
        em.getTransaction().commit();
        //em.close();
    }

    @Override
    public void update(Curso curso) {
        if(curso==null)return;
        //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(em.merge(curso));
        em.getTransaction().commit();
        //em.close();
    }

    @Override
    public List<Curso> getAll() {
        List<Curso> list = new ArrayList();
        //EntityManager em = emf.createEntityManager();
        list = em.createNamedQuery("Curso.findAll").getResultList();
        //em.close();
        return list;
        
    }
    
}
