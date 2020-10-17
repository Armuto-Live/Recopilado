package com.devel.babas.controladores;

import com.devel.babas.modelos.Producto;
import java.util.List;

public class CProducto {

    public static Producto getProducto(int id){
        return Producto.getProducto(id);
    }

    public static Producto nuevoProducto(String nombre, String descripcion, float precio, short cantidad) {
        Producto producto = new Producto(nombre, descripcion, precio, cantidad);
        return producto;
    }

    public static List<Producto> getProductos(){
        return Producto.getProductos();
    }
}
