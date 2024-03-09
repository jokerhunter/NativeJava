package com.mume.Module_1_JavaSE_Basic.Reflection;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 使用数据类型.class的方式可以获取对应类型的class对象
        Class c1 = String.class;
        System.out.println("c1 = " + c1); // java.lang.String
        c1 = int.class;
        System.out.println("c1 = " + c1); // int
        c1 = void.class;
        System.out.println("c1 = " + c1); // void

        // 2. 使用.getClass()的方式获取对应的class对象
        String str1 = new String("hello");
        c1 = str1.getClass();
        System.out.println("c1 = " + c1); // class java.lang.String

        // 3.使用包装类TYPE的方式来获取对应基本数据类型CLass对象
        c1 = Integer.TYPE;
        System.out.println("c1 = " + c1);  // int

        c1 = Integer.class;
        System.out.println("c1 = " + c1); // class java.util.Date

        // 4. 调用Class类中的forName()方法来获取对应的class对象
        c1 = Class.forName("java.lang.String");
        System.out.println("c1 = " + c1); // class java.lang.String

        c1 = Class.forName("java.util.Date");
        System.out.println("c1 = " + c1); // class java.util.Date


        System.out.println("---------------------------------------");
        // 5.使用类加载器的方式来获取class对象
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        c1 = classLoader.loadClass("java.lang.String");
        System.out.println("c1 = " + c1);
    }
}
