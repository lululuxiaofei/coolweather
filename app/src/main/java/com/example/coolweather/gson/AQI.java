package com.example.coolweather.gson;

/**
 * JSON格式的aqi
 * "aqi":{"city":{"aqi":"44","pm25":"13"}}
 */

public class AQI {

    public AQICity city;
    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
