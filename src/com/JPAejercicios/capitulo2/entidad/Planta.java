package com.JPAejercicios.capitulo2.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@Entity
@NamedQueries({@NamedQuery(name = "Planta.nombre", query = "SELECT p.nombre FROM Planta p"),})
public class Planta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nombre;
    private String tipo;

    public Planta(String id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Planta() {

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
