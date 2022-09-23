package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class Lab1Controller {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "index.html";
    }
}
