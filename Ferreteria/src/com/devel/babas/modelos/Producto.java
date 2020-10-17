package com.devel.babas.modelos;

import com.devel.babas.conexion.Conexion;
import com.devel.babas.interfaces.IModelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Producto extends Conexion implements IModelos {

    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private short cantidad;
    private boolean nuevo;

    public Producto() {
        this.id = generarId();
        this.nombre = "-";
        this.descripcion = "-";
        this.precio = 0f;
        this.cantidad = 0;
        this.nuevo = true;
    }
    public Producto(int a) {
        this.id = 0;
        this.nombre = "-";
        this.descripcion = "-";
        this.precio = 0f;
        this.cantidad = 0;
        this.nuevo = false;
    }

    public Producto(String nombre, String descripcion, float precio, short cantidad) {
        this.id = generarId();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nuevo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    private boolean isNuevo() {
        return nuevo;
    }

    private void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    private int generarId() {
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("SELECT MAX(id) FROM producto");
            resultado = consulta.executeQuery();
            if (resultado.next()){
                return resultado.getInt(1)+1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return 1;
    }

    @Override
    public boolean guardar(){
        try {
            abrirConexion();
            if (isNuevo()) {
                consulta = conexion.prepareStatement("INSERT INTO producto VALUE(NULL, ?, ?, ?, ?)");
            } else {
                consulta = conexion.prepareStatement("UPDATE producto SET nombre=?, descripcion=?, precio=?, cantidad=? WHERE id=?");
                consulta.setInt(5, getId());
            }
            consulta.setString(1, getNombre());
            consulta.setString(2, getDescripcion());
            consulta.setFloat(3, getPrecio());
            consulta.setShort(4, getCantidad());

            return consulta.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrarConexion();
        }

        return true;
    }

    @Override
    public boolean eliminar(){
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("DELETE FROM producto WHERE id=?");
            consulta.setInt(1, getId());

            return consulta.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrarConexion();
        }

        return true;
    }
    public static Producto getProducto(int _id) {
        Producto producto = null;
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("SELECT id, nombre, descripcion, precio, cantidad FROM producto WHERE id=?");
            consulta.setInt(1, _id);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                producto = new Producto(0);
                producto.setId(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setDescripcion(resultado.getString(3));
                producto.setPrecio(resultado.getFloat(4));
                producto.setCantidad(resultado.getShort(5));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return producto;
    }

    static Producto getItem(int _id) {
        Producto producto = null;
        try {
            PreparedStatement c = conexion.prepareStatement("SELECT id, nombre, descripcion, precio, cantidad FROM producto WHERE id=?");
            c.setInt(1, _id);
            ResultSet r = c.executeQuery();
            producto = new Producto(0);
            r.next();
            producto.setId(r.getInt(1));
            producto.setNombre(r.getString(2));
            producto.setDescripcion(r.getString(3));
            producto.setPrecio(r.getFloat(4));
            producto.setCantidad(r.getShort(5));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return producto;
    }

    public static List<Producto> getProductos(){
        List<Producto> productos = new ArrayList<Producto>();
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("SELECT id, nombre, descripcion, precio, cantidad FROM producto");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                Producto producto = new Producto(0);
                producto.setId(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setDescripcion(resultado.getString(3));
                producto.setPrecio(resultado.getFloat(4));
                producto.setCantidad(resultado.getShort(5));
                productos.add(producto);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return productos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", nuevo=" + nuevo +
                '}';
    }
}
