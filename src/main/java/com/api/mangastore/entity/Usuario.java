package com.api.mangastore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@Document("usuarios")
public class Usuario {

    @Id
    private long id;
    private String name;

    @Indexed(unique = true)
    private String cpf;
    private String login;
    private String senha;
    private String email;
    private String telefone;

    @DBRef
    private List<Manga> mangas;

}
