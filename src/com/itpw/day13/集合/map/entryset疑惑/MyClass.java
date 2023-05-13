package com.itpw.day13.集合.map.entryset疑惑;

import java.util.Map;

public class MyClass {

    // 静态内部类
    static class InnerClass<K,V> implements Map.Entry<K,V>{
        @Override
        public K getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }

}
