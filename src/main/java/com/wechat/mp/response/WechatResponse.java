package com.wechat.mp.response;

import com.wechat.mp.infrastructure.ResponseCode;

public interface WechatResponse {


    ResponseCode getResponseCode();


    Object handle(String responseBody);

}
