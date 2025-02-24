package com.example.springhelloworld.uc1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/hello")
    public String helloworld(){

        return "hello from bridgelab !";
    }
}
