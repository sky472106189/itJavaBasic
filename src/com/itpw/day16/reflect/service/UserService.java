package com.itpw.day16.reflect.service;

/*
 用户业务类
*/
public class UserService  {

    /**
     * 登录
     * @param name 用户名
     * @param password 密码
     * @return
     */
    public boolean login(String name,String password){
        if("admin".equals(name)&&"admin".equals(password)){
            return true;
        }
        return false;
    }

    /**
     * 注销
     */
    public void logout(){
        System.out.println("安全退出");
    }
}
