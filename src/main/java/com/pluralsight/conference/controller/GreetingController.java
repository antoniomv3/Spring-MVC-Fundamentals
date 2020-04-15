package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    //If the user requests /greeting, this will update the model then return the jsp page titled "greeting"
    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Hello Tony!");
        return "greeting";
    }
}
