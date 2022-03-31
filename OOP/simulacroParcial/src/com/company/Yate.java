package com.company;

public class Yate extends embarcacion implements Vendible, Comparable{
    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Integer eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public void vender() {
        System.out.println("Este yate se puede vender");
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate y = (Yate) o;

        if(this.cantidadCamarotes > y.getCantidadCamarotes()){
            System.out.println("Es más grande");
            return 1;
        }
        else if(this.cantidadCamarotes < y.getCantidadCamarotes()){
            System.out.println("Es más pequeño");
            return -1;
        }
        System.out.println("Son iguales");
        return 0;
    }
}
