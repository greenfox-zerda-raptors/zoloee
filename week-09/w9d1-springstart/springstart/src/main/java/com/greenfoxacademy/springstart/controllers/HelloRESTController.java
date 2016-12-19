package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoloe on 2016. 12. 19..
 */
@RestController
public class HelloRESTController {
    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam() String name){
        return new Greeting(1,name);
    }
}
