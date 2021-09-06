package com.wechat.mp.infrastructure.account;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 账号配置工厂
 *
 * @author luoyangwei
 */
public class AccountConfigureFactory {

    private static final List<WechatAccount> WECHAT_ACCOUNT_LIST = new CopyOnWriteArrayList<>();


    public void setAccount(WechatAccount account) {
        WECHAT_ACCOUNT_LIST.add(account);
    }


    public List<WechatAccount> getAccountRecords() {
        return WECHAT_ACCOUNT_LIST;
    }

}
