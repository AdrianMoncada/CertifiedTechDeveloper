package com.dh.caja.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController {
    @Value("${denominaciones_billete}")
    private String denominaciones;

    @Value("${cantidad_maxima_efectivo}")
    private String cantidad;

    @GetMapping("/denominaciones_billete")
            public ResponseEntity<String> getDenominaciones(){
            return ResponseEntity.ok(denominaciones);
            }

    @GetMapping("/cantidad_maxima_efectivo")
    public ResponseEntity<String> getCantidad(){
        return ResponseEntity.ok(cantidad);
    }

}
