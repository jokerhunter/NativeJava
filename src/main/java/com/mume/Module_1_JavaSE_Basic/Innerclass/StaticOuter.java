package com.mume.Module_1_JavaSE_Basic.Innerclass;

public class StaticOuter {
    private int cnt = 1;
    private static int snt = 2;

    public static class StaticInner {
        private int i = 3;

        public StaticInner() {
            System.out.println("static class constructor");
        }

        public void show() {
            System.out.println("i = " + i);
            System.out.println("static outer snt = " + snt);
//            System.out.println("static outer cnt = " + cnt); // Error: 静态上下文中不能访问非静态的成员，因此此时可能还没创建对象

        }
    }
}
