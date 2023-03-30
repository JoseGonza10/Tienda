
package com.tienda.demo.service;

import com.tienda.demo.domain.Factura;
import java.util.List;


public interface FacturaService {
    
    public List<Factura> getFacturas();
    
    public Factura getFactura(Factura factura);
    
}
