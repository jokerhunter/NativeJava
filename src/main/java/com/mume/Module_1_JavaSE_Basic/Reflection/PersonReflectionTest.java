package com.mume.Module_1_JavaSE_Basic.Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class PersonReflectionTest {
    public static void main(String[] args) {
        try {
            Class personClazz = Class.forName("com.mume.Module_1_JavaSE_Basic.Reflection.Person");
            System.out.println("包信息：" + personClazz.getPackage());
            System.out.println("父类信息：" + personClazz.getSuperclass());
            System.out.println("接口信息：");
            Class[] interfaces = personClazz.getInterfaces();
            for (Class ct : interfaces) {
                System.out.println(ct + " ");
            }
            System.out.println("");
            System.out.println("注解信息：");
            Annotation[] annotations = personClazz.getAnnotations();
            for (Annotation at : annotations) {
                System.out.println(at + " ");
            }
            System.out.println("泛型信息：");
            Type[] genericInterfaces = personClazz.getGenericInterfaces();
            for (Type tt : genericInterfaces) {
                System.out.println(tt + " ");
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
