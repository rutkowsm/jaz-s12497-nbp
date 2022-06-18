package com.goldnbp.jazs12497nbp.service;

import com.goldnbp.jazs12497nbp.entity.GoldRate;
import com.goldnbp.jazs12497nbp.entity.GoldRateQueryResult;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoldService {

    public static final String RATES_URL = "http://api.nbp.pl/api/cenyzlota";

    private final RestTemplate restTemplate;

    public GoldService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GoldRateQueryResult getCurrentGoldRate(){
        return this.restTemplate.exchange(RATES_URL + "/", HttpMethod.GET, null, GoldRateQueryResult.class).getBody();
    }

    public GoldRateQueryResult getGoldRateByDate(String effectiveDate){
        return this.restTemplate.exchange(RATES_URL + "/" + effectiveDate + "/", HttpMethod.GET, null, GoldRateQueryResult.class).getBody();
    }


}
