package com.armutolive;
import java.util.Scanner;
public class Bidimensional {
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        int fila=0;
        int columna=0;
        int contador=1;
        System.out.println("¿De cuantas filas quiere la matriz?");
        fila=obj.nextInt();
        System.out.println("De cuantas columnas quiere la matriz?");
        columna=obj.nextInt();
        int matriz[][]= new int[fila][columna];
        int Valori=0,Valorj=0;

        for (int i=0;i<fila;i++)
        {
            /*System.out.print("Ingrese el valor de la fila #"+(i+1)+":");
            Valori=obj.nextInt();*/
            for (int j=0;j<columna;j++)
            {
                matriz[i][j]=contador;
                contador++;
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
