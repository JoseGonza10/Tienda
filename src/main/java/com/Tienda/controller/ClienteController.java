/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author josep
 */
@Controller
@Slf4j
public class ClienteController {
    
    @GetMapping("/")
    public String inicio(Model model){
        var variable = "Saludos desde el Back End";
        model.addAttribute("variable",variable);
                
        return "index";
    }
    
}
