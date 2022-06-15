package com.api.mangastore.repository;

import com.api.mangastore.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    @Query("{'cpf': ?0}")
    Optional<Usuario> findByCpf(String cpfUsuario);

}
