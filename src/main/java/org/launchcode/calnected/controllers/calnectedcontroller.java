package org.launchcode.calnected.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calnectedcontroller {

    @GetMapping
    @ResponseBody
    public String test(){
        return "Testing Initial Project";
    }
}
