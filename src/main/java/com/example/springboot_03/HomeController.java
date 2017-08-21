package com.example.springboot_03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { /// handles routing for the application
    @RequestMapping("/")  // provides routing for default route (/)
    public String homePage(){ // returns View template named hometemplate.html in the routing of the default route
        return "hometemplate";
    }
}
