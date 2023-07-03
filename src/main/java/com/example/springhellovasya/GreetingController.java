package com.example.springhellovasya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String message = "Hello, World! Today is " + currentDate;
        model.addAttribute("message", message);
        return "greeting";
    }
}
