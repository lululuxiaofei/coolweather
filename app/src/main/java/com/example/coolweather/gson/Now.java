package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;


/**
 * JSON格式的now
 * "now":{"tmp":"29",
 *          "cond":{"txt":"阵雨"}}
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
