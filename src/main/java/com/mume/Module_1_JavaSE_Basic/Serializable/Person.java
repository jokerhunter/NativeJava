package com.mume.Module_1_JavaSE_Basic.Serializable;

import java.io.Serializable;

/**
 * @author mume
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 25737086561639807L;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
