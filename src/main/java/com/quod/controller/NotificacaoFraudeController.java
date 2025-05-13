package com.quod.controller;

import com.quod.dto.NotificacaoFraudeRequest;
import com.quod.service.NotificacaoFraudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notificacoes")
public class NotificacaoFraudeController {

    @Autowired
    private NotificacaoFraudeService service;

    @PostMapping("/fraude")
    public String registrar(@RequestBody NotificacaoFraudeRequest request) {
        return service.salvar(request);
    }
}

