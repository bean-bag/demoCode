/**
 * Project Name:demoCode
 * File Name:dd.java
 * Package Name:lesson20180112
 * Date:2018年1月12日上午2:14:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson20180112;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Description:   <br/>
 * Date:     2018年1月12日 上午2:14:10 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */


public class DomXMLReader {

    public static void main(String arge[]) {
        long lasting = System.currentTimeMillis();
        try {
            File f = new File("data_10k.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            NodeList nl = doc.getElementsByTagName("VALUE");
            for (int i = 0; i < nl.getLength(); i++) {
                System.out.print("车牌号码:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
                System.out.println(" 车主地址:" + doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + " 毫秒");
    }
}
