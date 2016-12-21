package com.greenfoxacademy.todo;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zoloe on 2016. 12. 21..
 */

//@Getter
@Service
public class TodoService {

    List<Todo> todos = new ArrayList<>(
            Arrays.asList(
                    new Todo(1, "Walk the dog", false, false),
                    new Todo(2, "Buy Milk", false, true),
                    new Todo(3, "Do homework", true, true)));

    public List<Todo> getTodos(String queryString) {
        switch (queryString) {
            case "active": {
                List<Todo> todosActive = new ArrayList<>();
                for (Todo t : todos) {
                    if (!(t.getDone())) {
                        todosActive.add(t);
                    }
                }
                return todosActive;
            }
            default: {
                return todos;
            }
        }
    }
}
    //    Use getTodos() from TodoService to get all the Todos

