package com.JPAejercicios.capitulo1.servicio;

import com.JPAejercicios.capitulo1.entidad.Planta;

import javax.persistence.EntityManager;
import java.util.List;

public class ServicioPlanta {
    public static Planta crearPlanta(EntityManager em, String id, String nombre, String tipo) {
        Planta p = new Planta(id, nombre, tipo);
        em.persist(p);
        return p;
    }

    public static Planta buscarPlanta(EntityManager em, String id) {
        return em.find(Planta.class, id);
    }

    public static List<Planta> buscarTodasLasPlantas(EntityManager em) {
        List<Planta> plantaList = em.createQuery("Select a From Planta a", Planta.class).getResultList();
        return plantaList;
    }


    public static boolean borrarPlanta(EntityManager em, String id) {
        Planta p = em.find(Planta.class, id);
        if (p != null) {
            em.remove(p);
            return true;
        }
        return false;
    }

    public static void cambiarTipo(EntityManager em, String id, String tipo){
        Planta p = em.find(Planta.class, id);
        p.setTipo(tipo);
        em.persist(p);
    }
}
