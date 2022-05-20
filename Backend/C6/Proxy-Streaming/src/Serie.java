public class Serie implements ISerie{

    @Override
    public String getSerie(String serie) {
        return "www." + removeWhitespace(serie) + ".com";
    }

    public static String removeWhitespace(String s) {
        return s.replaceAll("\\s", ""); // use regex
    }
}
