package com.itpw.day08.访问控制权限;

/*
    private:私有的，只能在本类中被访问
    "缺省值":只能在本类，以及同包下访问
    protected:只能在本来，同包，子类中访问
    public:公开的，任何位置都可以访问

    访问控制权限          本类          同包          子类          任意位置
    -----------------------------------------------------------------------
    public                可以          可以         可以            可以
    protected             可以          可以         可以            不可以
    默认值                可以          可以         不可以          不可以
    private               可以          不可以       不可以          不可以

*/
public class User {
    private int id;
    protected int age;
    String name;
    public int weight;
}
