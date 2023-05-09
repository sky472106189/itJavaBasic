package com.itpw.day12.generic;

/*
    泛型方法和泛型类的组合注意事项
*/
public class GenericDemo03 {
    public static void main(String[] args) {
    }
}

class Generic<T>{
    public T t;

    // 0、泛型方法，使用T作为泛型方法表示，并且从形参返回值都是T
    // 推荐
    // 此同名的意义在于，由于是静态方法，可以【类名.】的方式调用
    // 并且通过传入的形参统一了类的泛型
    public static <T> T func(T t){
        System.out.println("执行");
        return t;
    }

    // 1、泛型方法。使用K作为泛型方法标识（以下都用K简称）
    // 没意义的用法
    public <K> void useGenericMethod1(){
        System.out.println(123);
    }

    // 2、泛型方法。 返回值使用K
    // 没意义
    // 因为永远不知道K什么类型
    public <K> K useGenericMethod2(){
        return (K)"123";
    }

    // 3、泛型方法。但是返回值使用T
    // 没意义
    // 因为这样不需要泛型方法也能做到
    // 而且这种强转很容易发生ClassCastException
    public <K> T useGenericMethod3(){
        return (T)new Integer(123);
    }

    // 4、泛型方法。返回值K，形参T
    // 没意义
    // 无法确定K的类型，(K)从未发生过作用，画蛇添足
    public <K> K useGenericMethod4(T data){
        return (K)new Integer(123);
    }

    // 5、泛型方法。返回值和形参都是K
    // 推荐
    // K是由形参传入确定类型的，对K进行一系列操作然后再返回K，
    public <K> K useGenericMethod5(K data){
        return data;
    }

    // 6、泛型方法。返回值T，形参使用K
    // 不推荐
    // 这种强转很容易发生ClassCastException
    // 因为你无法永远保证K和T存在继承关系
    public <K> T useGenericMethod6(K data){
        return (T)data;
    }

    // 1、静态泛型方法 void返回值
    // 无意义
    // 这有什么价值吗？泛型K都没发挥作用
    public static <K> void useStaticGenericMethod1(){
        System.out.println("void");
    }

    // 2、静态泛型方法，K返回值
    // 不推荐
    // 未知K的类型
    public static <K> K useStaticGenericMethod2(){
        return (K)"123";
    }

    // 3、静态泛型方法，K返回值，T形参
    // 编译报错
    // 因为是静态方法，而泛型标识T是属于类的，而泛型方法的标识是<K>
    // 理解: E是静态级别的泛型 T是类级别的泛型，当完成类初始化时，此时只有E已知，而T是未知的
    // public static <K> K useStaticGenericMethod3(T t){
    //     return (K)"123";
    // }

    // 4、静态泛型方法，K返回值，K形参
    // 常见用法
    // 泛型K发挥了作用，且完全脱离了泛型T，泛型K又形参确定
    public static <K> K useStaticGenericMethod4(K t){
        return (K)"123";
    }

    // 5、静态泛型方法，T返回值，K形参
    // 编译报错
    // 和4、一样，静态优先级更高，此时K一直，而T未知
    // public static <K> T useStaticGenericMethod5(K t){
    //     return (T)"123";
    // }
}
