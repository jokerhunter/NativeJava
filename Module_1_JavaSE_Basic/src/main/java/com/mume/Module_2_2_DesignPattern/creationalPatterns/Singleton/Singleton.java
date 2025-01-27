package com.mume.Module_2_2_DesignPattern.creationalPatterns.Singleton;

public class Singleton {
    // 1.声明本类类型的引用指向本类类型的对象并使用private static 关键字修饰
    private static Singleton singleton = null;

//    static {
//        singleton.
//    }

    // 2.私有化构造方法，使用private关键字修饰
    private Singleton() {}

    // 3.提供共有的get方法将上述对象返回出去，使用public static关键字修饰
    public static /*synchronized*/ Singleton getSingleton() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
