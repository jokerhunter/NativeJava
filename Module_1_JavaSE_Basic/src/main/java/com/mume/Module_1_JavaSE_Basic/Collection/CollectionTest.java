package com.mume.Module_1_JavaSE_Basic.Collection;

import java.util.*;

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

        // pdai
        ArrayList<Object> objects = new ArrayList<>();
        LinkedList<Object> objects1 = new LinkedList<>();
        Stack<Object> objects2 = new Stack<>();
        ArrayDeque<Object> objects7 = new ArrayDeque<>();
        PriorityQueue<Object> objects3 = new PriorityQueue<>();
        // Map, Set
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        HashSet<Object> objects4 = new HashSet<>();
        LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();
        LinkedHashSet<Object> objects5 = new LinkedHashSet<>();
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
        TreeSet<Object> objects6 = new TreeSet<>();
        WeakHashMap<Object, Object> objectObjectWeakHashMap = new WeakHashMap<>();

        PriorityQueue<Object> objectPriorityQueue = new PriorityQueue<>();


    }
}
