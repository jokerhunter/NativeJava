package com.mume.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        boolean b1 = c1.add(new String("one"));
        ArrayList c2 = new ArrayList();
        c2.add("adfa");;
        c2.add(23);

        System.out.println("c1 exist " + c1.contains("one"));

        ArrayList c3 = new ArrayList();
        c3.add(new Person("aa", 12));
        c3.add(23);
        c3.add("adfa");
        System.out.println("c3 contains " + c3.contains(new Person("aa", 12)));
        System.out.println("c3 contains " + c3.containsAll(c2));
    }
}
