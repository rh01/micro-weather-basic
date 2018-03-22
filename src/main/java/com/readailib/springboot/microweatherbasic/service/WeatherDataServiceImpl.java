package com.readailib.springboot.microweatherbasic.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.readailib.springboot.microweatherbasic.domain.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/*
 * @program: micro-weather-basic
 * @description: WeatherDataService接口的实现
 * @Author: ReadAILib
 * @create: 2018-03-22 09:09
 **/
@Service
public class WeatherDataServiceImpl implements WeatherDataService{
    @Autowired
    private RestTemplate restTemplate; //REST应用必须要有的

    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";


    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_API + "?citykey=" + cityId;
        return this.doGetWeatherData(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_API + "?city=" + cityName;
        return this.doGetWeatherData(uri);
    }


    private WeatherResponse doGetWeatherData(String uri) {
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        String strBody = null;

        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }

        ObjectMapper mapper = new ObjectMapper();//创建ObjectMapper实例，用于转化json数据
        WeatherResponse weather = null;

        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return weather;
    }
}
