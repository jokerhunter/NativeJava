package com.mume.Module_2_2_DesignPattern.DecoratorPattern;

public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable sourceable) {
        this.source = sourceable;
    }


    @Override
    public void method() {
        source.method();
        System.out.println("化妆之后你会更美！");
    }
}
