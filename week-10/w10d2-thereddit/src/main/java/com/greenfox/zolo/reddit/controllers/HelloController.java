package com.greenfox.zolo.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zoloe on 2017. 01. 04..
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        return "HelloW";
    }
}
