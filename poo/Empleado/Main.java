package com.armutolive.poo.Empleado;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Empleado
{
    public  Empleado(String nombre,double sueldo,int año,int mes,int dia)
    {
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(año,mes-1,dia);
        altaContrato=calendario.getTime();
    }
    public String getNombre()
    {
        return nombre;
    }
    public double getSueldo()
    {
        return sueldo;
    }
    public Date getAltaContrato()
    {
        return altaContrato;
    }
    public void subeSueldo(double porcentaje)
    {
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int mesAlta;
    private int dia;
}
public class Main {
    public static void main(String[] args)
    {
        /*Empleado obj=new Empleado("Armuto",200,2019,3,19);
        Empleado empleado2=new Empleado("Quispe",500,2020,05,12);
        Empleado empleado3=new Empleado("Juanito",900,2021,07,11);
        obj.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre: "+obj.getNombre()+" ,Tu sueldo es: "+obj.getSueldo()+" ,Fecha de alta: "+obj.getAltaContrato());
        System.out.println("Nombre: "+empleado2.getNombre()+" ,Tu sueldo es: "+empleado2.getSueldo()+" ,Fecha de alta: "+empleado2.getAltaContrato());
        System.out.println("Nombre: "+empleado3.getNombre()+" ,Tu sueldo es: "+empleado3.getSueldo()+" ,Fecha de alta: "+empleado3.getAltaContrato());
        */

        Empleado[] misEmpleados=new Empleado[3];
        misEmpleados[0]=new Empleado("Armuto",500,2001,3,19);
        misEmpleados[1]=new Empleado("Quispe",900,1999,4,5);
        misEmpleados[2]=new Empleado("Juanito",900,2021,7,11);

        /*for (int i=0;i<misEmpleados.length;i++)
        {
            misEmpleados[i].subeSueldo(5);

        }
        for (int i=0;i<misEmpleados.length;i++)
        {
            System.out.println("Nombre: "+misEmpleados[i].getNombre()+
                    " ,Sueldo:"+misEmpleados[i].getSueldo()+"FechaAlta:"+misEmpleados[i].getAltaContrato());
        }*/

        for (Empleado e:misEmpleados)
        {
            e.subeSueldo(5);
        }
        for (Empleado e:misEmpleados)
        {
            System.out.println("Nombre: "+e.getNombre()+
                    " ,Sueldo:"+e.getSueldo()+"FechaAlta:"+e.getAltaContrato());
        }
    }
}
