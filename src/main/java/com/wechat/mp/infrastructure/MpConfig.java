package com.wechat.mp.infrastructure;

import java.util.Objects;

public class MpConfig {


    /**
     * 微信app id
     */
    private String appId;

    /**
     * 微信app 秘钥
     */
    private String secret;


    public String getAppId() {
        return appId;
    }


    public void setAppId(String appId) {
        this.appId = appId;
    }


    public String getSecret() {
        return secret;
    }


    public void setSecret(String secret) {
        this.secret = secret;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MpConfig mpConfig = (MpConfig) o;
        return Objects.equals(getAppId(), mpConfig.getAppId()) && Objects.equals(getSecret(), mpConfig.getSecret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppId(), getSecret());
    }

}
