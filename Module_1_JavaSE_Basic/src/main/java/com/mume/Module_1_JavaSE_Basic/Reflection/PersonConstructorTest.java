package com.mume.Module_1_JavaSE_Basic.Reflection;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class PersonConstructorTest {
    public static void main(String[] args) throws Exception {
        // 1.原始调用
        Person p1 = new Person();
        System.out.println("p1 = " + p1);

        // 2.使用反射机制以无参形式构造Person类型的对象并打印
//        System.out.println(new File(PersonConstructorTest.class.getResource("./").getPath()));
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(PersonConstructorTest.class.getResource("./class.txt").getPath())));
        String str1 = br.readLine();
        // 获取无参构造方法
        Class c1 = Class.forName(str1);
        Constructor constructor = c1.getConstructor();
        System.out.println("反射无参创建对象" + constructor.newInstance());
        // 获取有参构造方法
        constructor = c1.getConstructor(String.class, int.class);
        System.out.println("反射有参创建对象" + constructor.newInstance("mume", 12));

        // 获取c1的所有公共构造方法
        Constructor[] constructors = c1.getConstructors();
        for (Constructor ct : constructors) {
            System.out.println("构造方法访问修饰符：" + ct.getModifiers());
            System.out.println("构造方法的方法名称：" + ct.getName());
            Class[] parameterTypes = ct.getParameterTypes();
            System.out.println("构造方法的所有参数类型：");
            for (Class cs : parameterTypes) {
                System.out.println(cs);
            }
        }
    }
}
