package com.greenfox.zolo.reddit.Controllers;

import com.greenfox.zolo.reddit.Services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("posts", repository.findAll());
        return "posts/index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newPost(Model model){
        return "posts/newpost";
    }
}
