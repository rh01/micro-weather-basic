package com.readailib.springboot.microweatherbasic.domain;

import java.io.Serializable;
import java.util.List;

/*
 * @program: micro-weather-basic
 * @description: 天气通用接口
 * @Author: ReadAILib
 * @create: 2018-03-22 09:01
 **/
public class Weather implements Serializable{
    private static final long serialVersionUID = 1L;

    private String city;     // 城市
    private String aqi;     // 空气指数
    private String wendu;   // 温度
    private String ganmao; // 提示信息，感冒
    private Yesterday yesterday; //昨天的数据信息
    private List<Forecast> forecast;//未来的数据信息

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }




}
