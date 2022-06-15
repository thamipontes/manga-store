package com.api.mangastore.exceptions;

public class ApiRequest {

    private final String mensagem;

    public ApiRequest(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
