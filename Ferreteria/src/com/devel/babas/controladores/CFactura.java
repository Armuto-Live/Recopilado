package com.devel.babas.controladores;

import com.devel.babas.modelos.Factura;
import com.devel.babas.modelos.Producto;

import java.util.List;

public class CFactura {

    public static Factura nuevaFactura(String descripcion, String ruc, List<Producto> productos) {
        Factura factura = new Factura(descripcion, ruc, productos);
        return factura;
    }

    public static Factura nuevaFactura(String descripcion, String ruc) {
        Factura factura = new Factura(descripcion, ruc);
        return factura;
    }

    public static Factura nuevaFactura() {
        return new Factura();
    }

    public static Factura getFactura(String ruc){
        return Factura.getFactura(ruc);
    }
}
