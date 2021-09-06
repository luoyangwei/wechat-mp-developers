package com.wechat.mp.token;

/**
 * token 实例对象
 *
 * @author luoyangwei
 */
public class AccessToken {


    /**
     * 全局token
     */
    private String accessToken;


    /**
     * 生成token的时间
     */
    private Long createTokenTime;


    /**
     * 超时时长
     */
    private Integer expiresIn;


    /**
     * 偏移30秒
     */
    private Integer deviation = 30;


    /**
     * 检查token是否可用
     *
     * @param nowDatetime 当前时间戳
     * @return 检查结果
     */
    public boolean available(long nowDatetime) {
        return nowDatetime < createTokenTime + expiresIn - deviation;
    }


    public String getAccessToken() {
        return accessToken;
    }


    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    public Integer getExpiresIn() {
        return expiresIn;
    }


    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }


    public void setCreateTokenTime(Long createTokenTime) {
        this.createTokenTime = createTokenTime;
    }


    public Integer getDeviation() {
        return deviation;
    }


    public void setDeviation(Integer deviation) {
        this.deviation = deviation;
    }


}
