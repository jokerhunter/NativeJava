package com.mume.Module_2_2_DesignPattern.creationalPatterns.abstractFactory.skin;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-13 23:51
 */
public interface SkinFactory {
    Button createButton();

    TextField createTextField();
    ComboBox createComboBox();
}
