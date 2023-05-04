package com.itpw.day12.generic.阿里大咖的优美泛型;

public class Test {
    public static void main(String[] args) {
        Response<Boolean> res1 = Response.succeed(true);
        System.out.println(res1);
        Response<String> res2 = Response.succeed("我爱java");
        System.out.println(res2);

        Response<Object> fail = Response.fail("500", "错啦！");
        System.out.println(fail);
    }
}
