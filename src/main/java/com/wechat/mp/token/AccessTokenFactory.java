package com.wechat.mp.token;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.wechat.mp.infrastructure.MpConfig;
import com.wechat.mp.infrastructure.UrlConstants;
import com.wechat.mp.infrastructure.account.AccountConfigureFactory;
import com.wechat.mp.infrastructure.account.WechatAccount;
import com.wechat.mp.response.AccessTokenSuccessfulHandler;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * access_token 工厂获取
 *
 * @author luoyangwei
 */
public class AccessTokenFactory {
    private static final Map<WechatAccount, AccessToken> GLOBAL_ACCESS_TOKEN_MAP = new ConcurrentHashMap<>();
//    private final AccountConfigureFactory accountConfigureFactory;
//    private final List<WechatAccount> accounts;
//    private final Iterator<WechatAccount> iterator;
//
//
//    public AccessTokenFactory(AccountConfigureFactory accountConfigureFactory) {
//        this.accountConfigureFactory = accountConfigureFactory;
//        this.accounts = accountConfigureFactory.getAccountRecords();
//        this.iterator = accountConfigureFactory.getAccountRecords().iterator();
//    }

    /**
     * 获取/加载 access_token
     *
     * @param account 公众号配置
     * @return access_token
     */
    public static AccessToken load(WechatAccount account) {
        AccessToken accessToken = GLOBAL_ACCESS_TOKEN_MAP.get(account);
        if (accessToken == null) {
            accessToken = reload(account);
        }
        Objects.requireNonNull(accessToken, "未获取token");
        return accessToken;
    }


    /**
     * 重新加载 access_token
     *
     * @param account 配置
     * @return access_token
     */
    public static AccessToken reload(WechatAccount account) {
        String responseBody = HttpUtil.get(StrUtil.format(UrlConstants.ACCESS_TOKEN_REQUEST, account.getAppId(), account.getSecret()));
        AccessTokenSuccessfulHandler accessTokenSuccessfulStrategy = new AccessTokenSuccessfulHandler();
        AccessToken accessToken = accessTokenSuccessfulStrategy.handle(responseBody);
        GLOBAL_ACCESS_TOKEN_MAP.put(account, accessToken);
        return accessToken;
    }

}
