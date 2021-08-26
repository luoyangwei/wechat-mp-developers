package com.wechat.mp;

import com.wechat.mp.infrastructure.MpConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "wechat")
public class WechatMpProperties {


    private List<MpConfig> mpConfigs = new ArrayList<>();


    public List<MpConfig> getMpConfigs() {
        return mpConfigs;
    }


    public void setMpConfigs(List<MpConfig> mpConfigs) {
        this.mpConfigs = mpConfigs;
    }


}
