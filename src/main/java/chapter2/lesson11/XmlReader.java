/**
 * Project Name:demoCode
 * File Name:XmlReader.java
 * Package Name:chapter2
 * Date:2018年1月12日上午10:52:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson11;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Description: <br/>
 * Date: 2018年1月12日 上午10:52:50 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class XmlReader {
    private final static Logger LOG = LoggerFactory.getLogger(XmlReader.class);

    private static String[] TYPES = new String[] { "", "ELEMENT_NODE", "ATTRIBUTE_NODE", "TEXT_NODE",
            "CDATA_SECTION_NODE", "ENTITY_REFERENCE_NODE", "ENTITY_NODE", "PROCESSING_INSTRUCTION_NODE", "COMMENT_NODE",
            "DOCUMENT_NODE", "DOCUMENT_TYPE_NODE", "DOCUMENT_FRAGMENT_NODE", "NOTATION_NODE" };

    public static void main(String[] args) {

        
        File f = new File("D:\\git\\demoCode\\employee.xml");
        try {
            
            Document doc = builder(f);
            // 输出文档节点对象
            print(doc);
            // doc

            //获取文档的第一个子节点
            Node fNode = doc.getFirstChild();
            print(fNode);
            // employees
            
            Node fcNode = fNode.getFirstChild();
            print(fcNode);
            // 换行
            
            //获取下一个兄弟节点
            Node nextNode = fcNode.getNextSibling();
            print(nextNode);
            // employee
            //
            fcNode.getNextSibling().getFirstChild();// 换行
            fcNode.getNextSibling().getFirstChild().getNextSibling();// name
            fcNode.getNextSibling().getFirstChild().getNextSibling().getFirstChild();//

            Node xxNode = fcNode.getNextSibling().getFirstChild().getNextSibling().getFirstChild().getNextSibling();
            LOG.info("xxNode:[{}]", xxNode);
            LOG.info("nextNode:[{}]", xxNode.getParentNode().getChildNodes().item(2));
            
            //获取父级节点
            Node parentNode = xxNode.getParentNode();
            
            //获取所有子节点
           NodeList list =  xxNode.getChildNodes();
            

            print(fcNode.getNextSibling().getFirstChild().getNextSibling().getFirstChild());

        } catch (ParserConfigurationException e) {

            // Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void print(Node node) {
        String name = node.getNodeName();
        String value = node.getNodeValue();
        short type = node.getNodeType();

        LOG.info("type:{}\tname:{}\tvalue:{}", TYPES[type], name, value);
    }

    /**
     * 把xml文件解析成一个document对象
     *
     * @author junwen.bao
     * @param filePath
     * @return
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public static Document builder(String filePath) throws ParserConfigurationException, SAXException, IOException {
        // 构建一个文件对象
        File file = new File(filePath);
        
        return builder(file);
    }

    /**
     * 把xml文件解析成一个document对象
     *
     * @author junwen.bao
     * @param file
     * @return
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public static Document builder(File file) throws ParserConfigurationException, SAXException, IOException {

        // 1、通过文档建造者工厂的静态方法，获取一个该工厂的实例
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        // 2、文档建造者工厂，生产一个新的文档建造者
        DocumentBuilder bd = dbf.newDocumentBuilder();

        // 3、文档建造者，解析指定的文件对象，返回文档对象
        return bd.parse(file);
    }
}
