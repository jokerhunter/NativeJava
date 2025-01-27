package com.mume.Module_2_2_DesignPattern.creationalPatterns.abstractFactory.skin;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-13 23:55
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return null;
    }

    @Override
    public ComboBox createComboBox() {
        return null;
    }
}
