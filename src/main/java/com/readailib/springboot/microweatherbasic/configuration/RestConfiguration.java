package com.readailib.springboot.microweatherbasic.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*
 * @program: micro-weather-basic
 * @description: RestConfiguration 是 RestTemplate 的配置类。
 * @Author: ReadAILib
 * @create: 2018-03-22 09:14
 **/
@Service
public class RestConfiguration {
    @Autowired
    private RestTemplateBuilder builder;

    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }
}
