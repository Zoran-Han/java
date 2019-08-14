package com.demo.file;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Timestamp;


/**
 * @ClassName com.demo.file.TestFile
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月09日  10:08:48
 * @Version 1.0.0
 */

public class TestFile {

    private MyFileNameFilter fileNameFilter = new MyFileNameFilter();

    /**
     * 自定义文件过滤器
     */
    class MyFileNameFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(".docx");
        }
    }


    //遍历文件夹

    /**
     * 打印输出，指定目录下所有文件，包括子集目录文件
     *
     * @param dirPath
     */
    public void printFileMessage(String dirPath, String prefix) {

        //创建目录对象
        File dir = new File(dirPath);
        //判断是否是目录
        if (!dir.isDirectory()) {
            return;
        }
        //获取目录中的文件及子目录的数组
        File[] files = dir.listFiles();
        for (File file : files) {
            //判断是否是目录
            if (file.isDirectory()) {
                System.out.println(prefix+file.getName());
                //递归
                printFileMessage(file.getPath(), prefix + "  ");
            } else {
                System.out.println(prefix+file.getName());
            }
        }


    }

    public static void main(String[] args) throws Exception {

        /* //创建目录的对象
        //文件名不区分大小写
        File dir = new File("E:\\Personal File\\图片");
        System.out.println(dir);
        //创建目录中的文件对象
        File file = new File(dir,"2019");
        System.out.println(file);
        //URL（统一资源定位符） 和 URI（通用资源标志符）
        System.out.println(file.toURL());
        System.out.println(file.toURI());
        //获得文件的路径
        System.out.println(file.getPath());
        //获得父级目录
        //返回file对象 ，注意：file重写了toString（）方法，输出的也是文件路径
        System.out.println(file.getParentFile());
        //获得父级目录的路径
        //返回字符串路径
        System.out.println(file.getParent());
        //获得文件绝对路径
        System.out.println(file.getAbsolutePath());
        //获得文件名
        System.out.println(file.getName());
        //判断是否是文件
        System.out.println(file.isFile());
        //判断是否是目录
        System.out.println(file.isDirectory());
        //判断文件是否存在
        System.out.println(file.exists());
        System.out.println(new File(dir,"work.txt").exists());
        //获得文件大小
        System.out.println(file.length());
        //获得文件创建时间
        System.out.println(new Timestamp(file.lastModified()));
        //创建一个目录，在目录中创建文件
        File subDir = new File(dir,"test");
        subDir.mkdir();
        File subFile = new File(subDir,"text.txt");
        subFile.createNewFile();
*/
        //练习：获得指定目录下的所有文件，包括自己目录下的文件

        /*//获得并输出Professional File目录下的所有文件
        File dir = new File("E:\\Professional File");
        //获得目录及文件的数组
        File[] files = dir.listFiles();
        //遍历文件数组
        for (File file :files ){
                System.out.println(file.getPath());
            }
 */

       /* TestFile tf = new TestFile();
        tf.printFileMessage("E:\\Personal File\\文档","");
*/

    }
}


