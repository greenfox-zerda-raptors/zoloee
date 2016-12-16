package todolistP;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class TodoList {
    public List<TodoItem> todos = new ArrayList<>();

    public TodoList() {
        resetList();
    }

    public void listTodos(){
        if (todos.size() == 0){
            System.out.println("the list is empty");
        } else {
            int i = 1;
            for (TodoItem curTodo : todos) {
                System.out.println(i + " - " + curTodo.getDescription());
                i++;
            }
        }
    }

    public void addTodo(String Desc){
        todos.add(new TodoItem(Desc));
    }

    public void removeTodo(int index){
        todos.remove(index - 1);
    } // 0tol indul az indexeles

    public String size(){
        return Integer.toString(todos.size());
    }

    public void closeDB(){}
    public void resetList(){
        todos.clear();
        todos.add(0,new TodoItem("Walk the dog"));
        todos.add(1,new TodoItem("Buy Milk"));
        todos.add(2,new TodoItem("Do homework"));
        System.out.println("list initialized with 3 example values");
    }

}

