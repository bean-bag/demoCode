/**
 * Project Name:demoCode
 * File Name:DomXMLWriter.java
 * Package Name:lesson20180112
 * Date:2018年1月12日上午2:21:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson20180112;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 * Description: <br/>
 * Date: 2018年1月12日 上午2:21:43 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class DomXMLWriter {

    public static void main(String[] args) throws ParserConfigurationException {
        String fileName ="employee.xml";
        DomXMLWriter dxw = new DomXMLWriter();
        dxw.createXml(dxw.newDoc(), fileName);
    }

    public Document newDoc() throws ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        //新建doc对象
        return builder.newDocument();

    }

    public void createXml(Document doc, String fileName) {
        
        //1、创建一个节点元素（标签）
        Element root = doc.createElement("employees");
        //2、把新建的元素，追加到文档对象中；
        doc.appendChild(root);
        
        Element employee = doc.createElement("employee");
        Element name = doc.createElement("name");
        
        //3、创建文本节点对象
        Text text = doc.createTextNode("张三");
        //4、把新建的元素，追加到需要添加的节点对象中；
        name.appendChild(text);
        
        
        employee.appendChild(name);
        Element sex = doc.createElement("sex");
        sex.appendChild(doc.createTextNode("m"));
        employee.appendChild(sex);
        Element age = doc.createElement("age");
        age.appendChild(doc.createTextNode("30"));
        employee.appendChild(age);
        root.appendChild(employee);
        
        
        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            
            Transformer transformer = tf.newTransformer();            
            
            
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            
            //5、构造一个写对象
            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            
            //6、通过写文件对象，构造一个流结果。
            StreamResult result = new StreamResult(pw);
            
            //7、把文档对象封装成一个代码区
            DOMSource source = new DOMSource(doc);
            
            //8、把两部分合并到文件中。
            transformer.transform(source, result);
            
            System.out.println("生成XML文件成功!");
        } catch (TransformerConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
