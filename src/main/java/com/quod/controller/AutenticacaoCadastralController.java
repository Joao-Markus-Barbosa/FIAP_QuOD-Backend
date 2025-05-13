package com.quod.controller;

import com.quod.dto.AutenticacaoCadastralRequest;
import com.quod.service.AutenticacaoCadastralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/autenticacao")
public class AutenticacaoCadastralController {

    @Autowired
    private AutenticacaoCadastralService service;

    @PostMapping("/cadastro")
    public String autenticar(@RequestBody @Valid AutenticacaoCadastralRequest request) {
        return service.autenticar(request);
    }
}

