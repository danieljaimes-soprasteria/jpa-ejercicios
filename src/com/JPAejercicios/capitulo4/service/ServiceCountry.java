package com.JPAejercicios.capitulo4.service;

import com.JPAejercicios.capitulo4.entidad.Country;

import javax.persistence.EntityManager;
import java.util.List;

public class ServiceCountry {
    public static List<Country> getAll(EntityManager em){
        return em.createNamedQuery("Country.all", Country.class).getResultList();
    }

    public static List<Country> getCountryListOfEurope(EntityManager em){
        return em.createNamedQuery("Country.Region-europa", Country.class).getResultList();
    }

    public static List<Country> getCountrySufix_iaAndRegionBetween3_4(EntityManager em){
        return em.createNamedQuery("Country.name-ia.Region-3_4", Country.class).getResultList();
    }
}
