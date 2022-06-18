package com.goldnbp.jazs12497nbp.entity;

import java.util.ArrayList;

public class GoldRateQueryResult {

    private ArrayList<GoldRate> rates;

    public GoldRateQueryResult(ArrayList<GoldRate> rates) {
        this.rates = rates;
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
                "rates=" + rates +
                '}';
    }
}
