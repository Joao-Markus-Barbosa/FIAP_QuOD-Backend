package com.quod.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "documentoscopia")
public class RegistroValidacaoDocumento {

    @Id
    private String id;

    private String cpf;
    private String imagemDocumentoBase64;
    private String imagemSelfieBase64;
    private String statusValidacao;
    private String motivoFalha;

    private LocalDateTime dataHora;

    private String fabricanteDispositivo;
    private String modeloDispositivo;
    private String sistemaOperacional;
    private String ipOrigem;
    private Double latitude;
    private Double longitude;

    public RegistroValidacaoDocumento() {}

    public RegistroValidacaoDocumento(String cpf, String imagemDocumentoBase64, String imagemSelfieBase64,
                                      String statusValidacao, String motivoFalha, LocalDateTime dataHora,
                                      String fabricanteDispositivo, String modeloDispositivo,
                                      String sistemaOperacional, String ipOrigem,
                                      Double latitude, Double longitude) {
        this.cpf = cpf;
        this.imagemDocumentoBase64 = imagemDocumentoBase64;
        this.imagemSelfieBase64 = imagemSelfieBase64;
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

    public String getImagemDocumentoBase64() {
        return imagemDocumentoBase64;
    }

    public void setImagemDocumentoBase64(String imagemDocumentoBase64) {
        this.imagemDocumentoBase64 = imagemDocumentoBase64;
    }

    public String getImagemSelfieBase64() {
        return imagemSelfieBase64;
    }

    public void setImagemSelfieBase64(String imagemSelfieBase64) {
        this.imagemSelfieBase64 = imagemSelfieBase64;
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


