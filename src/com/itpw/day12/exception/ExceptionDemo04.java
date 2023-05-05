package com.itpw.day12.exception;

public class ExceptionDemo04 {
    public static void main(String[] args) throws ClassNotFoundException{
        // 编译时异常与处理的方式一 异常上抛
        doSome();

        //方式二
        /*try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        // 运行时异常不需要预处理
        doOther();
    }

    /***
     * doSome方法在方法声明的位置上使用了:throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中，有可能出现ClassNotFoundException异常。
     * ClassNotFoundException继承自Exception，属于编译时异常
     * 所以调用此方法要预先处理
     * @throws ArithmeticException
     */
    public static void doSome() throws ClassNotFoundException{

    }

    /***
     * 这个代码表示doSome()方法在执行过程中，有可能出现ClassNotFoundException异常。
     * ArithmeticException继承自RuntimeException，属于运行时异常
     * 所以调用此方法不需要预先处理
     * @throws ArithmeticException
     */
    public static void doOther() throws ArithmeticException{

    }
}
