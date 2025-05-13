package com.quod.dto;

public class Metadados {
    private Double latitude;
    private Double longitude;
    private String ipOrigem;

    public Metadados() {
    }

    public Metadados(Double latitude, Double longitude, String ipOrigem) {
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getIpOrigem() {
        return ipOrigem;
    }

    public void setIpOrigem(String ipOrigem) {
        this.ipOrigem = ipOrigem;
    }
}


