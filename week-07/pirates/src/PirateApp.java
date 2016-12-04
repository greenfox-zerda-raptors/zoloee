import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by zoloe on 2016. 12. 03..
 */
public class PirateApp {
    static Scanner userInput = new Scanner(System.in);
    static String commands = "l (ist), a (sk), d (rink), s (elect), q (uit), w (akeup), b (rawl), r (eport) ";

    public static void main(String[] args) {
        String[] command = {" "," "};
        ArrayList<Pirate> pirates = new ArrayList<>();
        pirates.add(new Pirate("Garrick Scoundrel Rattle"));
        pirates.add(new Pirate("Harlan Daffy Lancaster"));
        pirates.add(new Pirate("Garrick Scoundrel Rattlearstarstrast"));
        pirates.add(new Pirate("Harlan Daffy Lancasterarstarstarstrast"));
        pirates.add(new Pirate("1"));
        pirates.add(new Pirate("2"));
        pirates.add(new Pirate("3"));
        pirates.add(new Pirate("4"));
        pirates.add(new Pirate("5"));
        pirates.add(new Pirate("6"));

        Pirate activePirate = null;
        Pirate candidateForFight = null;
        System.out.println(commands);
        while (!command[0].equals("q")) {
            command = userInput.nextLine().split(" ", 2);
            try {
                switch (command[0]) {
                    case "s": {
                        activePirate = pirates.get(Integer.valueOf(command[1]));
                        if ( activePirate.getIsDead()) {
                            System.out.println(" he is dead, choose another one");
                            activePirate = null;
                        }
                        try {
                            System.out.println(activePirate.getName() + " selecta!");
                        }catch (Exception e){
                            System.out.println("no Pirate selected");
                        }
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
                        break;
                    }
                    case "b" : {
                        do{
                            int i = new Random().nextInt((pirates.size()));
                            candidateForFight = pirates.get(i);
                        }while ( candidateForFight.getIsDead() || candidateForFight == activePirate || candidateForFight.getIsSleeping());
                        System.out.println(activePirate.brawl(candidateForFight));
                        if ( activePirate.getIsDead()){
                            activePirate = null;
                        }
                        break;
                    }
                    case "r=" : {
                        try {
                            System.out.println(activePirate.toStringNicely());
                        }catch (Exception e){
                            System.out.println("no Pirate selected");
                        }
                        break;
                    }
                    default : {
                        System.out.println("no such command. usage: " + commands);
                        break;
                    }
                }// switch
            } catch (Exception e) {
            }// catch
        } //while not q
    }//Psvm


}//PirateApp
