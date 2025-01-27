package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.actor;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-15 00:30
 */
public class ActorController {
    public Actor construct(ActorBuilderSimple builder) {
        Actor actor;
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        actor = builder.createActor();
        return actor;
    }
}
