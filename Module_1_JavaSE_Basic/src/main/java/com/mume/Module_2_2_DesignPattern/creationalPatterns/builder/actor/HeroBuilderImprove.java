package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.actor;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-14 23:54
 */
public class HeroBuilderImprove extends ActorBuilderImprove {
    @Override
    public void buildType() {
        actor.setType("hero_i");
    }

    @Override
    public void buildSex() {
        actor.setSex("man_i");
    }

    @Override
    public void buildFace() {
        actor.setFace("handsome_i");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("helm_i");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("straight_i");
    }
}
