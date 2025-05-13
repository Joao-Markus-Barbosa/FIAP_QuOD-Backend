package com.quod.service;

import com.quod.dto.ResultadoConsolidadoDTO;
import com.quod.model.Cliente;
import com.quod.model.ResultadoConsolidado;
import com.quod.repository.ClienteRepository;
import com.quod.repository.ResultadoConsolidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoConsolidadoService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ResultadoConsolidadoRepository resultadoRepository;

    public ResultadoConsolidadoDTO gerarResultadoPorCpf(String cpf) {

        System.out.println("🔍 [BACKEND] CPF recebido: " + cpf);

        Cliente cliente = clienteRepository.findByCpf(cpf).orElse(null);

        if (cliente == null) {
            System.out.println("⚠️ [BACKEND] Cliente não encontrado para CPF: " + cpf);
            return null;
        }

        ResultadoConsolidado consolidado = resultadoRepository.findByCpf(cpf).orElse(null);

        if (consolidado == null) {
            System.out.println("⚠️ [BACKEND] Resultado consolidado não encontrado para CPF: " + cpf);
            return null;
        }

        ResultadoConsolidadoDTO resultado = new ResultadoConsolidadoDTO(
                cpf,
                consolidado.getBiometriaFacial() != null ? consolidado.getBiometriaFacial() : "NÃO REALIZADO",
                consolidado.getBiometriaDigital() != null ? consolidado.getBiometriaDigital() : "NÃO REALIZADO",
                consolidado.getDocumentoscopia() != null ? consolidado.getDocumentoscopia() : "NÃO REALIZADO",
                consolidado.getSimSwap() != null ? consolidado.getSimSwap() : "NÃO REALIZADO",
                consolidado.getScore() != null ? consolidado.getScore() : 0
        );

        System.out.println("✅ [BACKEND] Resultado consolidado retornado com sucesso para CPF: " + cpf);
        return resultado;
    }
}


