package com.ar.org.java.entities.test;

import com.ar.org.java.conexion.JpaUtil;
import com.ar.org.java.entities.Alumno;
import com.ar.org.java.repositories.interfaces.I_AlumnoRepository;
import com.ar.org.java.repositories.interfaces.I_CursoRepository;
import com.ar.org.java.repositories.jpa.AlumnoRepository;
import com.ar.org.java.repositories.jpa.CursoRepository;
import javax.persistence.EntityManager;

public class TestAlumnoJpa {
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        I_AlumnoRepository ar = new AlumnoRepository(em);
        I_CursoRepository cr = new CursoRepository(em);
        Alumno alumno;
        
        //alumno = new Alumno("Gston", "Diaz", 39, cr.getById(4));
        //ar.save(alumno);
        //System.out.println(alumno);
        
        //ar.remove(ar.getById(6));
        
        /*
        alumno = ar.getById(5);
        if(alumno!=null){
            alumno.setNombre("Gabriel");
            alumno.setIdCurso(cr.getById(2));
            ar.update(alumno);
        }
        */
        
        //ar.getAll().forEach(System.out::println);
        
        //ar.getByLikeApellido("f").forEach(System.out::println);
        
        
        //ar.getByCurso(cr.getById(3)).forEach(System.out::println);
        
       
    }
        
}

