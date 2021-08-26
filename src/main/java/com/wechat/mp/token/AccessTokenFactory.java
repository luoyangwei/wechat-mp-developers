package com.wechat.mp.token;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.wechat.mp.infrastructure.MpConfig;
import com.wechat.mp.infrastructure.UrlConstants;
import com.wechat.mp.response.AccessTokenSuccessfulHandler;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * access_token 工厂获取
 */
public class AccessTokenFactory {
    private static final Map<MpConfig, AccessToken> globalAccessTokenMap = new ConcurrentHashMap<>();


    /**
     * 获取/加载 access_token
     *
     * @param mpConfig 公众号配置
     * @return access_token
     */
    public static AccessToken load(MpConfig mpConfig) {
        AccessToken accessToken = globalAccessTokenMap.get(mpConfig);
        if (accessToken == null) {
            reload(mpConfig);
        }
        Objects.requireNonNull(accessToken, "未获取token");
        return accessToken;
    }


    /**
     * 重新加载 access_token
     *
     * @param mpConfig 公众号配置
     * @return access_token
     */
    public static AccessToken reload(MpConfig mpConfig) {
        String responseBody = HttpUtil.get(StrUtil.format(UrlConstants.ACCESS_TOKEN_REQUEST, mpConfig.getAppId(), mpConfig.getSecret()));
        AccessTokenSuccessfulHandler accessTokenSuccessfulStrategy = new AccessTokenSuccessfulHandler();
        AccessToken accessToken = accessTokenSuccessfulStrategy.handle(responseBody);
        globalAccessTokenMap.put(mpConfig, accessToken);
        return accessToken;
    }

}
