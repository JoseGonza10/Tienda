
package com.tienda.demo.dao;

import com.tienda.demo.domain.Factura;
import org.springframework.data.repository.CrudRepository;


public interface FacturaDao extends CrudRepository<Factura, Long>{
    
}
