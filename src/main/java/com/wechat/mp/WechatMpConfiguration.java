package com.wechat.mp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(WechatMpProperties.class)
@ConditionalOnClass(WechatMpServiceRegister.class)
@Import(WechatMpServiceRegister.class)
public class WechatMpConfiguration {
}
