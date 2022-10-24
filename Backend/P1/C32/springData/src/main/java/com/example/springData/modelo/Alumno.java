package com.example.springData.modelo;

import javax.persistence.*;

@Entity
@Table
public class Alumno {
    @Id
    @SequenceGenerator(name = "alumno_sequence", sequenceName = "alumno_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_sequence")

    private Long id;
    private String nombre;
    private String edad;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "escuela_id")
    private Escuela escuela;

    public Alumno() {
    }

    public Alumno(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
