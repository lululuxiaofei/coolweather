package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * JSON格式的daily_forecast
 * "daily_forecast":[{"date":"2016-08-08",
 *                   "cond":{"txt_d":"阵雨"},
 *                   "tmp":{"max":34,"min":27}},
 *                   {"date":"2016-08-09",
 *                    "cond":{"txt_d":"多云"},
 *                    "tmp":{"max":35,"min":29}},
 *                    ....
 *                    }
 *
 *
 *
 */



public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature
    {
        public String max;
        public String min;
    }

    public class More
    {
        @SerializedName("txt_d")
        public String info;
    }
}
