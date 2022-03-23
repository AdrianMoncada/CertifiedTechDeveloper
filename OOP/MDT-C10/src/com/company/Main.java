package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Nave NaveNodriza = new Nave(102 ,104, "North");

        NaveNodriza.irA(111,101,"South");

        Asteroide Vesta4 = new Asteroide(140,134,"North",1004);

        Vesta4.irA(111,101,"South");

    }
}
