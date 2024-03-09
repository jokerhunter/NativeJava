package com.mume.Module_2_2_DesignPattern.DecoratorPattern;

public class SourceableTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
//        source.method();

        Sourceable sourceable1 = new Decorator(source);
        sourceable1.method();
    }
}
