
package com.tienda.demo.controller;

import com.tienda.demo.domain.Articulo;
import com.tienda.demo.service.ArticuloService;
import com.tienda.demo.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticuloController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/")
    public String cargoIndex(Model modelo){
        var articulos = articuloService.getArticulos(true);
        modelo.addAttribute("articulos",articulos);
        return "index";
    }
    
    @GetMapping("/articulo/listado")
    public String inicio(Model modelo){
        var articulos = articuloService.getArticulos(false);
        modelo.addAttribute("articulos",articulos);
        return "/articulo/listado";
    }
    
    @GetMapping("/articulo/nuevo")
    public String nuevoArticulo(Articulo articulo, Model modelo){
        var categorias = categoriaService.getCategorias(true);
        modelo.addAttribute("categorias",categorias);
        return "/articulo/modificar";
    }
    
    @PostMapping("/articulo/guardar")
    public String guardarArticulo(Articulo articulo){
     articuloService.save(articulo);
     return "redirect:/articulo/listado";
    }
    
    @GetMapping("/articulo/modificar/{id_articulo}")
    public String modificarArticulo(Articulo articulo, Model modelo){
        articulo = articuloService.getArticulo(articulo);
        var categorias = categoriaService.getCategorias(true);
        modelo.addAttribute("articulo",articulo);
        modelo.addAttribute("categorias",categorias);
        return "/articulo/modificar";
    }
    
    @GetMapping("/articulo/eliminar/{id_articulo}")
    public String eliminarCategoria(Articulo articulo){
        articuloService.delete(articulo);
        return "redirect:/articulo/listado";
    }
    
}
