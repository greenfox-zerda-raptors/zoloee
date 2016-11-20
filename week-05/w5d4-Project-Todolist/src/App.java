import todolistP.*;

import java.util.Scanner;

/**
 * Created by zoloe on 2016. 11. 17..
 */
public class pApp {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        String commands = " l to List, q to quit, a to add: ";
        TodoList myList = new TodoList(); //igy feltolti a delfault listaval
//        myList.listTodos();

        String[] command = {" "," "};
            //initialize commands string to get it empty for the while condition

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

                        myList.addTodo(command[1]);

                        break;
                    }
                    case "q": {
                        System.out.println("quitting");
                        break;
                    }
                    case "r": {
                        if (command.length < 2 || command[1].equals(" ")) { //ide mas vizsgalat is kell (is.numeric?

                            System.out.println(" failed - no index");
                        } else {
                            myList.removeTodo(Integer.getInteger(command[1]));
                        }
                        break;
                    }
                    default: {
                        System.out.println(" no such command. usage: " + commands);
                        break;
                    }
                }// switch
            }catch (Exception e){
                System.out.println(AppMethods.ErrHand(e));

            }//catch


        }// while command[0]



    }// main

}//app

// || command != "l"