public class Main {
    public static void main(String[] args) throws SerieNoHabilitadaException {
    Serie gameOfThrones = new Serie();
    ISerie proxySerie = new SerieProxy(gameOfThrones);
        System.out.println(proxySerie.getSerie("Game of Thrones"));
        System.out.println(proxySerie.getSerie("Game of Thrones"));
        System.out.println(proxySerie.getSerie("Game of Thrones"));
        System.out.println(proxySerie.getSerie("Game of Thrones"));
        System.out.println(proxySerie.getSerie("Game of Thrones"));

        System.out.println(proxySerie.getSerie("Game of Thrones"));

    }
}