package com.armutolive;

public class EjercicioBucles {
    public static void main(String[] args)
    {
        //1,2,3,4,5,6,7,8,9,10
        for (int i=1;i<=10;i++)
        {
            if (i!=10)
            {
                System.out.print(i+", ");
            }
            else
            {
                System.out.print(i);
            }
        }
        System.out.println("");
        int i=1;
        while(i<=10)
        {
            if(i!=10)
            {
                System.out.print(i+", ");
            }
            else
            {
                System.out.print(i);
            }
            i++;
        }
        System.out.println("");
        i=1;
        do
            {
                if(i!=10)
                {
                    System.out.print(i+", ");
                }
                else
                {
                    System.out.print(i);
                }
                i++;
            }
        while(i<=10);
        System.out.println("");
        System.out.println("");



        //1,99,2,98,3,97,4,96,5,95
        int j=99;
        for (i=1;i<=5;i++)
        {
            if (j>=95 && j!=95)
            {
                System.out.print(i+","+j+",");
            }
            else
            {
                System.out.print(i+","+j);
            }
            j--;
        }

        System.out.println("");
        i=1;
        j=99;
        while(i<=5)
        {
            if (j>=95 && j!=95)
            {
                System.out.print(i+","+j+",");
            }
            else
            {
                System.out.print(i+","+j);
            }
            i++;
            j--;
        }

        System.out.println("");
        i=1;
        j=99;
        do {
            if(j>=95 && j!=95)
            {
                System.out.print(i+","+j+",");
            }
            else
            {
                System.out.print(i+","+j);
            }
            i++;
            j--;
        }while(i<=5);

        System.out.println("");
        System.out.println("");

        //0,1,1,2,3,5,8,13,21,34
        int a=0, b=1,c=0;
        for (i=0;i<10;i++)
        {
            if(i<9)
            {
                System.out.print(a+",");
                c=a+b;
                a=b;
                b=c;
            }
            else
            {
                System.out.print(a);
            }
        }
        System.out.println("");
        i=0;
        a=0;
        b=1;
        c=0;
        while(i<=9)
        {
            if(i<9)
            {
                System.out.print(a+",");
            }
            else
            {
                System.out.print(a);
            }
            c=a+b;
            a=b;
            b=c;
            i++;
        }

        System.out.println("");
        i=0;
        a=0;
        b=1;
        c=0;
        do {
            if (i<9)
            {
                System.out.print(a+",");
            }
            else
            {
                System.out.print(a);
            }
            c=a+b;
            a=b;
            b=c;
            i++;
        }while(i<=9);
    }
}
