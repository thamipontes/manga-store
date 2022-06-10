package com.api.mangastore.controller;

import com.api.mangastore.entity.Usuario;
import com.api.mangastore.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class UsuarioController {

    @Autowired
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity adicionarUsuario(@RequestBody Usuario usuario){
        usuarioService.adicionaUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
