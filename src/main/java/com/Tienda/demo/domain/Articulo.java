
package com.tienda.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_articulo;
    private Long id_categoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;
    private String imagen;

    public Articulo() {
    }

    public Articulo(String descripcion, String detalle, double precio, int existencias, boolean activo, String imagen) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
        this.imagen = imagen;
    }
    
    
    
    
    
    
}
