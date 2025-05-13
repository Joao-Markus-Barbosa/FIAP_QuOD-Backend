package com.quod.service;

import com.quod.dto.*;
import com.quod.model.NotificacaoFraude;
import com.quod.repository.NotificacaoFraudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificacaoFraudeService {

    @Autowired
    private NotificacaoFraudeRepository repository;

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String URL_NOTIFICACAO = "http://localhost:8080/api/notificacoes/fraude";

    public void notificarFraudeFacial(BiometriaFacialRequest request, String tipoFraude) {
        NotificacaoFraudeRequest notificacao = criarNotificacao("BIOMETRIA_FACIAL", tipoFraude, request.getDispositivo(), request.getMetadados());
        salvarENotificar(notificacao);
    }

    public void notificarFraudeDigital(BiometriaDigitalRequest request, String tipoFraude) {
        NotificacaoFraudeRequest notificacao = criarNotificacao("BIOMETRIA_DIGITAL", tipoFraude, request.getDispositivo(), request.getMetadados());
        salvarENotificar(notificacao);
    }

    public void notificarFraudeDocumento(DocumentoRequest request, String tipoFraude) {
        NotificacaoFraudeRequest notificacao = criarNotificacao("DOCUMENTOSCOPIA", tipoFraude, request.getDispositivo(), request.getMetadados());
        salvarENotificar(notificacao);
    }

    public void notificarFraudeSimSwap(SimSwapRequest request, String tipoFraude) {
        NotificacaoFraudeRequest notificacao = criarNotificacao("SIM_SWAP", tipoFraude, request.getDispositivo(), request.getMetadados());
        salvarENotificar(notificacao);
    }

    private NotificacaoFraudeRequest criarNotificacao(String canal, String tipoFraude, Dispositivo dispositivo, Metadados metadados) {
        NotificacaoFraudeRequest req = new NotificacaoFraudeRequest();
        req.setCanal(canal);
        req.setTipoBiometria(canal);
        req.setTipoFraude(tipoFraude);
        req.setDataCaptura(LocalDateTime.now());
        req.setDispositivo(dispositivo);
        req.setMetadados(metadados);
        req.setNotificadoPor("sistema-backend");
        return req;
    }

    private void salvarENotificar(NotificacaoFraudeRequest request) {
        salvar(request);
        enviarNotificacao(request);
    }

    private void enviarNotificacao(NotificacaoFraudeRequest notificacao) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<NotificacaoFraudeRequest> entity = new HttpEntity<>(notificacao, headers);
            restTemplate.postForEntity(URL_NOTIFICACAO, entity, String.class);
        } catch (Exception e) {
            System.err.println("Erro ao notificar fraude (" + notificacao.getTipoBiometria() + "): " + e.getMessage());
        }
    }

    public String salvar(NotificacaoFraudeRequest request) {
        try {
            NotificacaoFraude entidade = new NotificacaoFraude();
            entidade.setTransacaoId(request.getTransacaoId());
            entidade.setTipoBiometria(request.getTipoBiometria());
            entidade.setTipoFraude(request.getTipoFraude());
            entidade.setDataCaptura(request.getDataCaptura());
            entidade.setDispositivo(request.getDispositivo());
            entidade.setCanalNotificacao(request.getCanalNotificacao());
            entidade.setNotificadoPor(request.getNotificadoPor());
            entidade.setMetadados(request.getMetadados());

            repository.save(entidade);
            return "Notificação salva com sucesso";
        } catch (Exception e) {
            return "Erro ao salvar notificação: " + e.getMessage();
        }
    }
}


