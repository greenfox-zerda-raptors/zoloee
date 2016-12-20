package com.greenfoxacademy.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zoloe on 2016. 12. 20..
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/helloWorld")
    @ResponseBody
    public Greeting greeting(@RequestParam() String name){
        long id = counter.incrementAndGet();
        return new Greeting(id,"Hello, " + name + "!");
    }
}

}
