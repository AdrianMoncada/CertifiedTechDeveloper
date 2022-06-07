import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado pablo = new Empleado("Pablo", "Alarcón", "232425", 3000);
        Empleado paulina = new Empleado("Paulina", "Sanchez", "262728", 3000);

        List<Empleado> meli = new ArrayList<>();

        meli.add(pablo);
        meli.add(paulina);

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
        List<Empleado> meliData = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            meliData = (List<Empleado>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Empleado empleado : meliData) {
            System.out.println(empleado);
        }
    }
}