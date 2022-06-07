import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado pablo = new Empleado("Pablo", "Alarcón", "232425", 3000);
        Empleado paulina = new Empleado("Paulina", "Sanchez", "262728", 3000);

        Empresa meli = new Empresa("24252627", "Mercado Libre SRL");
        meli.addEmpleado(pablo);
        meli.addEmpleado(paulina);
        /*List<Empleado> meli = new ArrayList<>();*/

        /*meli.add(pablo);
        meli.add(paulina);*/

        FileOutputStream fo;
        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);
            dos.writeObject(meli);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Empresa meliData = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            meliData = (Empresa) ois.readObject();
            /*meliData = (List<Empleado>) ois.readObject();*/
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(meliData.getEmpleados());
        try {
            PrintWriter out = new PrintWriter("filename.txt");
            out.println(meli.imprimirEmpleado());
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}