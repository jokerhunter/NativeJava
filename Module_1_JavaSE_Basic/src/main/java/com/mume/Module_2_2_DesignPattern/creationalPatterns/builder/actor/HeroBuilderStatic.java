package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.actor;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-14 23:54
 */
public class HeroBuilderStatic extends ActorBuilderStatic {
    @Override
    public void buildType() {
        actor.setType("hero_s");
    }

    @Override
    public void buildSex() {
        actor.setSex("man_s");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome_s");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("helm_s");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("straight_s");
    }
}
