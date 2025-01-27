package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.actor;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-14 23:54
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("恶魔");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("披风");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("无");
    }

    public boolean isBareheaded() {
        return true;
    }
}
