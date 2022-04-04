package com.company;

public class Main {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Romi", "vilatta", 100456);
        Alumno alumno2 = new Alumno("Pepe", "Montenegro", 182975);

        Parcial parcial1 = new Parcial(alumno1, "vfudgydf", "dfkjvhdfvh", 2, 3, 4);
        Parcial parcial2 = new Parcial(alumno2, "vfudgydf", "dfkjvhdfvh", 6, 2, 1);

        parcial1.seguirRecuperando();
        parcial2.seguirRecuperando();

       Final final1 = new Final(alumno1, "sjfhkjdhfk", "ljdhlh", 6, 4, "tema 1");
        Final final2 = new Final(alumno2, "sjfhkjdhfk", "ljdhlh", 6, 2, "tema 1");
        final1.estaAprobado();
        final2.estaAprobado();


    }}
