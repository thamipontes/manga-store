package com.api.mangastore.service;

import com.api.mangastore.entity.Manga;
import com.api.mangastore.entity.Usuario;
import com.api.mangastore.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public void addUsuario(Usuario usuario) {
        usuarioRepository.insert(usuario);
    }

    public void updateUsuario(Usuario usuario) {
        Usuario findUsuario = usuarioRepository.findById(usuario.getId())
                .orElseThrow(() -> new RuntimeException(String.format("Cannot find Usuario by ID %s", usuario.getId())));

        findUsuario.setName(usuario.getName());
        findUsuario.setTelefone(usuario.getTelefone());
        findUsuario.setLogin(usuario.getLogin());
        findUsuario.setSenha(usuario.getSenha());
        findUsuario.setEmail(usuario.getEmail());
        findUsuario.setCpf(usuario.getCpf());

        usuarioRepository.save(findUsuario);
    }

    public void addMangaUsuario(Manga manga, String cpfUsuario) {
        Usuario findUsuario = usuarioRepository.findByCpf(cpfUsuario)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot find Usuario by CPF %s", cpfUsuario)));
        findUsuario.getMangas().add(manga);
        usuarioRepository.save(findUsuario);
    }

    public List<Usuario> findAllUsuarios (){
        return usuarioRepository.findAll();
    }

}
