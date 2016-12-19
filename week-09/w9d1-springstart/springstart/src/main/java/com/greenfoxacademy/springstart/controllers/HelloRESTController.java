package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zoloe on 2016. 12. 19..
 */
@RestController
public class HelloRESTController {
    final AtomicLong counter = new AtomicLong (1);

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam() String name){
        long id = counter.incrementAndGet();
        return new Greeting(id,"Hello, " + name + "!");
    }
}
