package com.armutolive;
import java.util.Scanner;
public class Switch {
    public static  void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int num1,num2=0,operacion=0,seleccion=0;
        System.out.println("************");
        System.out.println("*BIENVENIDO*");
        System.out.println("************");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese el valor del primer dato");
        num1=obj.nextInt();
        System.out.println("Ingrese el valor del segundo dato");
        num2=obj.nextInt();
        System.out.println("1.Suma 2.Resta 3.Multiplicación 4.Divisiòn");
        seleccion=obj.nextInt();
        switch (seleccion)
        {
            case 1:
                operacion=num1+num2;
                System.out.println("La suma es:"+operacion);
                break;
            case 2:
                operacion=num1-num2;
                System.out.println("la resta es:"+operacion);
                break;
            case 3:
                operacion=num1*num2;
                System.out.println("La multiplicacion es:"+operacion);
                break;
            case 4:
                operacion=num1*num2;
                System.out.println("la divisiòn es:"+operacion);
                break;
            default:
                System.out.println("Nel pastel");
                break;
        }
    }
}
