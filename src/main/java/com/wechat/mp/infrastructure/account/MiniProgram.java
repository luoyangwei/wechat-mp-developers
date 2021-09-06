package com.wechat.mp.infrastructure.account;

/**
 * 小程序
 *
 * @author luoyangwei
 */
public class MiniProgram implements WechatAccount {


    private String appId;


    private String secret;


    public void setAppId(String appId) {
        this.appId = appId;
    }


    public void setSecret(String secret) {
        this.secret = secret;
    }


    @Override
    public String getAppId() {
        return appId;
    }


    @Override
    public String getSecret() {
        return secret;
    }

}
