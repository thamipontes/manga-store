package com.api.mangastore;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableMongock
public class MangaStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangaStoreApplication.class, args);
	}

}
