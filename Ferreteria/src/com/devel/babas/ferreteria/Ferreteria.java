package com.devel.babas.ferreteria;

import com.devel.babas.conexion.Conexion;
import com.devel.babas.controladores.CFactura;
import com.devel.babas.controladores.CProducto;
import com.devel.babas.modelos.Factura;
import com.devel.babas.modelos.Producto;

public class Ferreteria {
    public static void main(String[] args) {
//        Producto p = CProducto.nuevoProducto("Martillo", "Tramontina", 15.4f, (short) 10);
//        p.guardar();
//        Producto p = CProducto.getProducto(1);
//        Factura f = CFactura.nuevaFactura("Comprobante de pago", "1047624426");
//        f.setProducto(p);
//        p = CProducto.getProducto(2);
//        f.setProducto(p);
//        f.guardar();
        Factura f = CFactura.getFactura("1047624426");
        System.out.println(f.getProductos());
    }
}
