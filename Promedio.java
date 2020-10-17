package com.armutolive;

public class Promedio {
    public static void main(String[] args) {
        byte matematica = 5, biologia = 8, quimica = 7;
        float promedio = 0;
        promedio = (float) ((matematica + biologia + quimica) / 3);
        if (promedio >= 6) {
            System.out.println("Aprobado con:" +promedio);
        }
        else{
            System.out.println("Desaprobado con: "+promedio);
        }
    }
}
