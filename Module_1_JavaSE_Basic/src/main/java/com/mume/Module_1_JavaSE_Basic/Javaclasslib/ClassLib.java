package com.mume.Module_1_JavaSE_Basic.Javaclasslib;

import java.util.Objects;

public class ClassLib {
    private int id;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassLib classLib = (ClassLib) o;
        return id == classLib.id && Objects.equals(code, classLib.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }

    public static void main(String[] args) {
        String a = "b";
        "a".equals(a);
    }
}
