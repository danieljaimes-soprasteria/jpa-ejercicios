package com.JPAejercicios.capitulo3.servicio;

import com.JPAejercicios.capitulo3.entidad.Department;

import javax.persistence.EntityManager;

public class ServiceDepartment {
    public static void createDepartment(EntityManager entityManager, Department department){
        entityManager.persist(department);
    }
}
