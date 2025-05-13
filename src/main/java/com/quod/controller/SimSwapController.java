package com.quod.controller;

import com.quod.dto.SimSwapRequest;
import com.quod.service.SimSwapService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/simswap")
public class SimSwapController {

    @Autowired
    private SimSwapService service;

    @PostMapping("/validar")
    public String validar(@RequestBody @Valid SimSwapRequest request) {
        return service.validar(request);
    }
}


