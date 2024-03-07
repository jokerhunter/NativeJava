package com.mume.Module_1_JavaSE_Basic.Generic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<? extends Animal> list1 = new ArrayList<>();
//        list1.add(new Animal());
//        list1.add(new Dog());
//        list1.add(new Organisms());
        list1.get(1);
        List<? super Animal> list2 = new ArrayList<>();
//        list2.add(new Organisms());
        list2.add(new Dog());
        list2.add(new Animal());
        try {
            FileOutputStream fos = new FileOutputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
