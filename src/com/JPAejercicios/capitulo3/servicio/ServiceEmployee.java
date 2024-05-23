package com.JPAejercicios.capitulo3.servicio;

import com.JPAejercicios.capitulo3.entidad.Employee;

import javax.persistence.EntityManager;

public class ServiceEmployee {

    public static void createEmployee(EntityManager entityManager, Employee employee) {
        entityManager.persist(employee);
    }

    public static Employee findById(EntityManager entityManager, int id) {
        return entityManager.find(Employee.class, id);
    }
}
