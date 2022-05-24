package digital.house.flyweight;

import digital.house.flyweight.dto.Arbol;
import digital.house.flyweight.factory.ArbolFactory;

public class Application {
    private static final String colores[]= {"verde", "rojo"};
    public static void main(String[] args) {
        ArbolFactory arbolFactory = new ArbolFactory();
        Arbol arbol1 = arbolFactory.getArbol(200.0,400.0, "verde");
        Arbol arbol2 = arbolFactory.getArbol(500.0, 300.0, "rojo");
        Arbol arbol3 = arbolFactory.getArbol(500.0,300.0, "rojo");

        System.out.println(arbol1.toString());
        System.out.println(arbol2.toString());
        System.out.println(arbol3.toString());



    }

}
