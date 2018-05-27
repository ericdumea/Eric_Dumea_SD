package com.mkyong.controller;

import com.mkyong.entity.EntityFactory;
import com.mkyong.entity.User;
import com.mkyong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Iterator;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    EntityFactory ef = new EntityFactory();

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("addUser", ef.getNewUser());

        return "/register";
    }

    @RequestMapping(value = "/register/reg-user", method = RequestMethod.POST)
    String addUser(@ModelAttribute("addUser") User addUser, Model model){
        addUser.setRole("user");
        List<User> list = userService.getAll();

        for(User x: list){
            if(x.getEmail().equals(addUser.getEmail())){
                return "redirect:/userExists";
            }
        }

        userService.create(addUser);
        return "redirect:/";

    }


}
