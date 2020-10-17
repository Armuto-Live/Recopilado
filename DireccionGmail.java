package com.armutolive;
import javax.swing.JOptionPane;
import java.awt.*;

public class DireccionGmail
{
    public static void main(String[] args)
    {
        boolean arroba=false;
        String mail=JOptionPane.showInputDialog("Ingrese su correo electronico");
        for(int i=0;i<mail.length();i++)
        {
            if(mail.charAt(i)=='@')
            {
                arroba=true;
            }
        }
        if(arroba==true)
        {
            System.out.println("El mail es correcto");
        }
        else
        {
            System.out.println("El mail no es correcto");
        }

    }
}
