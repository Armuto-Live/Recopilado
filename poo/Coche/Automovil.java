package com.armutolive.poo.Coche;

public class Automovil {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero,climitizador;

    public void setColor(String colorCoche)
    {
        color=colorCoche;
    }
    public String getColor()
    {
        return "El color del coche es : "+color;
    }

    public Automovil()
    {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        pesoPlataforma=500;

    }
    public String datosGenerales()
    {
        return "la plataforma del vehiculo tiene: "+ruedas+" ruedas"+" .Mide "+largo/1000+
                " metros con un ancho de: "+ancho+"cm y un peso de plataforma de: "+pesoPlataforma+"Kg";
    }

    public void setAsientosCuero(String asientosCuero)
    {
        if (asientosCuero.equalsIgnoreCase("si"))
        {
            this.asientosCuero=true;
        }
        else
        {
            this.asientosCuero=false;
        }
    }
    public String getAsientosCuero()
    {
        if(asientosCuero)
        {
            return "el coche tiene asientos de cuero";
        }
        else
        {
            return "el coche tiene asientos de serie";
        }
    }
    public void setClimitizador(String climitizador)
    {
        if(climitizador.equalsIgnoreCase("si"))
        {
            this.climitizador=true;
        }
        else
        {
            this.climitizador=false;
        }
    }
    public String getClimatizador()
    {
        if(climitizador)
        {
            return "tiene climatizador";
        }
        else
        {
            return "Tiene aire acondicionado";
        }
    }
    public String pesoCoche()
    {
        int pesoCarroceria=500;
        pesoTotal=pesoPlataforma+pesoCarroceria;
        if (asientosCuero==true)
        {
            pesoTotal+=50;
        }
        if (climitizador==true)
        {
            pesoTotal+=pesoTotal+20;
        }
        return "el peso del coche es: "+pesoTotal;
    }
    public int precioCoche()
    {
        int precioFinal=10000;
        if(asientosCuero==true)
        {
            precioFinal+=2000;
        }
        if (climitizador==true)
        {
            precioFinal+=1500;
        }
        return precioFinal;
    }

}
