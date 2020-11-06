package com.example.coolweather.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 和服务器交互
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback)
    {
        //OkHttpClient client = new OkHttpClient();
        //传入请求地址
        Request request = new Request.Builder().url(address).build();


        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(60000, TimeUnit.MILLISECONDS)
                .readTimeout(60000, TimeUnit.MILLISECONDS)
                .build();

        //注册一个回调来处理服务器响应
        client.newCall(request).enqueue(callback);
    }
}
