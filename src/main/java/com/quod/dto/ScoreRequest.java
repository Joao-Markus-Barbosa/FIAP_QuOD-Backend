package com.quod.dto;

public class ScoreRequest {

    private String cpf;
    private Dispositivo dispositivo;
    private Metadados metadados;

    public ScoreRequest() {}

    public ScoreRequest(String cpf, Dispositivo dispositivo, Metadados metadados) {
        this.cpf = cpf;
        this.dispositivo = dispositivo;
        this.metadados = metadados;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
