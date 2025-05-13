package com.quod.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "biometria_digital")
public class RegistroValidacaoDigital {

    @Id
    private String id;

    private String cpf;
    private String imagemBase64;
    private String statusValidacao; // "sucesso" ou "fraude"
    private String motivoFalha;

    private LocalDateTime dataHora;

    // Metadados do dispositivo
    private String fabricanteDispositivo;
    private String modeloDispositivo;
    private String sistemaOperacional;
    private String ipOrigem;
    private Double latitude;
    private Double longitude;

    public RegistroValidacaoDigital() {}

    public RegistroValidacaoDigital(String cpf, String imagemBase64, String statusValidacao,
                                    String motivoFalha, LocalDateTime dataHora,
                                    String fabricanteDispositivo, String modeloDispositivo,
                                    String sistemaOperacional, String ipOrigem,
                                    Double latitude, Double longitude) {
        this.cpf = cpf;
        this.imagemBase64 = imagemBase64;
        this.statusValidacao = statusValidacao;
        this.motivoFalha = motivoFalha;
        this.dataHora = dataHora;
        this.fabricanteDispositivo = fabricanteDispositivo;
        this.modeloDispositivo = modeloDispositivo;
        this.sistemaOperacional = sistemaOperacional;
        this.ipOrigem = ipOrigem;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }

    public String getStatusValidacao() {
        return statusValidacao;
    }

    public void setStatusValidacao(String statusValidacao) {
        this.statusValidacao = statusValidacao;
    }

    public String getMotivoFalha() {
        return motivoFalha;
    }

    public void setMotivoFalha(String motivoFalha) {
        this.motivoFalha = motivoFalha;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getFabricanteDispositivo() {
        return fabricanteDispositivo;
    }

    public void setFabricanteDispositivo(String fabricanteDispositivo) {
        this.fabricanteDispositivo = fabricanteDispositivo;
    }

    public String getModeloDispositivo() {
        return modeloDispositivo;
    }

    public void setModeloDispositivo(String modeloDispositivo) {
        this.modeloDispositivo = modeloDispositivo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getIpOrigem() {
        return ipOrigem;
    }

    public void setIpOrigem(String ipOrigem) {
        this.ipOrigem = ipOrigem;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
