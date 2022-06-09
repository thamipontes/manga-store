package com.api.mangastore.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuario")
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

    public Usuario(long id, String name, String cpf, String login, String senha, String email, String telefone) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
    }

    public long getId() {
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
