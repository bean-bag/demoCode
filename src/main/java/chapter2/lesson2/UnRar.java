/**
 * Project Name:demoCode
 * File Name:UnWar.java
 * Package Name:chapter2.lesson2
 * Date:2017年12月25日下午11:13:01
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson2;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//import org.apache.tools.ant.Project;
//import org.apache.tools.ant.taskdefs.Expand;

//import com.github.junrar.Archive;
//import com.github.junrar.rarfile.FileHeader;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午11:13:01 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class UnRar {

    public static void main(String[] args) throws Exception {

        File dir = new File("E:\\包俊文");

       /* File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("zip");
            }
        });
        for (File file : files) {
            unzip2(file);
        }*/
        
        
        File[] files2 = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("rar");
            }
        });
        for (File file : files2) {
            unrar(file);
        }
    }

    public static void unzip(File source) throws IOException {
        if (source.exists()) {
            ZipInputStream zis = null;
            BufferedOutputStream bos = null;
            try {
                zis = new ZipInputStream(new FileInputStream(source));
                ZipEntry entry;
                while ((entry = zis.getNextEntry()) != null && !entry.isDirectory()) {
                    File target = new File(source.getParent(), entry.getName());
                    if (!target.getParentFile().exists()) {
                        target.getParentFile().mkdirs();
                    }
                    bos = new BufferedOutputStream(new FileOutputStream(target));
                    int read;
                    byte[] buffer = new byte[1024 * 10];
                    while ((read = zis.read(buffer, 0, buffer.length)) != -1) {
                        bos.write(buffer, 0, read);
                    }
                    bos.flush();
                }
                zis.closeEntry();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                closeQuietly(zis, bos);
            }
        }
    }

    private static void closeQuietly(Closeable... closeables) throws IOException {

        if (closeables != null) {
            for (Closeable closeable : closeables) {
                if (closeable != null) {
                    closeable.close();
                }
            }
        }

    }

    static void unzip2(File sourceZip) throws Exception {/*
        try {
            Project p = new Project();
            Expand e = new Expand();
            e.setProject(p);
            e.setSrc(sourceZip);
            e.setOverwrite(false);
            String name = sourceZip.getName();
            name = name.substring(0, name.indexOf('.'));
            File dest = new File(sourceZip.getParentFile(), name);
            if (!dest.exists()) {
                dest.mkdirs();
            }
            e.setDest(dest);
            
            // ant下的zip工具默认压缩编码为UTF-8编码， 而winRAR软件压缩是用的windows默认的GBK或者GB2312编码
            // 所以解压缩时要制定编码格式
             
            e.setEncoding("gbk");
            e.execute();
        } catch (Exception e) {
            throw e;
        }
    */}

    static void unrar(File sourceRar) throws Exception {/*
        Archive a = null;
        FileOutputStream fos = null;
        try {
            a = new Archive(sourceRar);
            FileHeader fh = a.nextFileHeader();
            while (fh != null) {
                if (!fh.isDirectory()) {
                    // 1 根据不同的操作系统拿到相应的 destDirName 和 destFileName
//                    String compressFileName = fh.getFileNameString().trim();
//                    String destFileName = "";
//                    String destDirName = "";
                    
                    String name = sourceRar.getName();
                    name = name.substring(0, name.indexOf('.'));
                    
                    File dir = new File(sourceRar.getParentFile(),name);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    
//                    String destDir = dir.getAbsolutePath();
//                    // 非windows系统
//                    if (File.separator.equals("/")) {
//                        destFileName = destDir + compressFileName.replaceAll("\\\\", "/");
//                        destDirName = destFileName.substring(0, destFileName.lastIndexOf("/"));
//                        // windows系统
//                    } else {
//                        destFileName = destDir + compressFileName.replaceAll("/", "\\\\");
//                        destDirName = destFileName.substring(0, destFileName.lastIndexOf("\\"));
//                    }
                    // 2创建文件夹
//                    File dir = new File(destDirName);
//                    if (!dir.exists() || !dir.isDirectory()) {
//                        dir.mkdirs();
//                    }
                    // 3解压缩文件
                    fos = new FileOutputStream(new File(destFileName)dir);
                    a.extractFile(fh, fos);
                    fos.close();
                    fos = null;
                }
                fh = a.nextFileHeader();
            }
            a.close();
            a = null;
        } catch (Exception e) {
            throw e;
        } finally {
            closeQuietly(fos, a);
        }
    */}
}
