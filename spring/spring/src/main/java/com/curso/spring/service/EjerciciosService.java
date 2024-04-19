package com.curso.spring.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EjerciciosService {
    List<String>     getNombres();

    <PersonaRequest> ResponseEntity<?> savePersonaNative(PersonaRequest request);
}
