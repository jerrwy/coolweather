package com.example.waymon.coolweather.util;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public interface HttpCallbackListener {
    void onFinished(String response);
    void onError(Exception e);
}
