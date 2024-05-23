package com.JPAejercicios.capitulo3;

import com.JPAejercicios.capitulo3.entidad.Department;
import com.JPAejercicios.capitulo3.servicio.ServiceDepartment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgramCompany {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Company");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Department dept = new Department("TAKE_UP");
        ServiceDepartment.createDepartment(entityManager, dept);

        
    }
}
