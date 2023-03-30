
package com.tienda.demo.dao;

import com.tienda.demo.domain.Credito;
import org.springframework.data.repository.CrudRepository;

public interface CreditoDao extends CrudRepository<Credito, Long> {
    
}
