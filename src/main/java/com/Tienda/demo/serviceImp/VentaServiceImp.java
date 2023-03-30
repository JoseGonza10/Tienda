package com.tienda.demo.serviceImp;

import com.tienda.demo.dao.VentaDao;
import com.tienda.demo.domain.Venta;
import com.tienda.demo.service.VentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaServiceImp implements VentaService {

    @Autowired
    private VentaDao ventaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Venta> getVentas() {
        return (List<Venta>) ventaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Venta getVenta(Venta venta) {
        return ventaDao.findById(venta.getId_venta()).orElse(null);
    }

}
