package com.company;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo){
        switch (codigo){
            case "FRONTEND" :
                return new Curso("Front end","casi que soy programar",16.0,2.0,1000.0);
            case "BACKEND" :
                return new Curso("Back end","soy programar",20.0,2.0,900.0);
            case "FULLSTACK" :
                ProgramaIntensivo fullStack = new ProgramaIntensivo("FullStack","algo",0.2);
                fullStack.agregarOfertaAcademica(generarOfertaAcademica("FRONTEND"));
                fullStack.agregarOfertaAcademica(generarOfertaAcademica("BACKEND"));
                return fullStack;
        }
        return null;
    }
}
