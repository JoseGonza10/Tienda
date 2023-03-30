
package com.tienda.demo.serviceImp;

import com.tienda.demo.dao.ArticuloDao;
import com.tienda.demo.domain.Articulo;
import com.tienda.demo.service.ArticuloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImp implements ArticuloService {

    @Autowired
    private ArticuloDao articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos) {
       var lista = (List<Articulo>) articuloDao.findAll();
       
       if (activos) { lista.removeIf( e -> !e.isActivo());}
       
       return lista;
    }
    

    @Override
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getId_articulo()).orElse(null);
    }
    
}
