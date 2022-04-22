public class Main {
    public static void main(String[] args) {
        ArchivoTexto biblia = new ArchivoTexto("Biblia");
        ArchivoVideo catDancing = new ArchivoVideo("Cat Dancing");
        ArchivoTexto parcialPdf = new ArchivoTexto("Parchial PDF");
        ArchivoVideo dogEatingCereal = new ArchivoVideo("Dog Eating Cereal");
        ArchivoVideo cortometraje = new ArchivoVideo("Cortometraje 2022");

        ArchivoCarpetaComposite carpetaUno = new ArchivoCarpetaComposite("Carpeta Uno");

        carpetaUno.addArchivo(biblia);
        carpetaUno.addArchivo(catDancing);
        carpetaUno.addArchivo(parcialPdf);
        carpetaUno.addArchivo(dogEatingCereal);
        carpetaUno.addArchivo(cortometraje);

        carpetaUno.getNombre();
    }
}