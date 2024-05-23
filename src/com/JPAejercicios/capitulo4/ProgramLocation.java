package com.JPAejercicios.capitulo4;

import com.JPAejercicios.capitulo4.entidad.Country;
import com.JPAejercicios.capitulo4.entidad.Region;
import com.JPAejercicios.capitulo4.service.ServiceCountry;
import com.JPAejercicios.capitulo4.service.ServiceRegion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class ProgramLocation {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Location");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        List<Region> regionList = ServiceRegion.getAll(entityManager);
        for (Region r : regionList)
            System.out.println(r.toString());

        List<Country> countryList = ServiceCountry.getAll(entityManager);
        for (Country c: countryList)
            System.out.println(c.toString());


        List<Country> europeCountyList = ServiceCountry.getCountryListOfEurope(entityManager);
        for (Country ec: europeCountyList)
            System.out.println(ec.toString());

        countryList.clear();

        countryList = ServiceCountry.getCountrySufix_iaAndRegionBetween3_4(entityManager);
        for (Country c: countryList)
            System.out.println(c.toString());

        List<Object[]> regionsListCount5 = ServiceRegion.getRegionBetween1_3AndCountryCountBiggerThan5(entityManager);
        for (Object[] rlc5 : regionsListCount5)
            System.out.println(Arrays.toString(rlc5));


        //CREATE SOLAR SYSTEM
        ServiceRegion.createSolarSystem(entityManager);
        entityManager.getTransaction().commit();
    }
}
