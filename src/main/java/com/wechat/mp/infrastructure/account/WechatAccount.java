package com.wechat.mp.infrastructure.account;

/**
 * 微信账户
 *
 * @author luoyangwei
 */
public interface WechatAccount {


    /**
     * 获取appId
     *
     * @return appId
     */
    String getAppId();


    /**
     * 获取秘钥
     *
     * @return secret
     */
    String getSecret();

}
