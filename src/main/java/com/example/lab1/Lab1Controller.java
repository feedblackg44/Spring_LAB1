package com.example.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class Lab1Controller {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "index.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/ilya")
    public String indexI() {
        return "../static/html/ilya.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/danylo")
    public String indexB() {
        return "../static/html/danylo.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/oleksii")
    public String indexO() {
        return "../static/html/oleksii.html";
    }
}
