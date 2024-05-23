package com.JPAejercicios.capitulo4.service;

import com.JPAejercicios.capitulo4.entidad.Region;

import javax.persistence.EntityManager;
import java.util.List;

public class ServiceRegion {
    public static List<Region> getAll(EntityManager em) {
        return em.createNamedQuery("Regions.all", Region.class).getResultList();
    }

    public static List<Object[]> getRegionBetween1_3AndCountryCountBiggerThan5(EntityManager em) {
        return em.createNamedQuery("Regions.3_4.countCountry", Object[].class).getResultList();
    }

    public static void createSolarSystem(EntityManager em) {
        em.createNativeQuery("INSERT INTO regions (region_id, region_name) VALUES (?,?)")
                .setParameter(1, 5)
                .setParameter(2, "Solar Systemn")
                .executeUpdate();
    }
}
