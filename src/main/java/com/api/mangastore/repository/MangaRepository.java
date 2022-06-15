package com.api.mangastore.repository;

import com.api.mangastore.entity.Manga;
import com.api.mangastore.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MangaRepository extends MongoRepository<Manga, String> {
}
