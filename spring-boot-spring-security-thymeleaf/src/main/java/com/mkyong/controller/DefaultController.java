package com.mkyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String home1() {


        return "/index";
        //return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/index";
        //return "/home";
    }

//    @GetMapping("/admin")
//    public String admin() {
//
//    }



    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }


    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

    @GetMapping("/userExists")
    public String errorUserExists() {
        return "/error/userExists";
    }

}
