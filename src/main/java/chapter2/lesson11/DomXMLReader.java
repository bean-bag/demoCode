/**
 * Project Name:demoCode
 * File Name:dd.java
 * Package Name:lesson20180112
 * Date:2018年1月12日上午2:14:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson11;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Description:   <br/>
 * Date:     2018年1月12日 上午2:14:10 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */


public class DomXMLReader {
    private final static Logger LOG = LoggerFactory.getLogger(DomXMLReader.class);
    
    public static void main(String arge[]) {
        long lasting = System.currentTimeMillis();
        try {
            File f = new File("xmldata.xml");
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
           
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            org.w3c.dom.Document doc = builder.parse(f);
            
            org.w3c.dom.NodeList nl = doc.getElementsByTagName("VALUE");
           
            for (int i = 0; i < nl.getLength(); i++) {
                NodeList childList = doc.getElementsByTagName("NO");
                
                Node elementNode = childList.item(i);
                String eValue = elementNode.getNodeValue();
                LOG.info("标签值：{}",eValue);
                Node textNode = elementNode.getFirstChild(); //文本算一个隐藏的节点        
                
                String no = textNode.getNodeValue();
                String id = ((Element)elementNode).getAttribute("id");//获取属性
                LOG.info("车牌ID:{}", id);
                LOG.info("车牌号码:{}" , no);
                LOG.info("车主地址:{}",doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOG.info("运行时间：{}" , (System.currentTimeMillis() - lasting) + " 毫秒");
    }
}
