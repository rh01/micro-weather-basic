package com.readailib.springboot.microweatherbasic.domain;

import java.io.Serializable;

/*
 * @program: micro-weather-basic
 * @description: 整个消息的返回对象
 * @Author: ReadAILib
 * @create: 2018-03-22 09:06
 **/
public class WeatherResponse implements Serializable{
    private static final long serialVersionUID = 1L;

    private Weather data; // 消息数据
    private String status; // 消息状态
    private String desc; // 消息描述


    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
