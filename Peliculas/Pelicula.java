package com.babas.devel.pelicula;

public class Pelicula {
    private int id;
    private String nombre;
    private String descripcion;
    private String genero;
    private byte estrellas;
    private String ano;
    private String autor;
    
    public Pelicula(){
        id = 0;
        nombre = "";
        descripcion = "";
        genero = "";
        estrellas = 0;
        ano = "";
        autor = "";
    }
    public Pelicula(int id, String nombre, String descripcion, String genero, int estrellas, String ano, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.estrellas = (byte)estrellas;
        this.ano = ano;
        this.autor = autor;        
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setEstrellas(byte estrellas) {
        this.estrellas = (byte)estrellas;
    }
    public byte getEstrellas() {
        return estrellas;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getAno() {
        return ano;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void informacion() {
        System.out.printf("%s - %s - %s - %s - %s - %s - %s.\n", getId(), getNombre(), getDescripcion(), getGenero(), getEstrellas(), getAno(), getAutor());
    }
}
