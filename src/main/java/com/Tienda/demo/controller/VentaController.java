/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.demo.controller;

import com.tienda.demo.service.VentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("/venta/listado")
    public String inicio(Model modelo) {
        var ventas = ventaService.getVentas();
        modelo.addAttribute("ventas", ventas);
        return "/venta/listado";
    }
}
