package com.ar.org.java.conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public  class JpaUtil {
    private static final String PERSISTENCE_UNIT_NAME = "JPAPU";
    private static EntityManagerFactory emf;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if(emf==null){
            emf =  Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        }
        return emf;
    }
    
    public static void shutdown(){
        if(emf!=null){
            emf.close();
        }   
    }
}
