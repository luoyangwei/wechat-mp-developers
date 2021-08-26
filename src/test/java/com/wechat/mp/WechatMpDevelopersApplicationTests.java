package com.wechat.mp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = {WechatMpConfiguration.class})
@TestPropertySource("classpath:application.yml")
class WechatMpDevelopersApplicationTests {

    @Test
    void contextLoads() {
    }

}
