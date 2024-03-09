package com.mume.Module_1_JavaSE_Basic.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PersonFieldTest {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("com.mume.Module_1_JavaSE_Basic.Reflection.Person");

        Constructor constructor = c1.getConstructor(String.class, int.class);
        Object object = constructor.newInstance("mume", 20);
        Field field = c1.getDeclaredField("name");
        // 设置java语言访问检查的取消  暴力反射
        field.setAccessible(true);
        System.out.println("获取成员变量数值为" + (field.getModifiers() == 1 ? field.get(object) : "private"));

        // 修改对象object的成员变量值
        // 属性为private，不能修改
        field.set(object, "lucas");   // Exception in thread "main" java.lang.IllegalAccessException
        System.out.println("获取成员变量数值为" + field.get(object));

        Field[] declaredFields = c1.getDeclaredFields();
        for (Field ft : declaredFields) {
            System.out.println("访问修饰符：" + ft.getModifiers());
            System.out.println("数据类型：" + ft.getType());
            System.out.println("变量名：" + ft.getName());
            System.out.println("------------------------------------");
        }

    }
}
