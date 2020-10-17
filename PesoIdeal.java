package com.armutolive;
import java.util.Scanner;
public class PesoIdeal
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        int Estatura=0;
        int PesoIdeal=0;
            System.out.println("¿Què genero es?: \n1)Mujer \n2)Varon");
            byte genero=obj.nextByte();
            switch (genero)
            {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Error,Vuelve a intentarlo");
            }
        do
        {
            System.out.println("ingrese su estatura en centímetros: ");
            Estatura=obj.nextInt();
            if (Estatura>0 && Estatura<=220)
            {
                if(genero==1)
                {
                    PesoIdeal=(Estatura-120);
                }
                else if(genero==2)
                {
                    PesoIdeal = (Estatura - 110);
                }
                System.out.println("Su peso ideal es: "+PesoIdeal);
            }
            else
                System.out.println("La estatura ingresada es incorrecta, vuelve a intentarlo");
        }
        while(PesoIdeal!=Estatura);
    }
}
