package com.api.mangastore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("usuarios")
public class Usuario {

    @Id
    @Indexed(unique = true)
    private String id;
    @NotBlank(message = "Campo Obrigatório")
    private String name;
    @CPF(message = "CPF inválido")
    private String cpf;
    private String login;
    private String senha;
    @Email(message = "Email inválido")
    private String email;
    private String telefone;
    private List<Manga> mangas;

    public List<Manga> getMangas(){
        if(mangas == null){
            mangas = new ArrayList<>(Collections.emptyList());
            return mangas;
        }
        return mangas;
    }
}
