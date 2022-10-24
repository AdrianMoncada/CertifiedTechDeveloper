package com.example.springmvc.controller;

import com.example.springmvc.dominio.Usuario;
import com.example.springmvc.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario crearUsuario(){
        return usuarioService.crearUsuario();
    }

    @GetMapping("/crearPerroUsuario")
        public Usuario crearPerroUsuario(){
            Usuario usuarioPerro = new Usuario("Kimba", 3);
            return usuarioPerro;
        }



}
