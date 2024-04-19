package com.curso.spring.repository;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PersonasRepository {


    @Modifying
    @Query
    @DeleteMapping("/delete-native/person")
    @Operation(summary = "Operacion para eliminar en BD de manera nativa")
    public boolean deletePersonNative(@PathVariable int id;)
}
