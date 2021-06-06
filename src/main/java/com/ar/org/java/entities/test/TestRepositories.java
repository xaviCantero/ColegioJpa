package com.ar.org.java.entities.test;

import com.ar.org.java.conexion.JpaUtil;
import com.ar.org.java.entities.Curso;
import com.ar.org.java.repositories.interfaces.I_CursoRepository;
import com.ar.org.java.repositories.jpa.CursoRepository;
import javax.persistence.EntityManager;



public class TestRepositories {
    public static void main(String[] args){

        //EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        //I_CursoRepository cr = new CursoRepository(em);
        
        
        Curso curso ;
        /*
        curso = new Curso("Python","Juarez","LUNES","MAÑANA");
        cr.save(curso);
        System.out.println(curso);
        */
        
        //cr.remove(cr.getById(7));
        
        /*
        curso=cr.getById(6);
        if(curso!=null){
            curso.setProfesor("Federico");
            curso.setDia("VIERNES");
            cr.update(curso);
        }
        */
        
        
        //cr.getAll().forEach(System.out::println);
        //cr.getLikeTitulo("jav").forEach(System.out::println);
        

    
    }
}
