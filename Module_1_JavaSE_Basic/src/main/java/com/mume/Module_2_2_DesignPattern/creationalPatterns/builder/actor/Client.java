package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.actor;

import com.mume.Module_2_2_DesignPattern.utils.XMLUtil;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-15 22:52
 */
public class Client {
    public static void main(String[] args) {
        // 1
        Object object = XMLUtil.getClassNameByFilenameFunction("Module_1_JavaSE_Basic/src/main/resources/designPatterns/builderFactory/actor_config.xml", "className");
        ActorBuilderSimple actorBuilderSimple = (ActorBuilderSimple) object;
        assert actorBuilderSimple != null;
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilderSimple);
        System.out.println(actor);

        // 2
        object = XMLUtil.getClassNameByFilenameFunction("Module_1_JavaSE_Basic/src/main/resources/designPatterns/builderFactory/actor_config.xml", "className2");
        ActorBuilderStatic actorBuilderStatic = (ActorBuilderStatic) object;
        assert actorBuilderStatic != null;
        Actor construct = ActorBuilderStatic.construct(actorBuilderStatic);
        System.out.println(construct);

        // 3
        object = XMLUtil.getClassNameByFilenameFunction("Module_1_JavaSE_Basic/src/main/resources/designPatterns/builderFactory/actor_config.xml", "className3");
        ActorBuilderImprove actorBuilderImprove = (ActorBuilderImprove) object;
        assert actorBuilderImprove != null;
        Actor construct1 = actorBuilderImprove.construct();
        System.out.println(construct1);

        // 钩子函数
        object = XMLUtil.getClassNameByFilenameFunction("Module_1_JavaSE_Basic/src/main/resources/designPatterns/builderFactory/actor_config.xml", "className4");
        ActorBuilder actorBuilder = (ActorBuilder) object;
        assert actorBuilder != null;
        Actor actor1 = actorBuilder.construct(actorBuilder);
        System.out.println(actor1);
    }
}
