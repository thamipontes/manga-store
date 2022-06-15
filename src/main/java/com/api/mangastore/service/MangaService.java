package com.api.mangastore.service;


import com.api.mangastore.entity.Manga;
import com.api.mangastore.exceptions.ApiExceptionRequest;
import com.api.mangastore.repository.MangaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MangaService {
    @Autowired
    private final MangaRepository mangaRepository;

    public void addManga(Manga manga) {
        mangaRepository.insert(manga);
    }

    public void updateManga(Manga manga) {
        Manga findManga = mangaRepository.findById(manga.getId())
                .orElseThrow(() -> new ApiExceptionRequest(String.format("Cannot find Manga by ID %s", manga.getId())));

        findManga.setName(manga.getName());
        findManga.setVersion(manga.getVersion());
        findManga.setDescription(manga.getDescription());
        findManga.setPublishCompany(manga.getPublishCompany());
        findManga.setPrice(manga.getPrice());
        findManga.setStatus(manga.getStatus());

        mangaRepository.save(findManga);
    }

    public List<Manga> findAllMangas (){
        return mangaRepository.findAll();
    }

    public void deleteManga(String idManga){
        mangaRepository.deleteById(idManga);
    }
}
