package todolistP;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.List;

/**
 * Created by zoloe on 2016. 12. 15..
 */
public class createAndFillWithDummyToDoListTable {
    public static void main(String[] args) throws Exception  {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/todolist?user=user1&password=12345&useSSL=false";
        TodoList myTodoList = new TodoList();
        // create a connection source to our database
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        TableUtils.createTable(connectionSource, TodoItem.class);

        // instantiate the dao

        Dao<TodoItem, String> todoListDao =
                DaoManager.createDao(connectionSource, TodoItem.class);
        List<TodoItem> readTodoItemList = todoListDao.queryForAll();
        for (TodoItem t:
                myTodoList.todos) {
            System.out.println(t);
        }
        for (TodoItem t:
                myTodoList.todos) {

            todoListDao.create(t);
        }
    }
}
