package com.app.entity;

import java.io.Serializable;

public class Login implements Serializable {

    private Long id;
    private String sourceIp;
    private String source;
    private String loginTime;
    private String system;
    private String browserType;

    public Login() {
    }

    public Login(Long id, String sourceIp, String source, String loginTime, String system, String browserType) {
        this.id = id;
        this.sourceIp = sourceIp;
        this.source = source;
        this.loginTime = loginTime;
        this.system = system;
        this.browserType = browserType;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    /**
     * 设置
     * @param sourceIp
     */
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * 获取
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取
     * @return loginTime
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * 设置
     * @param loginTime
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取
     * @return system
     */
    public String getSystem() {
        return system;
    }

    /**
     * 设置
     * @param system
     */
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * 获取
     * @return browserType
     */
    public String getBrowserType() {
        return browserType;
    }

    /**
     * 设置
     * @param browserType
     */
    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public String toString() {
        return "Login{id = " + id + ", sourceIp = " + sourceIp + ", source = " + source + ", loginTime = " + loginTime + ", system = " + system + ", browserType = " + browserType + "}";
    }
}
