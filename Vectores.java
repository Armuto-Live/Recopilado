package com.armutolive;
import javax.swing.*;
import java.util.Scanner;
public class Vectores {
    public static void main (String[] args)
    {
        /*int numeros[] =new int[5];
        numeros[0]=4;
        numeros[1]=1;
        numeros[2]=44;
        numeros[3]=54;
        numeros[4]=12;
        System.out.print("["+numeros[0]+"]");
        System.out.print("["+numeros[1]+"]");
        System.out.print("["+numeros[2]+"]");
        System.out.print("["+numeros[3]+"]");
        System.out.print("["+numeros[4]+"]");*/


        /*Scanner obj=new Scanner(System.in);
        int longitud=0;
        System.out.println("Cual es la longitud del vector?");
        longitud=obj.nextInt();

        int numeros[]=new int[longitud];
        for(int i=0;i<numeros.length;i++)
        {
            System.out.println("ingrese el valor #"+(i+1));
            numeros[i]=obj.nextInt();
        }
        for (int i=0;i<numeros.length;i++)
        {
            System.out.print("["+numeros[i]+"]");
        }*/

        int longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector"));
        int numeros[]=new int[longitud];
        for(int i=0;i<numeros.length;i++)
        {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor #"+(i+1)));
        }
        for(int i=0;i<numeros.length;i++)
        {
            System.out.print("["+numeros[i]+"]");
        }
    }
}
