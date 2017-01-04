package com.greenfox.zolo.reddit.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zoloe on 2017. 01. 04..
 */
@Controller
@RequestMapping(value = "/posts")
public class PostsController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        return "posts/index";
    }
}
