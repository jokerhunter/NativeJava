package com.mume.Module_1_JavaSE_Basic.Innerclass;

public class AnonymousInterfaceTest {
    public static void test(AnonymousInterface anonymousInterface) {
        anonymousInterface.show();
    }

    public static void main(String[] args) {
        AnonymousInterfaceTest ait = new AnonymousInterfaceTest();
        test(new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("anonymous interface");
            }
        });
        test(()->{
            System.out.println("ajkassdfjkajkfd");
        });
    }
}
