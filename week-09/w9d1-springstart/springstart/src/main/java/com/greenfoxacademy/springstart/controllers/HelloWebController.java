package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zoloe on 2016. 12. 19..
 */
@Controller
public class HelloWebController {
    final AtomicLong counter = new AtomicLong (1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        long id = counter.incrementAndGet();
        model.addAttribute("name", name);
        model.addAttribute("count", id);
        return "greeting";
    }
}
