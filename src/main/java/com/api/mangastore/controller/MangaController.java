package com.api.mangastore.controller;


import com.api.mangastore.entity.Manga;
import com.api.mangastore.service.MangaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mangas")
@AllArgsConstructor
public class MangaController {

    @Autowired
    private final MangaService mangaService;

    @PostMapping
    public ResponseEntity addManga(@RequestBody Manga manga){
        mangaService.addManga(manga);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateManga(@RequestBody Manga manga){
        mangaService.updateManga(manga);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity findAllManga(){
        List<Manga> mangas =  mangaService.findAllMangas();
        return ResponseEntity.ok(mangas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteManga(@PathVariable(value = "id") String idManga){
        mangaService.deleteManga(idManga);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
