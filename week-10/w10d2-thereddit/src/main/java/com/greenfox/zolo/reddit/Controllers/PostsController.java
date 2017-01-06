package com.greenfox.zolo.reddit.Controllers;

import com.greenfox.zolo.reddit.Models.Post;
import com.greenfox.zolo.reddit.Services.PostRepository;
import com.greenfox.zolo.reddit.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zoloe on 2017. 01. 04..
 */
@Controller
@RequestMapping(value = "/posts")
    public class PostsController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String list(Model model, @RequestParam(name = "page", defaultValue = "0") String page, @RequestParam(name = "limit", defaultValue = "5") String limit){
            int pageChecked = Integer.valueOf(page);
//            if ( pageChecked < 0 ){
//                pageChecked = 0;
//            }
        model.addAttribute("posts", postService.getAllPosts(pageChecked, Integer.valueOf(limit)));
        return "posts/list";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("post", postService.getNewPost());
        return "posts/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSubmit(@ModelAttribute Post post){
        postService.savePost(post);
        return "redirect:/";
    }
    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String upvote(@PathVariable("id") long id){
        postService.upvote(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String downwote(@PathVariable("id") long id) {
        postService.downvote(id);
        return "redirect:/";
    }
}
