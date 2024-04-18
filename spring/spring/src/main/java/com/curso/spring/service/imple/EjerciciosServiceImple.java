package com.curso.spring.service.imple;

import com.curso.spring.service.EjerciciosService;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Slf4j
public class EjerciciosServiceImple implements EjerciciosService {
    @Override
    public List<String> getNombres() {
        log.info("Hola");

        return null;
    }
}
