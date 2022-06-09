package com.api.mangastore.service;

import com.api.mangastore.entity.Usuario;
import com.api.mangastore.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public void adicionaUsuario(Usuario usuario){
        usuarioRepository.insert(usuario);
    }
}
