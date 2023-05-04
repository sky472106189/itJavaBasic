package com.itpw.day12.generic.阿里大咖的优美泛型;

// java程序返回结果枚举
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS("20000", "success"),
    /**
     * 失败
     */
    FAIL("50000", "fail"),
    /**
     * 未决
     */
    UNKNOWN("30000", "unknown"),
    /**
     * 参数错误
     */
    ILLEGAL_ARGUMENT("50001", "illegal argument"),
    /**
     * token错误
     */
    ILLEGAL_TOKEN("50008", "illegal token"),
    /**
     * token错误
     */
    ILLEGAL_PERMISSION("50009", "illegal token"),
    /**
     * token错误
     */
    TOKEN_EXPIRED("50014", "token expired"),
    /**
     * token错误
     */
    SYSTEM_ERROR("50000", "system error"),
    /**
     * Other clients logged in
     */
    OTHER_CLIENT_LOGGED_IN("50012", "Other clients logged in");

    private String code;
    private String desc;

    ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
