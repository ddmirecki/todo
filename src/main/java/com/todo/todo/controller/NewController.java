package com.todo.todo.controller;

import com.todo.todo.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NewController {

    @Autowired
    private NewService newService;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String showNew(){

        return "new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String showNextWelcome(Model model, @RequestParam String newName, @RequestParam String desc){
        model.addAttribute("newName", newName);
        model.addAttribute("desc", newService.getTodoByDesc(desc));
        System.out.println(newService.getTodoByDesc(desc));

    return "newWelcome";
    }
//    @RequestMapping(value = "/new", method = RequestMethod.POST)
//    public String showNextWelcome(){
//
//
//        return "newWelcome";
//    }
}
