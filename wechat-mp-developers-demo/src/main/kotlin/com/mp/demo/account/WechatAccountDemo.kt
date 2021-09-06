package com.mp.demo.account

import com.wechat.mp.infrastructure.account.AccountConfigureFactory
import com.wechat.mp.infrastructure.account.MiniProgram
import com.wechat.mp.infrastructure.account.WechatAccountRegister
import org.springframework.stereotype.Component

@Component
class WechatAccountDemo:WechatAccountRegister {

    override fun registerAccount(accountConfigureFactory: AccountConfigureFactory?) {
        val miniProgram = MiniProgram();
        accountConfigureFactory?.setAccount(miniProgram)
    }

}