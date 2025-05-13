package com.quod.dto;

public class ResultadoConsolidadoDTO {

    private String cpf;
    private String biometriaFacial;
    private String biometriaDigital;
    private String documentoscopia;
    private String simSwap;
    private Integer score;

    public ResultadoConsolidadoDTO() {
    }

    public ResultadoConsolidadoDTO(String cpf, String biometriaFacial,
                                   String biometriaDigital, String documentoscopia,
                                   String simSwap, Integer score) {
        this.cpf = cpf;
        this.biometriaFacial = biometriaFacial;
        this.biometriaDigital = biometriaDigital;
        this.documentoscopia = documentoscopia;
        this.simSwap = simSwap;
        this.score = score;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBiometriaFacial() {
        return biometriaFacial;
    }

    public void setBiometriaFacial(String biometriaFacial) {
        this.biometriaFacial = biometriaFacial;
    }

    public String getBiometriaDigital() {
        return biometriaDigital;
    }

    public void setBiometriaDigital(String biometriaDigital) {
        this.biometriaDigital = biometriaDigital;
    }

    public String getDocumentoscopia() {
        return documentoscopia;
    }

    public void setDocumentoscopia(String documentoscopia) {
        this.documentoscopia = documentoscopia;
    }

    public String getSimSwap() {
        return simSwap;
    }

    public void setSimSwap(String simSwap) {
        this.simSwap = simSwap;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}


