package com.suixingpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpServletRequest request) {
        if (!StringUtils.isEmpty(username) && password.equals("123456")) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        } else {
            map.put("msg", "用户名或密码错误");
            map.put("username", username);
            return "login";
        }
    }

    @GetMapping("/user/signOut")
    public String signOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("loginUser");
        return "redirect:/index";
    }
}
