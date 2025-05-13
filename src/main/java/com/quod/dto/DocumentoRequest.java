package com.quod.dto;

public class DocumentoRequest {

    private String cpf;
    private String imagemDocumentoBase64;
    private String imagemSelfieBase64;

    private Dispositivo dispositivo;
    private Metadados metadados;

    public DocumentoRequest() {}

    public DocumentoRequest(String cpf, String imagemDocumentoBase64, String imagemSelfieBase64,
                            Dispositivo dispositivo, Metadados metadados) {
        this.cpf = cpf;
        this.imagemDocumentoBase64 = imagemDocumentoBase64;
        this.imagemSelfieBase64 = imagemSelfieBase64;
        this.dispositivo = dispositivo;
        this.metadados = metadados;
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

