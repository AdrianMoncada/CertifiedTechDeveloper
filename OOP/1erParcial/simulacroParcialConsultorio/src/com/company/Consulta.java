package com.company;

public class Consulta {
    private String fechaCOnsulta;
    private String especialidad;
    private Integer hora;
    private Integer minuto;

    public Consulta(String fechaCOnsulta, String especialidad, Integer hora, Integer minuto) {
        this.fechaCOnsulta = fechaCOnsulta;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }
}
