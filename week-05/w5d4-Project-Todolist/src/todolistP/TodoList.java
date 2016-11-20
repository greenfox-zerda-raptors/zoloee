package todolistP;
import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class TodoList {
    public ArrayList<TodoItem> todos = new ArrayList<TodoItem>();

    public TodoList(ArrayList<TodoItem> todos) {
        this.todos = todos;
    }
        //ezt majd filebetoltesnel lehet hasznalni

    public TodoList() {
        todos.add(0,new TodoItem("Walk the dog"));
        todos.add(1,new TodoItem("Buy Milk"));
        todos.add(2,new TodoItem("Do homework"));
        System.out.println("list initialized with 3 example values");
    }

    public void listTodos(){
        if (todos.size() == 0){
            System.out.println("the list is empty");
        } else {
            int i = 1;
            for (TodoItem curTodo : todos) {
                System.out.println(i + " - " + curTodo.getDesc());
                i++;
            }
        }
    }

    public void addTodo(String Desc){
        todos.add(new TodoItem(Desc));
    }

    public void removeTodo(int i){
        todos.remove(i);
    }



}

