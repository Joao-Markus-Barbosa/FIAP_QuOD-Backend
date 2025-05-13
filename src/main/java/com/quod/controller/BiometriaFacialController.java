package com.quod.controller;

import com.quod.dto.BiometriaFacialRequest;
import com.quod.service.BiometriaFacialService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/biometria/facial")
public class BiometriaFacialController {

    @Autowired
    private BiometriaFacialService service;

    @PostMapping("/validar")
    public ResponseEntity<String> validar(@RequestBody @Valid BiometriaFacialRequest request) {
        String resultado = service.validar(request);
        return ResponseEntity.ok(resultado);
    }
}
