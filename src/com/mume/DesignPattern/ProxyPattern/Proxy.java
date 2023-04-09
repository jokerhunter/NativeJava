package com.mume.DesignPattern.ProxyPattern;

import com.mume.DesignPattern.DecoratorPattern.Source;
import com.mume.DesignPattern.DecoratorPattern.Sourceable;

public class Proxy implements Sourceable {
    private Sourceable source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        source.method();
        System.out.println("代理--代理化妆后会更美美");
    }
}
