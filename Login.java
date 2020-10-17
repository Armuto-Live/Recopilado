package com.armutolive;
import javax.swing.JOptionPane;
import java.awt.*;

public class Login {
    public static void main(String[] args)
    {
        /*String PrimerNombre=JOptionPane.showInputDialog("Ingrese el primer nombre");
        String SegundoNombre=JOptionPane.showInputDialog("Ingrese el segundo nombre");
        if(PrimerNombre.equals(SegundoNombre))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son diferentes");
        }*/

        String Usuario=JOptionPane.showInputDialog("Nombre de Usuario");
        String Contraseña=JOptionPane.showInputDialog("Contraseña de Usuario");
        if(Usuario.equals("Armuto") && Contraseña.equals("ArmutoLive"))
        {
            System.out.println("Son correctos");
        }
        else
        {
            System.out.println("Incorrecto");
        }
    }
}
