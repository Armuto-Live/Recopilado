package com.armutolive;

public class condicionAnidada
{
    public static  void main(String[] args)
    {
        byte operacion=0, num1=8,num2=4;
        int resultado=0;
        if(operacion==1)
        {
            resultado=num1+num2;
            System.out.println("el resultado de la operacion es : "+resultado);
        }
        else if(operacion==2)
        {
            resultado=num1-num2;
            System.out.println("el resultado de la operacion es : "+resultado);
        }
        else if(operacion==3)
        {
            resultado=num1*num2;
            System.out.println("el resultado de la operacion es : "+resultado);
        }
        else if(operacion==4)
        {
            resultado=num1/num2;
            System.out.println("el resultado de la operacion es : "+resultado);
        }
        else
        {
            System.out.println("pirate raton");
        }
    }
}
