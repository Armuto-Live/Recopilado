package com.armutolive;

public class Vectores2
{
    public static void main (String[] args)
    {
        int PrimeraFila[]=new int[2];
        int SegundaFila[]=new int[2];
        PrimeraFila[0]=5;
        PrimeraFila[1]=2;
        SegundaFila[0]=2;
        SegundaFila[1]=5;
        System.out.print("["+PrimeraFila[0]+"]");
        System.out.println("["+PrimeraFila[1]+"]");
        System.out.print("["+PrimeraFila[0]+"]");
        System.out.println("["+PrimeraFila[1]+"]");
        System.out.println("--------------------------------------------");

        for(int i=0;i<PrimeraFila.length;i++)
        {
            if (i==0)
            {
                PrimeraFila[0]=5;
            }
            else
            {
                PrimeraFila[1]=2;
            }
            System.out.print("["+PrimeraFila[i]+"]");
        }
        System.out.println("");
        for (int j=0;j<SegundaFila.length;j++)
        {
            if (j==0)
            {
                PrimeraFila[0]=2;
            }
            else
            {
                PrimeraFila[1]=5;
            }
            System.out.print("["+PrimeraFila[j]+"]");
        }

        System.out.println("");
        System.out.println("------------------------------------------");
        int numeros [][]=new int[2][2];
        numeros[0][0]=5;
        numeros[0][1]=2;
        numeros[1][0]=2;
        numeros[1][1]=5;

        System.out.print("["+numeros[0][0]+"]");
        System.out.println("["+numeros[0][1]+"]");
        System.out.print("["+numeros[1][0]+"]");
        System.out.print("["+numeros[1][1]+"]");



    }
}
