package com.itpw.day11.enum_learn;

/*
 * 枚举实现接口
 *   情况二：所有枚举的draw()方法执行的方法体各不相同
 *      实现匿名内部类的方式即可
 * */
public class EnumDemo04 {
    public static void main(String[] args) {
        Sex.MAN.speak();
        Sex.WOMAN.speak();
        Sex.NOMAN.speak();
    }
}

interface Speakable{
    void speak();
}

enum Sex implements Speakable{
    MAN("男","大男子主义"){
        @Override
        public void speak() {
            System.out.println("我是男人，大男子主义万岁");
        }
    },
    WOMAN("女","女权主义"){
        @Override
        public void speak() {
            System.out.println("我是女生，漂亮的女生");
        }
    },
    NOMAN("扶她","和平主义"){
        @Override
        public void speak() {
            System.out.println("不敢发表评论");
        }
    };



    private String sexName;
    private String sexDes;

    Sex(String sexName, String sexDes) {
        this.sexName = sexName;
        this.sexDes = sexDes;
    }
}
