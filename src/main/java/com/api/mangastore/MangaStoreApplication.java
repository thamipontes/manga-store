package com.api.mangastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class MangaStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangaStoreApplication.class, args);
	}

}
