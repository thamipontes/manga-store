package com.api.mangastore.controller;

import com.api.mangastore.entity.Manga;
import com.api.mangastore.entity.Usuario;
import com.api.mangastore.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity addUsuario(@RequestBody Usuario usuario){
        usuarioService.addUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateUsuario(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/{id}" )
    public ResponseEntity addMangaUsuario(@RequestBody Manga manga, @PathVariable(value = "id") long idUsuario){
        usuarioService.addMangaUsuario(manga, idUsuario);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
