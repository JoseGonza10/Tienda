
package com.tienda.demo.controller;

import com.tienda.demo.domain.Categoria;
import com.tienda.demo.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/categoria/listado")
    public String inicio(Model modelo){
        var categorias = categoriaService.getCategorias(false);
        modelo.addAttribute("categorias",categorias);
        return "/categoria/listado";
    }
    
    @GetMapping("/categoria/nuevo")
    public String nuevoCategoria(Categoria categoria){
        return "/categoria/modificar";
    }
    
    @PostMapping("/categoria/guardar")
    public String guardarCategoria(Categoria categoria){
     categoriaService.save(categoria);
     return "redirect:/categoria/listado";
    }
    
    @GetMapping("/categoria/modificar/{id_categoria}")
    public String modificarCategoria(Categoria categoria, Model modelo){
        categoria = categoriaService.getCategoria(categoria);
        modelo.addAttribute("categoria",categoria);
        return "categoria/modificar";
    }
    
    @GetMapping("/categoria/eliminar/{id_categoria}")
    public String eliminarCategoria(Categoria categoria){
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }
    
}
