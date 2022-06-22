package com.api.mangastore;


import com.api.mangastore.entity.Manga;
import com.api.mangastore.exceptions.ApiExceptionRequest;
import com.api.mangastore.repository.UsuarioRepository;
import com.api.mangastore.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ContextConfiguration(classes = UsuarioService.class)
@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {

    @Autowired
    private UsuarioService usuarioService;

    @MockBean
    private UsuarioRepository usuarioRepository;


    @Test
    void return_exception_not_find_by_cpf(){
        String cpfNotExistsInDatabase = "53670074066";

        Manga manga = new Manga("id","name", "version", "description", "company",
                10f, "Novo");

        Mockito.when(usuarioRepository.findByCpf(cpfNotExistsInDatabase)).thenReturn(Optional.empty());

        Exception exception = assertThrows(
                ApiExceptionRequest.class,
                () -> {
                    usuarioService.addMangaUsuario(manga, cpfNotExistsInDatabase);
                }
        );

        String expectedMessage = "Cannot find Usuario by CPF 53670074066";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);

    }
}
