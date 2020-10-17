package com.armutolive.poo;

public class PRUEBA {
    public static void main(String[] args)
    {
        Empleados trabajador1=new Empleados("Angel");
        Empleados trabajador2=new Empleados("Quispe");
        trabajador1.setSeccion("Agenda");
        System.out.println(trabajador1.devolverDatos());
        System.out.println(trabajador2.devolverDatos());
    }
}
class Empleados
{
    private final String  nombre;
    private String seccion;

    public Empleados(String nombre)
    {
        this.nombre=nombre;
        this.seccion="Administración";
    }
    public void setSeccion(String seccion)
    {
        this.seccion=seccion;
    }
    public String devolverDatos()
    {
        return "Nombre: "+nombre+" y Seccion: "+seccion;
    }
}