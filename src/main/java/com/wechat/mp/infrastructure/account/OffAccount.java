package com.wechat.mp.infrastructure.account;

/**
 * 公众号账户
 *
 * @author luoyangwei
 */
public class OffAccount implements WechatAccount {


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
