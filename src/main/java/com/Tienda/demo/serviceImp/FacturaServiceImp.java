package com.tienda.demo.serviceImp;

import com.tienda.demo.dao.FacturaDao;
import com.tienda.demo.domain.Factura;
import com.tienda.demo.service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaServiceImp implements FacturaService {

    @Autowired
    private FacturaDao facturaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Factura> getFacturas() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Factura getFactura(Factura factura) {
        return facturaDao.findById(factura.getId_factura()).orElse(null);
    }

}
