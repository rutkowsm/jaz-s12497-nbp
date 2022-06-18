package com.goldnbp.jazs12497nbp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GoldConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
