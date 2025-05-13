package com.quod.service;

import com.quod.dto.BiometriaDigitalRequest;
import com.quod.model.Cliente;
import com.quod.model.NotificacaoFraude;
import com.quod.model.ResultadoConsolidado;
import com.quod.repository.ClienteRepository;
import com.quod.repository.NotificacaoFraudeRepository;
import com.quod.repository.ResultadoConsolidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BiometriaDigitalService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ResultadoConsolidadoRepository resultadoRepository;

    @Autowired
    private NotificacaoFraudeRepository notificacaoFraudeRepository;

    public String validar(BiometriaDigitalRequest request) {
        Cliente cliente = clienteRepository.findByCpf(request.getCpf()).orElse(null);

        if (cliente == null) {
            return "Cliente não encontrado";
        }

        String cpf = cliente.getCpf();
        String imagem = request.getImagemBase64();

        if (imagem == null || imagem.isBlank()) {
            salvarResultado(cpf, "FALHA");
            return "Imagem digital inválida";
        }

        if (cpf.endsWith("8")) {
            salvarResultado(cpf, "FALHA");
            notificarFraude("mascara", "digital");
            return "Falha ao validar biometria digital: Desconhecido";
        }

        salvarResultado(cpf, "SUCESSO");
        return "Biometria digital validada com sucesso";
    }

    private void salvarResultado(String cpf, String status) {
        ResultadoConsolidado resultado = resultadoRepository.findByCpf(cpf)
                .orElse(new ResultadoConsolidado());

        resultado.setCpf(cpf);
        resultado.setBiometriaDigital(status);
        resultado.setDataAtualizacao(LocalDateTime.now());

        resultadoRepository.save(resultado);
    }

    private void notificarFraude(String tipoFraude, String tipoBiometria) {
        NotificacaoFraude notificacao = new NotificacaoFraude();

        notificacao.setTipoFraude(tipoFraude);
        notificacao.setTipoBiometria(tipoBiometria);
        notificacao.setDataCaptura(LocalDateTime.now());
        notificacao.setNotificadoPor("sistema-de-monitoramento");
        notificacao.setCanalNotificacao(List.of("email"));

        notificacaoFraudeRepository.save(notificacao);
    }
}




