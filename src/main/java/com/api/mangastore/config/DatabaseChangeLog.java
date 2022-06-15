package com.api.mangastore.config;

import com.api.mangastore.entity.Manga;
import com.api.mangastore.entity.Usuario;
import com.api.mangastore.repository.MangaRepository;
import com.api.mangastore.repository.UsuarioRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DatabaseChangeLog {
    @ChangeSet(order = "001", id = "seedDatabaseUsuario", author = "Thamires")
    public void seedDatabase(UsuarioRepository usuarioRepository){
        List<Usuario> usuariosList = new ArrayList<>();
        List<Manga> mangaList = new ArrayList<>();
        Manga manga = new Manga("1", "Name Manga", "Version1", "Description1", "Company", 10.8f, "Novo");
        mangaList.add(manga);

        usuariosList.add(new Usuario("1", "Name1", "28811862035", "login1", "senha1", "email1@email.com", "987654321", mangaList));
        usuariosList.add(new Usuario("2", "Name2", "53507772035", "login2", "senha2", "email2@email.com", "987654321", mangaList));
        usuarioRepository.insert(usuariosList);

    }

    @ChangeSet(order = "002", id = "seedDatabaseManga", author = "Thamires")
    public void seedDatabase(MangaRepository mangaRepository){
        List<Manga> mangaList = new ArrayList<>();
        Manga manga = new Manga("1", "Name Manga", "Version1", "Description1", "Company", 10.8f, "Novo");
        mangaList.add(manga);
        mangaRepository.insert(mangaList);
    }

}
