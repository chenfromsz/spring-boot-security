package com.test.web.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainsiteErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value="/error")
    public String handleError(){
        return "403";
    }

    @RequestMapping(value="/deny")
    public String deny(){
        return "deny";
    }
}
