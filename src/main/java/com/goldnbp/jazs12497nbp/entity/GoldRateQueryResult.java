package com.goldnbp.jazs12497nbp.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;

public class GoldRateQueryResult {

    @Enumerated(EnumType.STRING)
    private Metal metal;
    private ArrayList<GoldRate> rates;

    public GoldRateQueryResult() {
    }

    public GoldRateQueryResult(Metal metal, ArrayList<GoldRate> rates) {
        this.metal = metal;
        this.rates = rates;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public ArrayList<GoldRate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<GoldRate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "GoldRateQueryResult{" +
                "metal=" + metal +
                ", rates=" + rates +
                '}';
    }
}
