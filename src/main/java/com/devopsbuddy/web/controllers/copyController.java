package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rjeshg on 1/17/17.
 */
@Controller
public class copyController {

    @RequestMapping("/about")
public String about() {
    return "copy/about";
}
}
