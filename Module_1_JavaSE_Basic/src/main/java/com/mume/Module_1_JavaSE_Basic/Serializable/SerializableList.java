package com.mume.Module_1_JavaSE_Basic.Serializable;

import java.io.*;

public class SerializableList<T> implements Serializable {
    private static final long serialVersionUID = -4059150234143248397L;

    private transient T elementData;

    public SerializableList() {
    }

    public T getElementData() {
        return elementData;
    }

    public void setElementData(T elementData) {
        this.elementData = elementData;
    }

    private void writeObject(java.io.ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        outputStream.writeObject(elementData);
        System.out.println("writeObject of "+this.getClass().getName());
    }

    private void readObject(java.io.ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        elementData = (T) inputStream.readObject();
        System.out.println("readObject of "+this.getClass().getName());
    }

    @Override
    public String toString() {
        return "SerializableList{" +
                "elementData=" + elementData +
                '}';
    }

}
