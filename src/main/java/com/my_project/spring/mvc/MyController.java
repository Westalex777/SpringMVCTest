package com.my_project.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    public MyController() {
        System.out.println("The constructor MyController : active!");
    }

    @RequestMapping("/")
    public String showFirstView() {
        System.out.println("MyController.showFirstView : active!");
        return "first-view";
    }
}
