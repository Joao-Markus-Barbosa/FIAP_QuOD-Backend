package com.quod.controller;

import com.quod.dto.ScoreRequest;
import com.quod.service.ScoreAntifraudeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/score")
public class ScoreAntifraudeController {

    @Autowired
    private ScoreAntifraudeService service;

    @PostMapping("/gerar")
    public String gerar(@RequestBody @Valid ScoreRequest request) {
        return service.gerarScore(request);
    }
}
