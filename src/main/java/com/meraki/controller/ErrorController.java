package com.meraki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController {

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String loginPage() {
        return "404";
    }

}
