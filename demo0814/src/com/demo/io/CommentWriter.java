<<<<<<< HEAD
package com.demo.io;

import java.io.IOException;
import java.io.Writer;
import java.sql.Timestamp;

/**
 * @ClassName CommentWriter
 * 装饰模式
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  11:25:55
 * @Version 1.0.0
 */

public class CommentWriter extends Writer {


    private Writer out;

    public CommentWriter() {

    }

    public CommentWriter(Writer out) {
        this.out = out;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        out.write("#" + new Timestamp(System.currentTimeMillis()));
        out.write("\r\n");
        out.write(cbuf, off, len);
    }

    @Override
    public void write(String str) throws IOException {
        this.write(str.toCharArray(), 0, str.toCharArray().length);
    }

    @Override
    public void flush() throws IOException {

        out.flush();
    }

    @Override
    public void close() throws IOException {

        out.close();
    }
}
=======
package com.demo.io;

import java.io.IOException;
import java.io.Writer;
import java.sql.Timestamp;

/**
 * @ClassName CommentWriter
 * 装饰模式
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  11:25:55
 * @Version 1.0.0
 */

public class CommentWriter extends Writer {


    private Writer out;

    public CommentWriter() {

    }

    public CommentWriter(Writer out) {
        this.out = out;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        out.write("#" + new Timestamp(System.currentTimeMillis()));
        out.write("\r\n");
        out.write(cbuf, off, len);
    }

    @Override
    public void write(String str) throws IOException {
        this.write(str.toCharArray(), 0, str.toCharArray().length);
    }

    @Override
    public void flush() throws IOException {

        out.flush();
    }

    @Override
    public void close() throws IOException {

        out.close();
    }
}
>>>>>>> e366ada85f330a71896bda1991d88c84cf56984e
