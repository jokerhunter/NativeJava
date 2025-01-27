package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log;

import com.mume.Module_2_2_DesignPattern.utils.XMLUtil;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-09 00:00
 */
public class LogXmlUtil {
    public static Object getBean(String filePath) {
        return XMLUtil.getXmlValueByFilenameFunction(filePath, document -> {
            try {
                // 获取包含类名的文本节点
                NodeList nodeList = document.getElementsByTagName("className");
                Node firstChild = nodeList.item(0).getFirstChild();
                String cName = firstChild.getNodeValue();
                // 通过类名生成实例对象并返回
                Class<?> c = Class.forName(cName);
                return c.getConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        });
    }
}
