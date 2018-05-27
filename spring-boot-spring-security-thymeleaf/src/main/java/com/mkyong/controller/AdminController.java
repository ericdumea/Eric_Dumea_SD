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
import java.util.NoSuchElementException;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

    EntityFactory ef = new EntityFactory();
    List<User> list ;

    @RequestMapping("/admin")
    String admin(Model model) {
        addAttributes(model);
        model.addAttribute("addUser", ef.getNewUser());
        model.addAttribute("editUser", ef.getNewUser());
        return "admin";
    }

    public void addAttributes(Model model) {
        model.addAttribute("users",userService.getAll());
        System.out.println(userService.getAll());
    }

    @RequestMapping(value = "/admin/edit-user/create", method = RequestMethod.POST)
    String addUser(@ModelAttribute("addUser") User addUser, Model model){
        addUser.setRole("user");
        list = userService.getAll();
        Iterator iter = new MyIterator(list);

        while (iter.hasNext()) {
            User x = (User) iter.next();
            if(x.getEmail().equals(addUser.getEmail())){
                return "redirect:/userExists";
            }
        }

        userService.create(addUser);
        return "redirect:/admin";

    }

    private class MyIterator implements Iterator<User>{


        MyIterator(List list){
            myList= list;
        }

        int size = list.size();
        int currentPointer = 0;
        List<User> myList;

        @Override
        public boolean hasNext() {
            System.out.println("am ajuns si aici");
            return (currentPointer < size);
        }

        @Override
        public User next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            @SuppressWarnings("unchecked")
            User val = list.get(currentPointer);
            currentPointer ++;
            return val;
        }
    }


}
