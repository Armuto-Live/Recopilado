package com.armutolive.poo.Coche;
import com.armutolive.poo.Coche.Automovil;

import javax.swing.JOptionPane;

public class Main {
    public static void  main(String[] args)
    {
        Automovil micoche=new Automovil();

        micoche.setColor(JOptionPane.showInputDialog("INGRESA EL COLOR"));

        System.out.println(micoche.datosGenerales());
        System.out.println(micoche.getColor());
        micoche.setAsientosCuero(JOptionPane.showInputDialog("Tiene asientos de cuero?: "));
        System.out.println(micoche.getAsientosCuero());
        micoche.setClimitizador(JOptionPane.showInputDialog("Tiene climatizador?: "));
        System.out.println(micoche.getClimatizador());
        System.out.println(micoche.pesoCoche());
        System.out.println("El precio del coche es :"+micoche.precioCoche());
    }
}
