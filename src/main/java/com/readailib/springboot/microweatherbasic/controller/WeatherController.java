package com.readailib.springboot.microweatherbasic.controller;

import com.readailib.springboot.microweatherbasic.service.WeatherDataService;
import com.readailib.springboot.microweatherbasic.domain.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @program: micro-weather-basic
 * @description: 控制器层暴露了RESTful API 地址。
 * @Author: ReadAILib
 * @create: 2018-03-22 09:15
 **/
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {
    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getReportByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }
}
