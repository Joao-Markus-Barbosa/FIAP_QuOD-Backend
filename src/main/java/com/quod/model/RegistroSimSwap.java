package com.quod.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "sim_swap")
public class RegistroSimSwap {

    @Id
    private String id;

    private String cpf;
    private String telefone;
    private String statusValidacao;
    private String motivoFraude;
    private LocalDateTime dataVerificacao;

    private String fabricanteDispositivo;
    private String modeloDispositivo;
    private String sistemaOperacional;

    private String ipOrigem;
    private Double latitude;
    private Double longitude;

    public RegistroSimSwap() {}

    public RegistroSimSwap(String cpf, String telefone, String statusValidacao, String motivoFraude,
                           LocalDateTime dataVerificacao,
                           String fabricanteDispositivo, String modeloDispositivo, String sistemaOperacional,
                           String ipOrigem, Double latitude, Double longitude) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.statusValidacao = statusValidacao;
        this.motivoFraude = motivoFraude;
        this.dataVerificacao = dataVerificacao;
        this.fabricanteDispositivo = fabricanteDispositivo;
        this.modeloDispositivo = modeloDispositivo;
        this.sistemaOperacional = sistemaOperacional;
        this.ipOrigem = ipOrigem;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters e Setters
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getStatusValidacao() { return statusValidacao; }

    public void setStatusValidacao(String statusValidacao) { this.statusValidacao = statusValidacao; }

    public String getMotivoFraude() { return motivoFraude; }

    public void setMotivoFraude(String motivoFraude) { this.motivoFraude = motivoFraude; }

    public LocalDateTime getDataVerificacao() { return dataVerificacao; }

    public void setDataVerificacao(LocalDateTime dataVerificacao) { this.dataVerificacao = dataVerificacao; }

    public String getFabricanteDispositivo() { return fabricanteDispositivo; }

    public void setFabricanteDispositivo(String fabricanteDispositivo) { this.fabricanteDispositivo = fabricanteDispositivo; }

    public String getModeloDispositivo() { return modeloDispositivo; }

    public void setModeloDispositivo(String modeloDispositivo) { this.modeloDispositivo = modeloDispositivo; }

    public String getSistemaOperacional() { return sistemaOperacional; }

    public void setSistemaOperacional(String sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }

    public String getIpOrigem() { return ipOrigem; }

    public void setIpOrigem(String ipOrigem) { this.ipOrigem = ipOrigem; }

    public Double getLatitude() { return latitude; }

    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }

    public void setLongitude(Double longitude) { this.longitude = longitude; }
}


