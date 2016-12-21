package com.greenfoxacademy.todo;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoloe on 2016. 12. 21..
 */

@Getter
@Service
public class TodoService {
    List<Todo> todos = new ArrayList<>();
    public void todoService(){
        todos.add(0,new Todo(1,"Walk the dog",false,false ));
        todos.add(1,new Todo(2,"Buy Milk", false,true));
        todos.add(2,new Todo(3,"Do homework",true,true));
//        System.out.println("list initialized with 3 example values");
    }


    //    Use getTodos() from TodoService to get all the Todos
}
