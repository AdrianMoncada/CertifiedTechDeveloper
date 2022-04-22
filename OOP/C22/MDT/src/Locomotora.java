import java.util.ArrayList;
import java.util.List;

public class Locomotora implements Figura{
    private List<Figura> figuras;

    public Locomotora() {
        this.figuras = new ArrayList<>();
    }


    @Override
    public Double calcularArea() {
        Double areaTotal = 0.0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        System.out.println("El área total es de: " + areaTotal);
        return areaTotal;
    }

    public void addFigura(Figura figura){
        figuras.add(figura);
    }

    public void removeFigura(Figura figura){
        figuras.remove(figura);
    }
}
