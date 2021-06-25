package com.lyx.bookmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

   

    @RequestMapping({"/", "/index"})
    public String login(HttpSession session) {
        return "index";
    }

    @RequestMapping({"/toLoginPage"})
    public String toLoginPage() {
        return "login";
    }


}
