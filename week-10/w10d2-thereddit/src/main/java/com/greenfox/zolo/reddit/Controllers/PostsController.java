package com.greenfox.zolo.reddit.Controllers;

import com.greenfox.zolo.reddit.Models.Post;
import com.greenfox.zolo.reddit.Services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String list(Model model){
        model.addAttribute("posts", repository.findAll());
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("post", new Post());
        return "posts/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSubmit(@ModelAttribute Post post){
        repository.save(post);
        return "redirect:/";
    }
    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String upvote(@PathVariable("id") long id){
        Post post = repository.findOne(id);
        post.incrementScore();
        repository.save(post);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String downwote(@PathVariable("id") long id) {
        Post post = repository.findOne(id);
        post.decrementScore();
        repository.save(post);
        return "redirect:/";
    }
}
