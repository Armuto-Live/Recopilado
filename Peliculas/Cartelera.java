package com.babas.devel.cartelera;
import com.babas.devel.pelicula.Pelicula;

public class Cartelera {
    
    public Pelicula[] peliculas;
    public int contador;
    
    public Cartelera() {
        peliculas = new Pelicula[10];
        contador = 0;
    }
    
    public void agregarPelicula(int id, String nombre, String descripcion, String genero, int estrellas, String ano, String autor) {
        Pelicula pelicula = new Pelicula(id, nombre.trim(), descripcion.trim(), genero.trim(), estrellas, ano.trim(), autor.trim());
        peliculas[contador++] = pelicula;
    }
    
    public void agregarPelicula(String nombre, String descripcion, String genero, int estrellas, String ano, String autor) {
        Pelicula pelicula = new Pelicula(peliculas[contador-1].getId() + 1, nombre.trim(), descripcion.trim(), genero.trim(), estrellas, ano.trim(), autor.trim());
        peliculas[contador++] = pelicula;
    }
    
    public void listarPeliculas() {
        
        for (Pelicula p : peliculas) {
            if (!(p == null)) {
                p.informacion();
            }
        }
    }
    public void buscarNombre(String nombre) {
        for (Pelicula p : peliculas) {
            if (!(p == null) && p.getNombre().equals(nombre)) {
                p.informacion();
                break;
            }
        }
    }
    public void buscarGenero(String genero) {
        for (Pelicula p : peliculas) {
            if (!(p == null) && p.getGenero().equals(genero)) {
                p.informacion();
            }
        }
    }
}
