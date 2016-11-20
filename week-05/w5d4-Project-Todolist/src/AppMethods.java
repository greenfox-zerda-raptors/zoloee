/**
 * Created by zoloe on 2016. 11. 20..
 */
public class AppMethods {

    public static String ErrHand(Exception e) {
        switch (e.getClass().getSimpleName()) {
            case "ArrayIndexOutOfBoundsException" : {
                return "pls give an argument for the command";
            }
        }return "fuckit";
    }
}
