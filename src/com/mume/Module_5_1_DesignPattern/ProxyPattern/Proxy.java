package com.mume.Module_5_1_DesignPattern.ProxyPattern;

import com.mume.Module_5_1_DesignPattern.DecoratorPattern.Source;
import com.mume.Module_5_1_DesignPattern.DecoratorPattern.Sourceable;

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
