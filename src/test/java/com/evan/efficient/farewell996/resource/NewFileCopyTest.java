package com.evan.efficient.farewell996.resource;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName NewFileCopyTest
 * @Description 基于JDK7之后，实现正确关闭流资源方法
 * try - with - resource (在try后面的小括号里定义输入流、输出流以达到不用显示关闭资源的目的)
 * @Author Evan Wang
 * @Version 1.0.0
 * @Date 2020/3/10 12:37
 */
public class NewFileCopyTest {

    @Test
    public void copyFile() {

        // 先定义输入/输出路径
        String originalUrl = "lib/NewFileCopyTest.java";
        String targetUrl = "targetTest/new.txt";

        // 初始化输入/输出流对象
        try (
                FileInputStream originalFileInputStream =
                        new FileInputStream(originalUrl);

                FileOutputStream targetFileOutputStream =
                        new FileOutputStream(targetUrl);
        ) {

            int content;

            // 迭代，拷贝数据
            while ((content = originalFileInputStream.read()) != -1) {
                targetFileOutputStream.write(content);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
