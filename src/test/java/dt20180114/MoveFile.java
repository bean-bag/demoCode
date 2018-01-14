/**
 * Project Name:demoCode
 * File Name:CopyFile.java
 * Package Name:dt20180114
 * Date:2018年1月14日上午11:01:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package dt20180114;

import java.io.File;

/**
 * Description:   <br/>
 * Date:     2018年1月14日 上午11:01:47 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class MoveFile {

    public static void main(String[] args) {

        File dir = new File("E:\\teaching\\高校实训\\交职课件\\考核\\2015智交（2）");
        MoveFile.moveFile(dir, dir);
    }
    
    public static void moveFile(File dir,File dest){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.renameTo(new File(dest,file.getName()));
            }else {
                moveFile(file,dest);
            }
        }
    }

}

