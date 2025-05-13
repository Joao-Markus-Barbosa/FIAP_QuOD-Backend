package com.quod.controller;

import com.quod.dto.BiometriaDigitalRequest;
import com.quod.service.BiometriaDigitalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/biometria/digital")
public class BiometriaDigitalController {

    @Autowired
    private BiometriaDigitalService service;

    @PostMapping("/validar")
    public String validar(@RequestBody @Valid BiometriaDigitalRequest request) {
        return service.validar(request);
    }
}



