package com.novus.entity;


// ログインのユーザーのentityクラス
public class User {
    private String usrId;
    private String usrPassword;

    /**
     * @return Gets the value of usrId and returns usrId
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     * Sets the usrId
     * You can use getUsrId() to get the value of usrId
     */
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    /**
     * @return Gets the value of usrPassword and returns usrPassword
     */
    public String getUsrPassword() {
        return usrPassword;
    }

    /**
     * Sets the usrPassword
     * You can use getUsrPassword() to get the value of usrPassword
     */
    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }
}
