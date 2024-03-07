package com.mume.Module_1_JavaSE_Basic.Innerclass;

public class NormalOuter {
    private int cnt = 1;

    public class NormalInner {
        private int cnt = 2;

        public NormalInner() {
            System.out.println("normal inner class's constructor");
        }

        public void show() {
            System.out.println("outer class's cnt value:" + cnt);// 1
            System.out.println("cnt=" + cnt );// 2
        }

        public void show02(int cnt) {
            System.out.println("形参：" + cnt);// 0
            System.out.println("NormalInner cnt：" + this.cnt);// 2
            System.out.println("NormalOuter cnt：" + NormalOuter.this.cnt);// 1
        }
    }

    public static void main(String[] args) {
        NormalOuter normalOuter = new NormalOuter();
        NormalOuter.NormalInner normalInner = normalOuter.new NormalInner();
        normalInner.show();
        normalInner.show02(0);
    }
}
