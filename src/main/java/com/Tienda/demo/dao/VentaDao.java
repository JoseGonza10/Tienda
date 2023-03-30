
package com.tienda.demo.dao;

import com.tienda.demo.domain.Venta;
import org.springframework.data.repository.CrudRepository;


public interface VentaDao extends CrudRepository<Venta, Long>{
    
}
