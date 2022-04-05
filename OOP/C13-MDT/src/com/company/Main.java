package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tanque roboTanque = new Tanque(100);
        roboTanque.Atacar();

        RobotPesado roboPesado = new RobotPesado(150);
        roboPesado.Volar();

        RobotLiviano roboLiviano = new RobotLiviano(200);
        roboLiviano.Defender();

        Seniuelo seniueloCeroUno = new Seniuelo(0);
        seniueloCeroUno.mostrar();

    }
}
