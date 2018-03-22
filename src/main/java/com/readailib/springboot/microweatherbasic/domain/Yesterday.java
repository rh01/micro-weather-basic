package com.readailib.springboot.microweatherbasic.domain;

import java.io.Serializable;

/*
 * @program: micro-weather-basic
 * @description: 昨日天气信息
 * @Author: ReadAILib
 * @create: 2018-03-22 09:03
 **/
public class Yesterday implements Serializable{
    private static final long serialVersionUID = 1L;

    private String date;//日期
    private String high;//最高温度
    private String fx;//风向
    private String low;//最低温度
    private String fl;//风力
    private String type;//类型


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

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
