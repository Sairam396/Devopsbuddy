package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rjeshg on 1/16/17.
 */
@Controller
public class indexController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
