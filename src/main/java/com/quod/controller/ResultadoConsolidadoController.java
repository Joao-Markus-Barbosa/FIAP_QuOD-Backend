package com.quod.controller;

import com.quod.dto.ResultadoConsolidadoDTO;
import com.quod.service.ResultadoConsolidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resultado")
public class ResultadoConsolidadoController {

    @Autowired
    private ResultadoConsolidadoService resultadoService;

    @GetMapping("/consolidado/{cpf}")
    public ResultadoConsolidadoDTO obterResultadoConsolidado(@PathVariable String cpf) {
        return resultadoService.gerarResultadoPorCpf(cpf);
    }
}

