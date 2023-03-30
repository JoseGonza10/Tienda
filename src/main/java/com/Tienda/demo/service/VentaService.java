
package com.tienda.demo.service;

import com.tienda.demo.domain.Venta;
import java.util.List;


public interface VentaService {
    
    public List<Venta> getVentas();
    
    public Venta getVenta(Venta venta);
    
}
