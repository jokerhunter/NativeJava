package com.mume.Module_1_JavaSE_Basic.JavaSPI;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: SPI Test
 * @date: 2024-03-09 13:59
 * @version: 1.0
 */
public class SPITestSearch {
    public static void main(String[] args) {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            Search search =  iterator.next();
            search.searchDoc("hello world");
            System.out.println("hello");
        }
    }
}
