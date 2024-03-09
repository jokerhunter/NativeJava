package com.mume.Module_1_JavaSE_Basic.Serializable;

import java.io.*;

public class ExternalizableClassTest {
    public static void main(String[] args) {
        ExternalizableClassTest ect = new ExternalizableClassTest();
        ect.writeFile();
        ect.readFile();
    }

    private void writeFile() {
        Cat cat = new Cat();
        cat.setName("cccc");
        cat.setAge(12);
        System.out.println("serializable before:" + cat);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.tmp"))) {
            oos.writeObject(cat);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFile() {
        Cat cat;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat.tmp"))) {
            cat = (Cat) ois.readObject();
            System.out.println("serializable after:" + cat);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
