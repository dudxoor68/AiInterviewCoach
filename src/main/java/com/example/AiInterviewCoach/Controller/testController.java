package com.example.AiInterviewCoach.Controller;

import com.example.AiInterviewCoach.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api")
public class testController {

    @Autowired
    UserService userService;


    @RequestMapping("/test")
    public String test1(){
        System.out.println("testing = "+userService.userinfo());
        return userService.userinfo();
    }

}
