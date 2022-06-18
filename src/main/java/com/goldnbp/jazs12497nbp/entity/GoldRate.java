package com.goldnbp.jazs12497nbp.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.Entity;

@JsonDeserialize
abstract class GoldRate {

    private String data;
    private double cena;

    public GoldRate() {
    }

    public GoldRate(String data, double cena) {
        this.data = data;
        this.cena = cena;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "goldRate{" +
                "data='" + data + '\'' +
                ", cena=" + cena +
                '}';
    }
}
