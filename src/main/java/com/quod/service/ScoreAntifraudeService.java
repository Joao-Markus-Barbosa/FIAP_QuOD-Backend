package com.quod.service;

import com.quod.dto.ScoreRequest;
import com.quod.model.Cliente;
import com.quod.model.ResultadoConsolidado;
import com.quod.repository.ClienteRepository;
import com.quod.repository.ResultadoConsolidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class ScoreAntifraudeService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ResultadoConsolidadoRepository resultadoRepository;

    public String gerarScore(ScoreRequest request) {
        if (request.getCpf() == null || request.getCpf().isBlank()) {
            return "CPF é obrigatório";
        }

        Cliente cliente = clienteRepository.findByCpf(request.getCpf()).orElse(null);
        if (cliente == null) {
            return "Cliente não encontrado";
        }

        int score = calcularScoreSimulado(cliente.getCpf());

        ResultadoConsolidado resultado = resultadoRepository.findByCpf(cliente.getCpf())
                .orElse(new ResultadoConsolidado());

        resultado.setCpf(cliente.getCpf());
        resultado.setScore(score);
        resultado.setDataAtualizacao(LocalDateTime.now());

        resultadoRepository.save(resultado);

        return "Score antifraude gerado: " + score;
    }

    private int calcularScoreSimulado(String cpf) {
        if (cpf.endsWith("0")) return 350;
        if (cpf.endsWith("1")) return 420;
        if (cpf.endsWith("2")) return 500;
        if (cpf.endsWith("3")) return 600;
        if (cpf.endsWith("4")) return 700;
        if (cpf.endsWith("5")) return 800;
        if (cpf.endsWith("6")) return 900;
        if (cpf.endsWith("7")) return 1000;
        if (cpf.endsWith("8")) return 300;
        return new Random().nextInt(201) + 300; // score aleatório entre 300 e 500
    }
}

