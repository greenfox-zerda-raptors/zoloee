package todolistP;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by zoloe on 2016. 12. 16..
 */
public class TodoListDB {
    private String databaseUrl = "jdbc:mysql://127.0.0.1:3306/todolist?user=user1&password=12345&useSSL=false";
    private ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

    Dao<TodoItem, String> todos =
            DaoManager.createDao(connectionSource, TodoItem.class);

    public TodoListDB() throws SQLException {
    }

    public void listTodos(){
//            int i=1;
//            for (TodoItem curTodo : todos) {
//                System.out.println(i + " " +  curTodo);
//                i++;
//            }
        for (TodoItem curTodo : todos) {
            System.out.println(curTodo);
        }
    }// listTodos

    public void addTodo(String description) throws SQLException {
        todos.create(new TodoItem(description));
    }

    public void removeTodo(int index)throws Exception{
        TodoItem curTodo = todos.queryForId(Integer.toString(index));
                todos.delete(curTodo);
        reorder();
    }//removeTodo

    protected void reorder() throws Exception{
        List<TodoItem> tempTodoList = todos.queryForAll();
        tempTodoList.size();
        TableUtils.dropTable(todos,true);
        TableUtils.createTable(connectionSource, TodoItem.class);
        for (TodoItem t:
                tempTodoList) {
            todos.create(new TodoItem(t.isDone(),t.getDescription()));
        }
    }

    public void removeDone() throws Exception{
        for (TodoItem t:
             todos) {
            if (t.isDone()){
                todos.delete(t);
            }
        reorder();
        }
    }

    public void closeDB() throws Exception{
        connectionSource.close();
    }

    public void resetList() throws Exception {
        TableUtils.dropTable(todos,true);
        TableUtils.createTable(connectionSource, TodoItem.class);
        addTodo("Walk the dog");
        addTodo("Buy Milk");
        addTodo("Do homework");
    }

    public TodoItem getTodoItem(String index) throws Exception{
        return todos.queryForId(index);
    }
    public void setCompleteTodoItem(String index) throws Exception{
        TodoItem t = getTodoItem(index);
        t.setDone(true);
        todos.update(t);
    }

}// TodoListDB
