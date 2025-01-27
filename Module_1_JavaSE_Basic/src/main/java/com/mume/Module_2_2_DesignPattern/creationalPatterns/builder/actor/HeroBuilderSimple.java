package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.actor;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-14 23:54
 */
public class HeroBuilderSimple extends ActorBuilderSimple {
    @Override
    public void buildType() {
        actor.setType("hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("man");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("helm");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("straight");
    }
}
