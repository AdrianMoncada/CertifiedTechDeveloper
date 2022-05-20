public class SerieProxy implements ISerie{
    private int cantVistas;
    private Serie serie;

    public SerieProxy(Serie serie) {
        this.serie = serie;
        this.cantVistas = 0;
    }

    @Override
    public String getSerie(String serie) throws SerieNoHabilitadaException{
        if(this.cantVistas >= 5){
            throw new SerieNoHabilitadaException("Ha superado la cantidad de reproducciones permitidas");
        }
        this.cantVistas++;
        return this.serie.getSerie(serie);
    }

    public int getCantVistas() {
        return cantVistas;
    }
}
