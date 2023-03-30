
package com.tienda.demo.dao;

import com.tienda.demo.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
