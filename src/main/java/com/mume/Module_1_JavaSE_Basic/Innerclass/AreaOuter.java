package com.mume.Module_1_JavaSE_Basic.Innerclass;

public class AreaOuter {
    private int cnt = 1;

    public void show() {
        class AreaInner {
            private int i = 2;

            public AreaInner() {
                System.out.println("局部内部类的构造方法");
            }

            public void test() {
                System.out.println("i = " + i);
                System.out.println("cnt = " + cnt);
            }
        }

        AreaInner ai = new AreaInner();
        ai.test();
    }
}
