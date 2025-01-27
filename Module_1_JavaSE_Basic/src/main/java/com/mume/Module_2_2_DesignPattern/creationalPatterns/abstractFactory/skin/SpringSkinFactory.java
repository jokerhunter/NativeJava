package com.mume.Module_2_2_DesignPattern.creationalPatterns.abstractFactory.skin;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-13 23:55
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
