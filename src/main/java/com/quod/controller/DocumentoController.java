package com.quod.controller;

import com.quod.dto.DocumentoRequest;
import com.quod.service.DocumentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/documento")
public class DocumentoController {

    @Autowired
    private DocumentoService service;

    @PostMapping("/validar")
    public String validar(@RequestBody @Valid DocumentoRequest request) {
        return service.validar(request);
    }
}


