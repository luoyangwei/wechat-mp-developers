package com.wechat.mp.response;

import com.wechat.mp.infrastructure.ResponseCode;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResponseFactory {
    private static final Map<ResponseCode, WechatResponse> responseStrategyMap = new ConcurrentHashMap<>();


    public static void setWechatResponse(ResponseCode responseCode, WechatResponse wechatResponse) {
        responseStrategyMap.put(responseCode, wechatResponse);
    }


    public static WechatResponse get(ResponseCode responseCode) {
        return responseStrategyMap.get(responseCode);
    }


}
