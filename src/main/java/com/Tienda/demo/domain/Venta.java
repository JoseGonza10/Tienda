
package com.tienda.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "venta")
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;
    
    @JoinColumn(name="id_factura",referencedColumnName = "id_factura")
    @ManyToOne
    private Factura factura;
    
    @JoinColumn(name="id_articulo",referencedColumnName = "id_articulo")
    @ManyToOne
    private Articulo articulo;
    
    private double precio;
    private int cantidad;

    public Venta() {
    }

    public Venta(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
    
}
