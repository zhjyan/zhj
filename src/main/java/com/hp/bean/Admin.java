package com.hp.bean;

import java.io.Serializable;

/**
 * admin
 * @author 
 */
public class Admin implements Serializable {
    /**
     * 管理员编号
     */
    private Integer aid;

    /**
     * 账户
     */
    private String aname;

    /**
     * 密码
     */
    private String apwd;

    /**
     * 真实i姓名
     */
    private String realname;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}