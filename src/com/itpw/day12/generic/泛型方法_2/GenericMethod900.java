package com.itpw.day12.generic.泛型方法_2;

/*
    泛型方法可变参数
      语法：
      public <E> void print(E... e){
          类体;
      }
*/
public class GenericMethod900 {
    public static void main(String[] args) {
        // 调用泛型可变参数方法
        Generic.doSome(1,2,3,4);
        Generic.doSome('A','B','C','D');
        Generic.doSome("我","是","中","国","人");
    }
}

class Generic{

    // 形参是 (E... var)
    public static <E> void doSome(E... e){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e);
        }
    }
}
