package com.devel.babas.modelos;

import com.devel.babas.conexion.Conexion;
import com.devel.babas.interfaces.IModelos;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Factura extends Conexion implements IModelos {

    private int id;
    private Date fechaEmision;
    private String Descripcion;
    private float total;
    private String ruc;
    private List<Producto> productos;

    public Factura(String descripcion, String ruc, List<Producto> productos) {
        this.id = generarId();
        this.fechaEmision = Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
        Descripcion = descripcion;
        this.total = 0f;
        this.ruc = ruc;
        this.productos = productos;
    }
    public Factura(String descripcion, String ruc) {
        this.id = generarId();
        this.fechaEmision = Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
        Descripcion = descripcion;
        this.total = 0f;
        this.ruc = ruc;
        this.productos = new ArrayList<Producto>();
    }
    public Factura(){
        this.id = generarId();
        this.fechaEmision = Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
        Descripcion = "-";
        this.total = 0f;
        this.ruc = "-";
        this.productos = new ArrayList<Producto>();
    }

    public Factura(int id){
        this.id = id;
        this.fechaEmision = null;
        Descripcion = "-";
        this.total = 0f;
        this.ruc = "-";
        this.productos = new ArrayList<Producto>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public float getTotal() {

        return total;
    }

    private void setTotal() {
        total = 0;
        productos.forEach(producto -> {
            total+= producto.getPrecio();
        });
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
        setTotal();
    }

    public void setProducto(Producto producto) {
        productos.add(producto);
        setTotal();
    }

    private int generarId() {
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("SELECT MAX(id_factura) FROM factura");
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
    public boolean guardar() {
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("INSERT INTO factura VALUES(?, ?, ?, ?, ?)");
            consulta.setInt(1, getId());
            consulta.setDate(2, getFechaEmision());
            consulta.setString(3, getDescripcion());
            consulta.setFloat(4, getTotal());
            consulta.setString(5, getRuc());

            return consulta.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            insertarProductos();
            cerrarConexion();
        }
        return false;
    }

    private void insertarProductos(){
        try {
            restablecer();
            String insertar = "";
            for(Producto p : productos) {
                insertar+=String.format("(NULL, %s, %s, %s),", getTotal(), getId(), p.getId());
            }
            insertar = insertar.substring(0, insertar.length()-1);
            consulta = conexion.prepareStatement(String.format("INSERT INTO detalle VALUES %s", insertar));
            consulta.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean eliminar() {
        return false;
    }

    public static Factura getFactura(String _ruc) {
        Factura factura = null;
        try {
            abrirConexion();
            consulta = conexion.prepareStatement("SELECT id_factura, fecha_emision, descripcion, total, ruc FROM factura WHERE ruc=?");
            consulta.setString(1, _ruc);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                factura = new Factura(resultado.getInt(1));
                factura.setFechaEmision(resultado.getDate(2));
                factura.setDescripcion(resultado.getString(3));
                factura.setRuc(resultado.getString(5));
                return cargarProductos(factura);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return factura;
    }
    private static Factura cargarProductos(Factura factura) {
        try {
            restablecer();
            consulta = conexion.prepareStatement("SELECT id_producto FROM detalle WHERE id_factura=?");
            consulta.setInt(1, factura.getId());
            resultado = consulta.executeQuery();

            while (resultado.next()) {
                factura.setProducto(Producto.getItem(resultado.getInt(1)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return factura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fechaEmision=" + fechaEmision +
                ", Descripcion='" + Descripcion + '\'' +
                ", total=" + total +
                ", ruc='" + ruc + '\'' +
                ", productos=" + productos +
                '}';
    }
}
