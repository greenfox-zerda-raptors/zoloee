package com.greenfoxacademy.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zoloe on 2016. 12. 20..
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/helloWorld")
    public String greeting(Model model, @RequestParam(required = false, defaultValue = "Thymeleaf")  String name){
        model.addAttribute("name", name);
//        Hello, " + name + "!
        return "greeting";
    }
}

//    @RequestMapping("/web/greeting")
//    public String greeting(Model model, @RequestParam String name) {
//        long id = counter.incrementAndGet();
//        model.addAttribute("name", name);
//        model.addAttribute("count", id);
//        return "greeting";
//    }
//}
//public class HelloController {
//    @RequestMapping(value = "/helloWorld")
//    @ResponseBody
//    public Greeting2 greeting(Model model, @RequestParam(required = false, defaultValue = "Thymeleaf")  String name){
////        model.addAttribute("name", name);
////        Hello, " + name + "!
//        return new Greeting2("xx " + name );
//    }
//}
