package com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.xmlChart;

import com.mume.Module_2_2_DesignPattern.utils.XMLUtil;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-09 23:43
 */
public class XMLUtilChart {
    public static String getChartType() {
        return (String) XMLUtil.getXmlValueByFilenameFunction("Module_1_JavaSE_Basic/src/main/resources/designPatterns/simpleFactory/chart_config.xml",
                document -> {
                    NodeList n1 = document.getElementsByTagName("charType");
                    Node classNode = n1.item(0).getFirstChild();
                    return classNode.getNodeValue().trim();
                });
        /*try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("Module_1_JavaSE_Basic/src/main/resources/chart_config.xml"));
//            doc = builder.parse(XMLUtil.getClass().getClassLoader().getResource(""));
            NodeList n1 = doc.getElementsByTagName("charType");
            Node classNode = n1.item(0).getFirstChild();
            return classNode.getNodeValue().trim();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
            return null;
        }*/
    }
}
