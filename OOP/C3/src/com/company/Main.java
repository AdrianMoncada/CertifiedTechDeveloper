package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        jugar();

    }

    public static Integer cualGana(String eleccionUno, String eleccionDos){
        String opcionUno = "piedra";
        String opcionDos = "papel";
        String opcionTres = "tijera";
        String opcionCuatro = "spock";

        if(eleccionUno.equals(opcionUno) && eleccionDos.equals(opcionTres) || eleccionUno.equals(opcionDos) && eleccionDos.equals(opcionUno)
                || eleccionUno.equals(opcionTres) && eleccionDos.equals(opcionDos)) || eleccionUno.equals(opcionCuatro) && eleccionDos.equals(opcionTres)
                || eleccionUno.equals(opcionCuatro) && eleccionDos.equals(opcionUno){
            System.out.println("Jugador 1 gana!");
            return 1;
        } else if(eleccionUno.equals(opcionUno) && eleccionDos.equals(opcionDos) || eleccionUno.equals(opcionDos) && eleccionDos.equals(opcionTres)
                || eleccionUno.equals(opcionTres) && eleccionDos.equals(opcionUno)) || eleccionUno.equals(opcionCuatro) && eleccionDos.equals(opcionDos){
            System.out.println("Jugador 2 gana!");
            return 2;
        } else{
            System.out.println("Empate!");
            return 0;
        }
    }
    public static void jugar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Jugador Uno: ");
        String JugadorUno = scan.nextLine();

        System.out.println("Jugador Dos: ");
        String JugadorDos = scan.nextLine();
        int contadorUno = 0;
        int contadorDos = 0;
        while(true){


            System.out.println("¿Piedra, papel, tijera o spock?: ");
            String eleccionJugadorUno = scan.nextLine();

            System.out.println("¿Piedra, papel, tijera o spock?: ");
            String eleccionJugadorDos = scan.nextLine();

            if(eleccionJugadorUno.contains("*") || eleccionJugadorDos.contains("*")){
                System.out.println("Uno de los jugadores no quiere jugar más!");
                System.out.println("Puntuación \n" + JugadorUno + ": " + contadorUno + "\n" + JugadorDos + ": " + contadorDos);
                break;
            }
            int ganador = cualGana(eleccionJugadorUno, eleccionJugadorDos);
            if(ganador == 1){
                System.out.println("+1");
                contadorUno++;
            } else if(ganador == 2){
                System.out.println("+1");
                contadorDos++;
            }
        }
    }
}
