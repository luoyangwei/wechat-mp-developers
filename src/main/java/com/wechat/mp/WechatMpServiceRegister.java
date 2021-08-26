package com.wechat.mp;


import com.wechat.mp.infrastructure.MpConfig;
import com.wechat.mp.response.ResponseFactory;
import com.wechat.mp.response.WechatResponse;
import com.wechat.mp.token.AccessTokenFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

class WechatMpServiceRegister implements ApplicationContextAware, InitializingBean {


    private WechatMpProperties wechatMpProperties;

    @Autowired
    public void setWechatMpProperties(WechatMpProperties wechatMpProperties) {
        this.wechatMpProperties = wechatMpProperties;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBeansOfType(WechatResponse.class).values().forEach(wechatResponse ->
                ResponseFactory.setWechatResponse(wechatResponse.getResponseCode(), wechatResponse));
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        List<MpConfig> mpConfigs = wechatMpProperties.getMpConfigs();
        for (MpConfig mpConfig : mpConfigs) {
            AccessTokenFactory.load(mpConfig);
        }
    }


}
