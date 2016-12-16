import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import todolistP.TodoList;

/**
 * Created by zoloe on 2016. 11. 20..
 */
public class AppMethods {

    public static String ErrHand(Exception e) {
        switch (e.getClass().getSimpleName()) {
            case "ArrayIndexOutOfBoundsException" : {
                return "pls use an argument for this command";
            }
            case "IndexOutOfBoundsException" : {
                return "pls use a valid index";
            }

        }return "Unhandled: " + e;
    }
}// appMethods
