package com.company;

import java.util.List;
import java.util.ArrayList;

public class Puerto {

    private List<Contenedor> contenedores;

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void agregarContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenados() {
        contenedores.sort(null);
        for (Contenedor contenedor : contenedores) {
            System.out.println(contenedor);
        }
    }

    public Integer cantidadContenedoresPeligrosos() {
        Integer contador = 0;
        for (Contenedor contenedor : contenedores) {
            if (contenedor.getProcedencia() == "Desconocida" && contenedor.getMaterialPeligroso() == true) {
                contador++;
            }
        }
        return contador;
    }
}
