package com.api.mangastore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@Getter
@Setter
@Document
public class Manga {

    @Id
    @Indexed(unique = true)
    private long id;

    private String name;
    private String version;
    private String description;
    private String publishCompany;
    private String price;
    private String status;
}
