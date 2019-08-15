<<<<<<< HEAD
package com.demo.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName TestCommentWriter
 * 测试自定义装饰模式的类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  11:34:38
 * @Version 1.0.0
 */

public class TestCommentWriter {
    public static void main(String[] args) {

        try {
            CommentWriter out = new CommentWriter(
                    new FileWriter("src/com/demo/io/test.txt"));
            out.write("hello world！");
            out.close();
            System.out.println("文件写入成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
=======
package com.demo.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName TestCommentWriter
 * 测试自定义装饰模式的类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  11:34:38
 * @Version 1.0.0
 */

public class TestCommentWriter {
    public static void main(String[] args) {

        try {
            CommentWriter out = new CommentWriter(
                    new FileWriter("src/com/demo/io/test.txt"));
            out.write("hello world！");
            out.close();
            System.out.println("文件写入成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
>>>>>>> e366ada85f330a71896bda1991d88c84cf56984e
