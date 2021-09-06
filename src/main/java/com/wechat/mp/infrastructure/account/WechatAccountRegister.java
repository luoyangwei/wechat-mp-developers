package com.wechat.mp.infrastructure.account;

/**
 * 微信账号注册
 *
 * @author luoyangwei
 */
public interface WechatAccountRegister {


    /**
     * 注册配置
     *
     * @param accountConfigureFactory 账号配置工厂
     */
    void registerAccount(AccountConfigureFactory accountConfigureFactory);


}
