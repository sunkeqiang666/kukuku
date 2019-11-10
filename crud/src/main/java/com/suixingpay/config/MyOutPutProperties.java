package com.suixingpay.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class MyOutPutProperties {
    public void bbb() {
        try {
            Properties properties = new Properties();
            // 使用InPutStream流读取properties文件
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\idea_work_space\\gradle-crud\\git.properties"));
            properties.load(bufferedReader);
            // 获取key对应的value值
            Enumeration<Object> keys = properties.keys();
            System.out.println(Arrays.asList(keys));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
