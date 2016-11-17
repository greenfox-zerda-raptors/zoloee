package todolistP;

import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class Init {
    ArrayList<TodoItem> todos = new ArrayList<TodoItem>();
    int ct = 10;

//    1 - Walk the dog
//2 - Buy milk
//3 - Do homework
//
    todos[0] = new TodoItem("Walk the dog");
    todos[1] = new TodoItem("Buy milk");
    todos[2] = new TodoItem("Do Homework");

    protected void listTodos(){
        int i=0;
        for (TodoItem curTodo : todos ) {
            System.out.println(i + " - " + curTodo.getDesc());
        }
    }

}

