package com.armutolive;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ManipulacionCadenas
{
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);

        String caracter = "";
        int desde=0,hasta=0;

        System.out.println("Ingrese el caracter deseado");
        caracter=obj.nextLine();

        System.out.println("la cantidad de caracteres que posse "+caracter+"es: "+caracter.length());

        System.out.println("¿desde que parte de la cadena desea obtener?");
        desde=obj.nextInt();

        System.out.println("hasta que parte de la cadena desea obtener");
        hasta=obj.nextInt();

        System.out.println("La cadena es : "+caracter.substring(desde,hasta));
    }
}
