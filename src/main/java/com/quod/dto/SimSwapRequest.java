package com.quod.dto;

public class SimSwapRequest {

    private String cpf;
    private String telefone;
    private Dispositivo dispositivo;
    private Metadados metadados;

    public SimSwapRequest() {}

    public SimSwapRequest(String cpf, String telefone, Dispositivo dispositivo, Metadados metadados) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.dispositivo = dispositivo;
        this.metadados = metadados;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

