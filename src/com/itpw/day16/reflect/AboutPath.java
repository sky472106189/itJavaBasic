package com.itpw.day16.reflect;

/*
    用相对路径获取绝对路径的方法：
        未来程序运行在linux系统，而linux是没有盘符的，所以这个方法还是有必要的

    前提:文件在类路径下，即在src包内或其子包下
*/
public class AboutPath {
    public static void main(String[] args) {
        /*
        解释:
            Thread.currentThread() 当前线程对象
            ClassLoader getContextClassLoader() 获取当前线程对象的类加载器对象
            getResource() 从类的根路径下加载资源
         */
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("com/itpw/day16/reflect/resouce/classinfo.properties").getPath();
        System.out.println(path);


    }
}
