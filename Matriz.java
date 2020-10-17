package com.armutolive;

import java.util.Random;

public class Matriz {
    public static void  main(String[] args)
    {
        /*int[] matriz=new int[5];
        matriz[0]=2;
        matriz[1]=2;
        matriz[2]=2;
        matriz[3]=2;
        matriz[4]=2;
        for (int i=0;i<5;i++)
        {
            System.out.println(matriz[i]);
        }
        String[] paises=new String[8];
        paises[0]="Peru";
        paises[1]="Bolivia";
        paises[2]="Colombia";
        paises[3]="Mexico";
        paises[4]="brasil";
        paises[5]="Argentina";
        paises[6]="Chile";
        paises[7]="uruguay";
        for(int i=0;i<paises.length;i++)
        {
            System.out.println(paises[i]);
        }
        System.out.println("**********************");
        for (String elemento:paises)
        {
            System.out.println(elemento);
        } */

        int[] random=new int[150];
        for(int i=0;i<random.length;i++)
        {
            random[i]=(int)(Math.round(Math.random()*100+1));
            System.out.println("numero "+(i+1)+" :"+random[i]);
        }
    }
}
