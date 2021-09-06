package com.wechat.mp;


import com.wechat.mp.infrastructure.account.AccountConfigureFactory;
import com.wechat.mp.infrastructure.account.WechatAccountRegister;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.Map;

/**
 * @author luoyangwei
 */
class WechatMpServiceRegister implements ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;

    /**
     * 账号配置工厂实例化
     * {@link AccountConfigureFactory} 是mp-developers的基础服务,让我们可以使用账号
     *
     * @return {@link AccountConfigureFactory}
     */
    @Primary
    @Bean
    public AccountConfigureFactory accountConfigureFactory() {
        return new AccountConfigureFactory();
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        AccountConfigureFactory accountConfigureFactory = new AccountConfigureFactory();
        Map<String, WechatAccountRegister> wechatAccountRegisterBeans = applicationContext.getBeansOfType(WechatAccountRegister.class);
        for (String beanName : wechatAccountRegisterBeans.keySet()) {
            wechatAccountRegisterBeans.get(beanName).registerAccount(accountConfigureFactory);
        }
    }
}
