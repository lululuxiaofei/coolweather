package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//创建一个总的实例类来引用刚刚创建的各个实体类
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    //由于daily_forecast中包含的是一个数组，索引这里引用了List集合来引用Forecast类
    public List<Forecast> forecastList;
}
