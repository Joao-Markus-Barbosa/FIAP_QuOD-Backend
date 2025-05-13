package com.quod.dto;

public class Dispositivo {
    private String fabricante;
    private String modelo;
    private String sistemaOperacional;

    public Dispositivo() {
    }

    public Dispositivo(String fabricante, String modelo, String sistemaOperacional) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}


