import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("lolo","BUlldog", 2,"Direccion 1");
        Perro p2 = new Perro("pedro","dogo", 2,"Direccion 2");
        Perro p3 = new Perro("maguie","mestizo", 2,"Direccion 3");

        ArrayList<Perro> lunes = new ArrayList<>();
        ArrayList<Perro> martes = new ArrayList<>();
        ArrayList<Perro> miercoles = new ArrayList<>();
        ArrayList<Perro> jueves = new ArrayList<>();
        ArrayList<Perro> viernes = new ArrayList<>();

        lunes.add(p1);
        miercoles.add(p1);
        viernes.add(p1);

        lunes.add(p2);
        martes.add(p2);
        miercoles.add(p2);
        jueves.add(p2);

        miercoles.add(p3);
        jueves.add(p3);
        viernes.add(p3);


        try {
            FileOutputStream fil = new FileOutputStream("perros.dat");
            ObjectOutputStream archi = new ObjectOutputStream(fil);

            archi.writeObject(lunes);
            archi.writeObject(martes);
            archi.writeObject(miercoles);
            archi.writeObject(jueves);
            archi.writeObject(viernes);

            archi.close();

            FileInputStream fillIn = new FileInputStream("perros.dat");
            ObjectInputStream archiIn = new ObjectInputStream(fillIn);

            ArrayList<Perro> dia;

            for(int i = 0; i < 5; i++) {
                System.out.println("Dia" + i);
                dia = (ArrayList<Perro>) archiIn.readObject();

                for (Perro p : dia) {
                    System.out.println(p);
                }
            }

            archiIn.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}