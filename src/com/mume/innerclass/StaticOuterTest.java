package com.mume.innerclass;

public class StaticOuterTest {
    public static void main(String[] args) {
        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.show();
    }
}
