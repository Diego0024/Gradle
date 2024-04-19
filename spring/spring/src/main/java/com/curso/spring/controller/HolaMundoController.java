package com.curso.spring.controller;

import com.curso.spring.dto.Persona;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso-spring")


public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "hola Mundo desde Spring";
    }

    @GetMapping (path = "/hola/{nombre}")
    public String holaMundoCustom(@PathVariable String nombre) {
        return "hola mundo " + nombre;
    }

    @PostMapping ("/persona")
    public Persona datosPersona(@RequestBody Persona persona) {
        return persona;
    }

    @GetMapping ("/nombres")
    public List<String> getNombres(){
        return null;

    }
@GetMapping("/posts/{id}")
    @Operation(summary = "Operacion para consumir un servicio REST")
    public void getPost(@PathVariableint id)

}


