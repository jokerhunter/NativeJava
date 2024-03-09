package com.mume.Module_1_JavaSE_Basic.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonMethodTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.mume.Module_1_JavaSE_Basic.Reflection.Person");
            Constructor constructor = clazz.getConstructor(String.class, int.class);
            Object object = constructor.newInstance("mume", 32);

            Method method = clazz.getMethod("getName");
            System.out.println("调用方法的返回值是：" + method.invoke(object));

            Method[] methods = clazz.getMethods();
            for (Method mt : methods) {
                System.out.println("修饰符：" + mt.getModifiers());
                System.out.println("返回值类型是：" + mt.getReturnType());
                System.out.println("方法名称是：" + mt.getName());
                System.out.println("形参列表类型：");
                Class<?>[] parameterTypes = mt.getParameterTypes();
                for (Class ct : parameterTypes) {
                    System.out.println(ct + " ");
                }
                System.out.println("异常类型:");
                Class<?>[] exceptionTypes = mt.getExceptionTypes();
                for (Class ex : exceptionTypes) {
                    System.out.println(ex + " ");
                }
                System.out.println("---------------------------");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
