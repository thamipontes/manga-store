package com.api.mangastore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
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
@Document("usuarios")
public class Usuario {

    @Id
    @Indexed(unique = true)
    private String id;
    @NotBlank
    private String name;
    @CPF
    private String cpf;
    private String login;
    private String senha;
    @Email
    private String email;
    private String telefone;
    private List<Manga> mangas;

    public List<Manga> getMangas(){
        if(this.mangas == null){
            this.mangas = new ArrayList<>(Collections.emptyList());
            return this.mangas;
        }
        return this.mangas;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
