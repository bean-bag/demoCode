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
            File f = new File("data_10k.xml");
            SAXReader reader = new SAXReader();
            Document doc = reader.read(f);
            Element root = doc.getRootElement();
            Element foo;
            for (Iterator<?> i = root.elementIterator("VALUE"); i.hasNext();) {
                foo = (Element) i.next();
                System.out.print("车牌号码:" + foo.elementText("NO"));
                System.out.println(" 车主地址:" + foo.elementText("ADDR"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + " 毫秒");
    }
}
