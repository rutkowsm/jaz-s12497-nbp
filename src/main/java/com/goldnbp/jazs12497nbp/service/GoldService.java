package com.goldnbp.jazs12497nbp.service;

import com.goldnbp.jazs12497nbp.entity.GoldRate;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoldService {

    public static final String RATES_URL = "http://api.nbp.pl/api/cenyzlota";

    private final RestTemplate restTemplate;


    public GoldService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GoldRate getCurrentGoldRate(){
        return this.restTemplate.exchange(RATES_URL + "/", HttpMethod.GET, null, GoldRate.class).getBody();
    }
}
