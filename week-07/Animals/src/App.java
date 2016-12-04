import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zoloe on 2016. 12. 04..
 */
public class App {



    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse("Tade"));
        animals.add(new Mouse("Cincin"));
        animals.add(new Ant());

        for (Animal a :
             animals) {

            System.out.println(a);
        }

        Iterator<Animal> iterator = animals.iterator();
    }
}
