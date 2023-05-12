package com.mume.enumclass;

public class DirectionEnumTest {
    public static void main(String[] args) {
        DirectionEnum[] arrays = DirectionEnum.values();
        for (DirectionEnum arr: arrays) {
            arr.show();
        }
    }
}
