package com.svrohith9.chatapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
