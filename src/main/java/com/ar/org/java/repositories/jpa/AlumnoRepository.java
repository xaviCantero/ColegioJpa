package com.ar.org.java.repositories.jpa;

import com.ar.org.java.entities.Alumno;
import com.ar.org.java.repositories.interfaces.I_AlumnoRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

public class AlumnoRepository implements I_AlumnoRepository{
    //private EntityManagerFactory emf;
    EntityManager em;
    public AlumnoRepository(EntityManager em){
        this.em = em;
    }

    @Override
    public void save(Alumno alumno) {
        if(alumno == null) return;
        //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        //em.close();
    }

    @Override
    public void remove(Alumno alumno) {
        if(alumno == null) return;
        //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(alumno));
        em.getTransaction().commit();
        //em.close();
    }

    @Override
    public void update(Alumno alumno) {
        if(alumno == null) return;
        //EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(em.merge(alumno));
        em.getTransaction().commit();
        //em.close();
    }

    @Override
    public List<Alumno> getAll() {
        List<Alumno> list = new ArrayList();
        //EntityManager em = emf.createEntityManager();
        list =(List<Alumno>)em.createNamedQuery("Alumno.findAll").getResultList();
        //em.close();
        return list;
    }
    
    
    
}
