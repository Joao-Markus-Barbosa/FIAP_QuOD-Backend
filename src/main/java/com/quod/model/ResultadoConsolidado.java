package com.quod.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "resultado_consolidado")
public class ResultadoConsolidado {

    @Id
    private String id;

    @Field("cpf")
    private String cpf;

    @Field("biometria_facial")
    private String biometriaFacial;

    @Field("biometria_digital")
    private String biometriaDigital;

    @Field("documentoscopia")
    private String documentoscopia;

    @Field("sim_swap")
    private String simSwap;

    @Field("score")
    private Integer score; // ✅ campo adicionado

    @Field("data_atualizacao")
    private LocalDateTime dataAtualizacao;

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getBiometriaFacial() { return biometriaFacial; }
    public void setBiometriaFacial(String biometriaFacial) { this.biometriaFacial = biometriaFacial; }

    public String getBiometriaDigital() { return biometriaDigital; }
    public void setBiometriaDigital(String biometriaDigital) { this.biometriaDigital = biometriaDigital; }

    public String getDocumentoscopia() { return documentoscopia; }
    public void setDocumentoscopia(String documentoscopia) { this.documentoscopia = documentoscopia; }

    public String getSimSwap() { return simSwap; }
    public void setSimSwap(String simSwap) { this.simSwap = simSwap; }

    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }

    public LocalDateTime getDataAtualizacao() { return dataAtualizacao; }
    public void setDataAtualizacao(LocalDateTime dataAtualizacao) { this.dataAtualizacao = dataAtualizacao; }
}

