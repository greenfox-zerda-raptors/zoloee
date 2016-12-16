import com.j256.ormlite.logger.LocalLog;
import todolistP.*;
import java.util.Scanner;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class App {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String commands = " l to List, q to quit, a [description] to add, r [i] to remove, "; // c {i} to mark complete:"
        System.setProperty(LocalLog.LOCAL_LOG_LEVEL_PROPERTY, "ERROR");
//        TodoList myList = new TodoList(); //igy feltolti a delfault listaval
        TodoListDB myList = new TodoListDB();
//        TodoList myList = new TodoList();

        String[] command = {" "," "};
            //initialize commands string to get it empty for  the while condition

        while (!command[0].equals("q")) {
            System.out.println(); //add an empty line to look nicer

            System.out.println(commands);
            command = userInput.nextLine().split(" ", 2);
            try {
                switch (command[0]) {
                    case "l": {
                        myList.listTodos();
                        break;
                    }
                    case "a": {
                        if (command[1].equals("")) { //azert kell hogy ha ures stringet ad meg, ne jojjon letre uj todoitem ures desccel
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        myList.addTodo(command[1]);
                        break;
                    }
                    case "q": {
                        System.out.println("quitting");
                        myList.closeDB();
                        break;
                    }
                    case "r": {
                        myList.removeTodo(Integer.parseInt(command[1]));
                        break;
                    }
                    case "reset":{
                        myList.resetList();
                        break;
                    }
                    default: {
                        System.out.println(" no such command. usage: " + commands);
                        break;
                    }
                }// switch
            }catch (Exception e){
                System.out.println(AppMethods.ErrHand(e));
                System.out.println(" out of valid indexes ");

            }//catch
        }// while command[0]
    }// main
}//app
