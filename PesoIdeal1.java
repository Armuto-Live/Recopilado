package com.armutolive;
import javax.swing.JOptionPane;
import java.awt.*;

public class PesoIdeal1
{
    public static void main(String[] args)
    {
        String genero="";
        do
        {
            genero=JOptionPane.showInputDialog("Ingrese su gènero (H/M)");
        }
        while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Intrroduce tu altura en Cm"));
        int pesoideal=0;
        if(genero.equalsIgnoreCase("H"))
        {
            pesoideal=altura-110;
        }
        else if(genero.equalsIgnoreCase("M"))
        {
            pesoideal=altura-120;
        }
        System.out.println("Tu peso ideal es:"+pesoideal+"Kg");
    }
}
