package com.example.springhelloworld.uc2;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
        @GetMapping("/web")
        public String hello(Model model) {
                model.addAttribute("message", "Hello from Thymeleaf!");
                return "hello";  // Corresponds to templates/hello.html
        }
        @GetMapping("/web/message")
        public String message(@NotNull Model model){
                model.addAttribute("message","This is a custom message");
            return "message";
        }
}
