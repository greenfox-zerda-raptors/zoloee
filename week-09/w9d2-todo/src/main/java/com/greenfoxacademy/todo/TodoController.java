package com.greenfoxacademy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zoloe on 2016. 12. 21..
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping(value = { "/" , "/list"})
    public String list(Model model){
        model.addAttribute("todos",todoService.getTodos());
        return "todo";
    }
}

//Create a new controller called TodoController which maps to /todo (hint: @RequestMapping to Controller?)