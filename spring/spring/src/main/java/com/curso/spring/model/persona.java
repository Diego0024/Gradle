package com.curso.spring.model;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class persona {

    @PostMapping("/persons/info/{id}")
    @Operation(summary = "Operacion para obtener info de persona")
    public ResponseEntity<Object> getInfoPersona;
}
