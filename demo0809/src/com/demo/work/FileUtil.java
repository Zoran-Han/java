package com.demo.work;

import java.io.*;


/**
 * @ClassName FileUtil
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月11日  16:33:11
 * @Version 1.0.0
 */

public class FileUtil {

    /**
     * 复制指定路径的文件到指定目录
     * <p>
     * 判断文件的后缀，使用endWith()判断，
     * 能复制图像文件（jpg、jpeg、png、gif）此方法equalsIgnoreCase()不区分大小写
     * 若未指定目录，则设置默认存放在系统的当前用户目录下mycopyfiles（获得用户当前目录，getProperty（）方法）
     * @param fromFile 文件路径
     * @param toFile   目标路径
     */
    public void copyFiles(File fromFile, File toFile) throws Exception {

        //如果目标文件为空，则默认复制到当前用户的默认目录下
        if (toFile==null){
            //获得当前用户的默认目录
            StringBuffer stringBuffer = new StringBuffer(System.getProperty("user.home"));
            stringBuffer.append("\\copy");
            System.out.println(stringBuffer);
            toFile = new File(stringBuffer.toString());

        }
        if (fromFile.isDirectory()) {

            //获取目录中文件及子目录的数组
            File[] files = fromFile.listFiles();
            for (File file : files) {
                //递归
                copyFiles(file, toFile);

            }
        } else {
            if (fromFile.getName().toLowerCase().endsWith(".jpg") ||
                    fromFile.getName().toLowerCase().endsWith(".png") ||
                    fromFile.getName().toLowerCase().endsWith(".gif") ||
                    fromFile.getName().toLowerCase().endsWith(".jpeg")) {

                InputStream is = new FileInputStream(fromFile);
                OutputStream os = new FileOutputStream(toFile+"\\"+fromFile.getName());
                byte[] b = new byte[1024 * 1024];
                int temp ;
                while ((temp = is.read(b)) > 0 ) {
                    os.write(b, 0, temp);
                }

                //关闭流
                is.close();
                os.close();
            }
        }

    }


    public static void main(String[] args) {

        try {
            FileUtil fu = new FileUtil();
            File from = new File("E:\\ChianSoft\\fromFile");
            File to = new File("E:\\ChianSoft\\toFile");
            fu.copyFiles(from, to);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
