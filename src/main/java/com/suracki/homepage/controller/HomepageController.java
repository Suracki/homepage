package com.suracki.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

    @RequestMapping("/")
    public String home(Model model)
    {
        System.out.println("TEST");
        return "index";
    }

}
