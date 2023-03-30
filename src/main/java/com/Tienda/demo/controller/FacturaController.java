package com.tienda.demo.controller;

import com.tienda.demo.service.ClienteService;
import com.tienda.demo.service.FacturaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/factura/listado")
    public String inicio(Model modelo) {
        var facturas = facturaService.getFacturas();
        modelo.addAttribute("facturas", facturas);
        return "/factura/listado";
    }

}
