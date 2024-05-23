package com.JPAejercicios.capitulo2;

import com.JPAejercicios.capitulo2.entidad.Planta;
import com.JPAejercicios.capitulo2.servicio.ServicioPlanta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProgramaPlanta {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Planta");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Planta marihuana = ServicioPlanta.crearPlanta(em, "Planta2", "Acelga", "TipoAcelga");
        System.out.println(marihuana);
        List<Planta> plantaList = ServicioPlanta.buscarTodasLasPlantas(em);
        plantaList.forEach(System.out::println);

        ServicioPlanta.cambiarTipo(em, "Planta1", "Tipo2");
        System.out.println("Se ha realizado correctamente el cambio");

        ServicioPlanta.borrarPlanta(em, "Planta2");
        System.out.println("Se ha realizado correctamente el borrado del registro");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}