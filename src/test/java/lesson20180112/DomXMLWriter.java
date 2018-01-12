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
        return builder.newDocument();

    }

    public void createXml(Document doc, String fileName) {
        
        Element root = doc.createElement("employees");
        doc.appendChild(root);
        Element employee = doc.createElement("employee");
        Element name = doc.createElement("name");
        name.appendChild(doc.createTextNode("张三"));
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
            DOMSource source = new DOMSource(doc);
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            StreamResult result = new StreamResult(pw);
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
