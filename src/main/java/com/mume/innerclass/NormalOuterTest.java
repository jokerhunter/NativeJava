package com.mume.innerclass;

public class NormalOuterTest {
    public static void main(String[] args) {
        NormalOuter normalOuter = new NormalOuter();
        NormalOuter.NormalInner normalInner = normalOuter.new NormalInner();
        normalInner.show();
    }
}
