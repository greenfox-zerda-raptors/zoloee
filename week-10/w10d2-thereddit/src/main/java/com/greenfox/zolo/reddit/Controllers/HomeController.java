package com.greenfox.zolo.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zoloe on 2017. 01. 04..
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello(){
        return "redirect:posts";
    }

//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index(Model model){
//        model.addAttribute("posts", repository.findAll());
//        return "posts/index";
//    }

}
