/**
 * Project Name:demoCode
 * File Name:dd.java
 * Package Name:lesson20180112
 * Date:2018年1月12日上午2:08:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson20180112;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Description:   <br/>
 * Date:     2018年1月12日 上午2:08:39 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */



public class SaxXMLReader {

    public static void main(String arge[]) {
        long lasting = System.currentTimeMillis();
        try {
            
            //1、构造文件对象
            File f = new File("xmldata.xml");
            
            //2、构造解析对象
            SAXReader reader = new SAXReader();
            //reader.setValidation(true);
            
            //3、把文件对象，解析为文档对象
            Document doc = reader.read(f);
            
            //4、获取根节点
            Element root = doc.getRootElement();
            
            //5、迭代读取所有子节点
            Element foo;
            for (Iterator<?> i = root.elementIterator("VALUE"); i.hasNext();) {
                foo = (Element) i.next();
                                                  //获取文本内容
                System.out.print("车牌号码:" + foo.elementText("NO"));
                System.out.println(" 车主地址:" + foo.elementText("ADDR"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + " 毫秒");
    }
}
