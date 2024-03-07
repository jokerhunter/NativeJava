package com.mume.Module_1_JavaSE_Basic.Serializable;

import java.io.*;

public class SerializableClassTest {

    public static void main(String[] args) {
        SerializableClassTest sct = new SerializableClassTest();
        sct.writeFile();
        sct.readFile();
    }

    private void writeFile() {
        SerializableList<String> serializableList = new SerializableList();
        serializableList.setElementData("serializableTest");
        System.out.println("serializable before:" + serializableList.getElementData());
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.tmp"))) {
            oos.writeObject(serializableList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFile() {
        SerializableList serializableList;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.tmp"))) {
            serializableList = (SerializableList) ois.readObject();
            System.out.println("serializable after:" + serializableList.getElementData());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
