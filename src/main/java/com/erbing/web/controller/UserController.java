package com.erbing.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/user")
public class UserController {

    @RequestMapping("/login")
    public String login(){
        return "/login";
    }
}
