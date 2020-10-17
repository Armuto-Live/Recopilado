package com.babas.devel.main;
import com.babas.devel.cartelera.Cartelera;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cartelera cartelera = new Cartelera();
//         cartelera.agregarPelicula(200, "Fredy Kruger", "Terror de sueños", "Terror", 4, "1997", "None");
//         cartelera.agregarPelicula("Fredy Kruger vs Jason", "Jason le saca ... a Fredy", "Terror", 5, "1998", "None");
//         cartelera.listarPeliculas();
//         cartelera.buscarGenero("Terror");
        Scanner cin = new Scanner(System.in);
        int id = 0, estrella=0;
        String nombre="", descripcion="", genero="", ano="", autor="";
        byte tama = 10;
        boolean estado = true;
        do {
            menu();
            byte o = cin.nextByte();
            switch(o) {
                case 1:
                    if (tama==0) {
                        System.out.println("Ya existe 10 peliculas");
                    } else {
                        
                        if (tama==10) {
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la película"));
                        }
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la película");
                        
                        descripcion = JOptionPane.showInputDialog("Ingrese una descripción para la película");
                        
                        genero = JOptionPane.showInputDialog("Ingrese un genero para la película");
                        
                        estrella = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un estrella para la película"));
                        
                        ano = JOptionPane.showInputDialog("Ingrese un genero para la película");
                        
                        autor = JOptionPane.showInputDialog("Ingrese el autor de la película");
                        
                        if (tama==10) {
                            cartelera.agregarPelicula(id, nombre, descripcion, genero, estrella, ano, autor);
                        } else {
                            cartelera.agregarPelicula(nombre, descripcion, genero, estrella, ano, autor);
                        }
                        tama--;
                    }
                    
                    break;
                    
                case 2:
                    System.out.print("Ingrese el nombre de la pelicula que desea consultar : ");
                    cartelera.buscarNombre(cin.next());
                    break;
                    
                case 3:
                    System.out.print("Ingrese el genero que desea consultar : ");
                    cartelera.buscarGenero(cin.next());
                    break;
                    
                case 4:
                    cartelera.listarPeliculas();
                    break;
                    
                case 5:
                    estado=false;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    
            }
            
        } while(estado);
    }
    public static void menu() {
        System.out.println("1. Registrar una pelicula.");
        System.out.println("2. Buscar película por nombre.");
        System.out.println("3. Buscar película por genero.");
        System.out.println("4. Listar películas.");
        System.out.println("5. Salir.");
        System.out.print("Ingrese una opción -> ");
        
    }
}
