/**
 * Project Name:dt59mehomework
 * File Name:Hw20180106.java
 * Package Name:Hw20180106
 * Date:2018年1月6日下午7:16:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180106;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午7:16:30 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class Work1 {
    private final static Logger LOG = Logger.getLogger(Work1.class);
    public static void main(String[] args) {
        printFile(new File("E:\\dt59\\homework\\github"), 1);
    }

    public static void printFile(File file, int tab) {
        if (file.isFile()) {
            LOG.info("您给定的是一个文件"); // 判断给定目录是否是一个合法的目录，如果不是，输出提示
        } else {
            File[] fileLists = file.listFiles(); // 如果是目录，获取该目录下的内容集合

            for (int i = 0; i < fileLists.length; i++) { // 循环遍历这个集合内容
                for (int j = 0; j < tab; j++) { // 输出缩进
                    //LOG.info("|---");
                    System.out.print("|-");
                }

                //LOG.info(fileLists[i].getName()); // 输出元素名称
                System.out.println(fileLists[i].getName());
                if (fileLists[i].isDirectory()) { // 判断元素是不是一个目录
                    printFile(fileLists[i], tab + 1); // 如果是目录，继续调用本方法来输出其子目录，因为是其子目录，所以缩进次数
                                                      // + 1
                }
            }
        }
    }

}
