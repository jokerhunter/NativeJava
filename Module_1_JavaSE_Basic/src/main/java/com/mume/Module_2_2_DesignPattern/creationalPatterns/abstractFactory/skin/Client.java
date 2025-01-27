package com.mume.Module_2_2_DesignPattern.creationalPatterns.abstractFactory.skin;

import com.mume.Module_2_2_DesignPattern.utils.XMLUtil;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-13 23:58
 */
public class Client {
    public static void main(String[] args) {
        Object obj = XMLUtil.getXmlValueByFilenameFunction("Module_1_JavaSE_Basic/src/main/resources/designPatterns/abstractFactory/skin_config.xml", document -> {
            try {
                NodeList nodeList = document.getElementsByTagName("className");
                Node item = nodeList.item(0).getFirstChild();
                String cName = item.getNodeValue();
                Class<?> c = Class.forName(cName);
                return c.getConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        SkinFactory factory = (SkinFactory) obj;
        Button button = factory.createButton();
        button.display();
    }
}
