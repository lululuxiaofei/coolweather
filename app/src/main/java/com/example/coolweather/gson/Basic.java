package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * JSON格式的basic
 * "basic":{"city":"苏州",
 *          "id":CN101190401,
 *          "update":{"loc":"2016-08-08 21:58"}}
 */

public class Basic {

    //JSON格式中的一些字段不太适合直接作为JAVA字段来命名，
    //所以使用@SerializedName注解让JSON字段和java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
