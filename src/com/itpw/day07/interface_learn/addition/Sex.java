package com.itpw.day07.interface_learn.addition;

/***
 * 性别枚举类
 */
public enum Sex {

    MAN("男",1),
    WOMAN("女",2),
    UNKNOWN("未知",0);

    private String desc;
    private int code;

    Sex(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public int getCode() {
        return code;
    }

}
