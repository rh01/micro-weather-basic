package com.readailib.springboot.microweatherbasic.domain;

import java.io.Serializable;

/*
 * @program: micro-weather-basic
 * @description: 未来天气信息
 * @Author: ReadAILib
 * @create: 2018-03-22 09:04
 **/
public class Forecast implements Serializable{
    private static final long serialVersionUID = 1L;

    private String date; //日期
    private String high; //最高温度
    private String fengxiang;   //风向
    private String low; //最低温度
    private String fengli;  //风力
    private String type; //类型

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFengxiang() {
        return fengxiang;
    }

    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFengli() {
        return fengli;
    }

    public void setFengli(String fengli) {
        this.fengli = fengli;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
