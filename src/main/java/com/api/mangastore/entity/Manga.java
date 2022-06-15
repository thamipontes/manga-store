package com.api.mangastore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("mangas")
public class Manga {

    @Id
    @Indexed(unique = true)
    private String id;

    @NotBlank
    private String name;
    private String version;
    private String description;
    private String publishCompany;
    private Float price;
    private String status;

    @Override
    public String toString() {
        return "Manga{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", description='" + description + '\'' +
                ", publishCompany='" + publishCompany + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) &&
                Objects.equals(name, manga.name) &&
                Objects.equals(version, manga.version) &&
                Objects.equals(description, manga.description) &&
                Objects.equals(publishCompany, manga.publishCompany) &&
                Objects.equals(price, manga.price) &&
                Objects.equals(status, manga.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, version, description, publishCompany, price, status);
    }
}
