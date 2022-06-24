package com.example.tecnico.modelo;

import javax.persistence.*;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @SequenceGenerator(name = "tecnico_sequence", sequenceName = "tecnico_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tecnico_sequence")
    /*@GeneratedValue(strategy = GenerationType.AUTO)*/
    private Long id;
    private String nombre;
    private String equipo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    public Jugador() {

    }

    public Jugador(String nombre, String equipo, Tecnico tecnico) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.tecnico = tecnico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
