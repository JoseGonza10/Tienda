
package com.tienda.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;


@Entity
@Data
@Table(name = "factura")
public class Factura implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;
    
    @JoinColumn(name="id_cliente",referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente cliente;
    private Date fecha;
    private double total;
    private int estado;

    public Factura() {
    }

    public Factura(Cliente cliente, Date fecha, double total, int estado) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }
    
    
    
}
