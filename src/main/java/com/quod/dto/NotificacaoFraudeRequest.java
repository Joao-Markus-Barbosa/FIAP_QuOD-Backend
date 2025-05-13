package com.quod.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoFraudeRequest {

    private String transacaoId;
    private String tipoBiometria;
    private String tipoFraude;
    private LocalDateTime dataCaptura;
    private Dispositivo dispositivo;
    private List<String> canalNotificacao = new ArrayList<>();
    private String notificadoPor;
    private Metadados metadados;

    public NotificacaoFraudeRequest() {}

    // Compatível com setCpf(...)
    public void setCpf(String cpf) {
        this.transacaoId = cpf;
    }

    // Compatível com setCanal(...)
    public void setCanal(String canal) {
        this.canalNotificacao.clear();
        this.canalNotificacao.add(canal);
    }

    public String getTransacaoId() {
        return transacaoId;
    }

    public void setTransacaoId(String transacaoId) {
        this.transacaoId = transacaoId;
    }

    public String getTipoBiometria() {
        return tipoBiometria;
    }

    public void setTipoBiometria(String tipoBiometria) {
        this.tipoBiometria = tipoBiometria;
    }

    public String getTipoFraude() {
        return tipoFraude;
    }

    public void setTipoFraude(String tipoFraude) {
        this.tipoFraude = tipoFraude;
    }

    public LocalDateTime getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(LocalDateTime dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public List<String> getCanalNotificacao() {
        return canalNotificacao;
    }

    public void setCanalNotificacao(List<String> canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public String getNotificadoPor() {
        return notificadoPor;
    }

    public void setNotificadoPor(String notificadoPor) {
        this.notificadoPor = notificadoPor;
    }

    public Metadados getMetadados() {
        return metadados;
    }

    public void setMetadados(Metadados metadados) {
        this.metadados = metadados;
    }
}
