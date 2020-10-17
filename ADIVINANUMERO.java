package com.armutolive;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.math.*;
public class ADIVINANUMERO
{
    public static void main(String[] args)
    {
        int aleatorio=(int)(Math.random()*100);
        Scanner obj=new Scanner(System.in);

        int numero=0;
        int intentos=0;

        while(numero!=aleatorio)
        {
            System.out.println("Ingrese un numero");
            //numero = proximo entero que introduzcas en la consola
            numero=obj.nextInt();
            if(numero>aleatorio)
            {
                System.out.println("Màs bajo");
            }
            else if(numero<aleatorio)
            {
                System.out.println("Más alto");
            }
            intentos++;
        }
        System.out.println("Son iguales, el número de intentos es : "+intentos);
    }
}
