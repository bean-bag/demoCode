/**
 * Project Name:demoCode
 * File Name:FileDemo.java
 * Package Name:chapter2.lesson8
 * Date:2018年1月6日上午11:06:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson8;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 上午11:06:52 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class FileDemo {
    private final static Logger LOG = Logger.getLogger(FileDemo.class);

    public static void main(String[] args) {
        FileDemo fd = new FileDemo();
        
        fd.listDir();
    }

    public static void fileInfo() {
        // 目录的分隔符，如果用反斜杠，必须用两个，因为一个反斜杠，是表示转义符；
        String path1 = "D:\\fileDirDemo\\Hellosorld.java";// windows系统下使用
        // 目录的分隔符，用正斜杠，也可以
        String path2 = "D:/fileDirDemo/Hellosorld.java";// linux系统下使用

        File file = new File(path1);

        if (file.exists()) {
            String name = file.getName();
            String path = file.getPath();
            LOG.info("file.name:" + name);
            LOG.info("file.path:" + path);
            if (file.isFile()) {
                LOG.info("指定路径指向一个文件");
            } else {
                LOG.info("指定路径指向一个目录");
            }

        } else {
            LOG.info("指定路径的文件不存在");
        }

    }

    public void listDir() {
        String path = "E:\\dt59\\homework\\github\\liutao\\src\\main\\java\\dt59homework";

        File file = new File(path);

        String[] files = file.list();

        for (String name : files) {
           StringBuffer fullPath = new StringBuffer();
           fullPath.append(path);
           fullPath.append(File.separator);
           fullPath.append(name);
           File tmpFile = new File(fullPath.toString());
           if(tmpFile.isDirectory()){
               LOG.info("目录："+name);               
           }else{
               LOG.info("文件 ："+fullPath.toString());
           }
        }
    }
    
    
    
}
