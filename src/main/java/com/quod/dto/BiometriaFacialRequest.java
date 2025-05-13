package com.quod.dto;

public class BiometriaFacialRequest {

    private String cpf;
    private String imagemBase64;

    private Dispositivo dispositivo;
    private Metadados metadados;

    public BiometriaFacialRequest() {
    }

    public BiometriaFacialRequest(String cpf, String imagemBase64, Dispositivo dispositivo, Metadados metadados) {
        this.cpf = cpf;
        this.imagemBase64 = imagemBase64;
        this.dispositivo = dispositivo;
        this.metadados = metadados;
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

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Metadados getMetadados() {
        return metadados;
    }

    public void setMetadados(Metadados metadados) {
        this.metadados = metadados;
    }
}


