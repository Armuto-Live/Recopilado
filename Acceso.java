package com.armutolive;
import java.lang.String;
import javax.swing.JOptionPane;
public class Acceso
{
    public static void main(String[] args)
    {
        String clave="74285740";
        String Contraseña="";
        while(clave.equals(Contraseña)==false)
        {
            Contraseña=JOptionPane.showInputDialog("Ingrese la contraseña");
            if(clave.equals(Contraseña)==false)
            {
                System.out.println("Error,Vuelva a intentarlo");
            }
        }
        System.out.println("Bienvenido");
    }
}
