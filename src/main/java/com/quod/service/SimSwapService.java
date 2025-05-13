package com.quod.service;

import com.quod.dto.SimSwapRequest;
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
public class SimSwapService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ResultadoConsolidadoRepository resultadoRepository;

    @Autowired
    private NotificacaoFraudeRepository notificacaoFraudeRepository;

    public String validar(SimSwapRequest request) {
        Cliente cliente = clienteRepository.findByCpf(request.getCpf()).orElse(null);

        if (cliente == null) {
            return "Cliente não encontrado";
        }

        String cpf = cliente.getCpf();

        if (cpf.endsWith("6")) {
            salvarResultado(cpf, "FALHA");
            notificarFraude("chip trocado", "sim_swap");
            return "Falha ao validar SIM Swap: chip trocado recentemente";
        }

        salvarResultado(cpf, "SUCESSO");
        return "SIM Swap validado com sucesso";
    }

    private void salvarResultado(String cpf, String status) {
        ResultadoConsolidado resultado = resultadoRepository.findByCpf(cpf)
                .orElse(new ResultadoConsolidado());

        resultado.setCpf(cpf);
        resultado.setSimSwap(status);
        resultado.setDataAtualizacao(LocalDateTime.now());

        resultadoRepository.save(resultado);
    }

    private void notificarFraude(String tipoFraude, String tipoValidacao) {
        NotificacaoFraude notificacao = new NotificacaoFraude();

        notificacao.setTipoFraude(tipoFraude);
        notificacao.setTipoBiometria(tipoValidacao);
        notificacao.setDataCaptura(LocalDateTime.now());
        notificacao.setNotificadoPor("sistema-de-monitoramento");
        notificacao.setCanalNotificacao(List.of("email"));

        notificacaoFraudeRepository.save(notificacao);
    }
}






