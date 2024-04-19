package com.curso.spring.service.imple;

import com.curso.spring.service.EjerciciosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Slf4j
public class EjerciciosServiceImple implements EjerciciosService {
    @Override
    public List<String> getNombres() {


        return null;
    }

    @Override
    public <PersonaRequest> ResponseEntity<?> savePersonaNative(PersonaRequest request) {
        try {
            Object personasRepository = null;
            Integer result = personasRepository.equals(request);
            Object response;
            if (result > 0) {
                response = ResponseEntity.ok().body("El guardado se realizo exitosamente");
            } else {
                response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocurrio un error al intentar insertar");

            }
            log.checkError("");

        }
        public boolean deletePersonaNative(int id) throws Exception {
            boolean response = false;
            try {
                Integer
            }
        }
    }
}
