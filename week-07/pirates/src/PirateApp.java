import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zoloe on 2016. 12. 03..
 */
public class PirateApp {
    static Scanner userInput = new Scanner(System.in);
    static String commands = "l (ist), a (sk), d (rink), s (elect), q (uit), w (akeup) ";

    public static void main(String[] args) {
        String[] command = {" "," "};
        ArrayList<Pirate> pirates = new ArrayList<>();
        pirates.add(new Pirate("Garrick Scoundrel Rattle"));
        pirates.add(new Pirate("Harlan Daffy Lancaster"));
        Pirate activePirate = null;
        System.out.println(commands);
        while (!command[0].equals("q")) {
            command = userInput.nextLine().split(" ", 2);
            System.out.println();
            try {
                System.out.println(activePirate.getName()":");
            }catch (Exception e){
                System.out.println("no Pirate selected");
            }
            try {
                switch (command[0]) {
                    case "s": {
                        activePirate = pirates.get(Integer.valueOf(command[1]));
                        System.out.println(activePirate.getName() + " got selected");
                        break;
                    }
                    case "l" : {
                        for (Pirate p:
                             pirates) {
                            System.out.println(pirates.indexOf(p) + ": " + p.toString());
                        }
                        break;
                    }
                    case "a" : {
                        System.out.println(activePirate.howsItGoingMate());
                        break;
                    }
                    case "d" : {
                        System.out.println(activePirate.drinkSomeRum());
                        break;
                    }
                    case  "w" : {
                        activePirate.wakeUp();
                        break;
                    }
                    case "q" : {
                        System.out.println("bye!");
                    }
                    default : {
                        System.out.println(" no such command. usage: " + commands);
                        break;
                    }
                }// switch
            } catch (Exception e) {
            }// catch
        } //while not q
    }//Psvm
}//PirateApp
