package com.armutolive;
import java.util.Scanner;
import java.lang.String;
import javax.swing.JOptionPane;
public class CocaColaCompany {
    public static void main(String[] args)
    {
        //Scanner obj=new Scanner(System.in);
        String nombre="";
        int clave=0;
        int antiguedad=0;
        System.out.println("**************************************************************");
        System.out.println("*Bienvenido a nuestro sistema Vacacional de Coca-Cola Company*");
        System.out.println("**************************************************************");

        System.out.println("");
        System.out.println("");
        //System.out.println("¿Cuál es su nombre?");
        //nombre=obj.nextLine();
        nombre=JOptionPane.showInputDialog("¿Cuàl es su nombre?");
        antiguedad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años de antiguedad tiene?"));
        clave=Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de departamento"));
        if(clave==1)
        {
            if(antiguedad==1)
            {
                System.out.println(nombre+",tiene vacaciones de 6 dias");
            }
            else if(antiguedad>=2 && antiguedad<=6)
            {
                System.out.println(nombre+" ,tiene vacaciones de 14 dias");
            }
            else if(antiguedad==7)
            {
                System.out.println(nombre+" tiene vacaciones de 20 dias");
            }
            else
            {
                System.out.println(nombre+" Aùn no tiene derecho de vacaciones");
            }
        }
        else if(clave==2)
        {
         if (antiguedad==1)
         {
             System.out.println(nombre+" tiene vacaciones de 7 dias");
         }
         else if (antiguedad >=2 && antiguedad<=6)
         {
             System.out.println(nombre+" Tiene vacaciones de 15 días");
         }
         else if (antiguedad==7)
         {
             System.out.println(nombre+" Tiene vacaciones de 22 dias");
         }
         else
         {
             System.out.println(nombre+" Aun no tiene vacaciones :(");
         }
        }
        else if (clave==3)
        {
            if (antiguedad==1)
            {
                System.out.println(nombre+" Tienes vacaciones de 10 dias");
            }
            else if (antiguedad==2 && antiguedad==6)
            {
                System.out.println(nombre+" Tiene vacaciones de 20 dias");
            }
            else if (antiguedad==7)
            {
                System.out.println(nombre+" Tiene vacaciones de 30 dias");
            }
            else
            {
                System.out.println(nombre+" Aún no tiene derecho de vacaciones :(");
            }
        }
        else
        {
            System.out.println("Error,la Clave de departamento no existe");
        }
    }
}
