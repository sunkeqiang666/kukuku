package com.suixingpay;

import com.suixingpay.config.MyOutPutProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        MyOutPutProperties myOutPutProperties = new MyOutPutProperties();
        myOutPutProperties.bbb();
    }
}
