package com.JPAejercicios.capitulo4.entidad;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Country.all", query = "SELECT c FROM Country c"),
        @NamedQuery(name = "Country.Region-europa", query = "SELECT c FROM Country c JOIN c.region r WHERE r.regionName = 'Europe'"),
        @NamedQuery(name = "Country.name-ia.Region-3_4", query = "SELECT c FROM Country c WHERE c.region IN (SELECT r FROM Region r WHERE r.regionId BETWEEN 3 AND 4) AND c.countryName LIKE '%ia'"),

})
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @Column(name = "COUNTRY_ID")
    private String countriesId;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region region;

    @Override
    public String toString() {
        return "Country{" +
                "countriesId=" + countriesId +
                ", countryName='" + countryName + '\'' +
                ", region=" + region +
                '}';
    }
}
