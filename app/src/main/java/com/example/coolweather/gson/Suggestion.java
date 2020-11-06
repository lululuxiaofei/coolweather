package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * JSON格式的suggestion
 * "suggestion":{
 *          "comf":{"txt":"天气不舒适"},
 *          "cw":{"txt":"不宜洗车"},
 *          "sport":{"txt":"有降水"}}
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    //json中的sport字段可以被理解，很合适作为java字段，所以这里不需要做注解
    public Sport sport;

    public class Comfort
    {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash
    {
        @SerializedName("txt")
        public String info;

    }

    public class Sport
    {
        @SerializedName("txt")
        public String info;

    }
}
