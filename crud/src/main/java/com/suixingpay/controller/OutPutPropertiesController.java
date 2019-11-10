package com.suixingpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Controller
public class OutPutPropertiesController {

    @GetMapping("/outGit")
    @ResponseBody
    public String outGit(Map<String, String> map) {
        try {
            Properties properties = new Properties();
            properties.load(OutPutPropertiesController.class.getClassLoader().getResourceAsStream("git.properties"));
            StringBuffer stringBuffer = new StringBuffer();
            Set<String> names = properties.stringPropertyNames();
            for (String name : names) {
                stringBuffer.append(name + " : " + properties.getProperty(name));
                stringBuffer.append("</br>");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "对不起，您还没有git.properties文件";
    }
}
