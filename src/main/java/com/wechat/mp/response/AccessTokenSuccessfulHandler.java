package com.wechat.mp.response;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.wechat.mp.infrastructure.GlobalCode;
import com.wechat.mp.infrastructure.ResponseCode;
import com.wechat.mp.token.AccessToken;
import org.springframework.stereotype.Component;

public class AccessTokenSuccessfulHandler implements WechatResponse {


    public AccessTokenSuccessfulHandler() {
    }


    @Override
    public ResponseCode getResponseCode() {
        return GlobalCode.SUCCESSFUL;
    }


    @Override
    public AccessToken handle(String responseBody) {
        AccessToken accessToken = new AccessToken();
        JSONObject jsonObject = JSONUtil.parseObj(responseBody);
        Object errCode = jsonObject.get("errcode");
        if (errCode == null) {
            accessToken.setAccessToken(jsonObject.getStr("access_token"));
            accessToken.setExpiresIn(jsonObject.getInt("expires_in"));
            accessToken.setCreateTokenTime(System.currentTimeMillis() / 1000);
            return accessToken;
        }
        GlobalCode globalCode = GlobalCode.getGlobalCode(String.valueOf(errCode));
        throw new RuntimeException(globalCode.toString());
    }


}
