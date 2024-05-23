package com.JPAejercicios.capitulo4.entidad;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Regions.all", query = "SELECT r FROM Region r"),
        @NamedQuery(name = "Regions.3_4.countCountry", query = "SELECT  r.regionId, r.regionName, count(c) FROM Country c LEFT JOIN c.region r WHERE r.regionId BETWEEN 1 AND 3 GROUP BY r.regionId, r.regionName HAVING COUNT(c) > 5")
})
@Table(name = "REGIONS")
public class Region {
    @Id
    @Column(name = "REGION_ID")
    private int regionId;

    @Column(name = "REGION_NAME")
    private String regionName;

    @OneToMany(mappedBy = "region")
    private List<Country> countryList;

    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionId +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}
