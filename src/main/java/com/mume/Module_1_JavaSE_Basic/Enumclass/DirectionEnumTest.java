package com.mume.Module_1_JavaSE_Basic.Enumclass;

public class DirectionEnumTest {
    public static void main(String[] args) {
        DirectionEnum[] arrays = DirectionEnum.values();
        for (DirectionEnum arr: arrays) {
            arr.show();
        }
    }
}
