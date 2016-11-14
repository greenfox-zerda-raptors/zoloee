/**
 * Created by zoloe on 2016. 11. 14..
 */
// Workshop04.java
public class Workshop04 {
    public static void main(String[] args) {
        MovingCar[] cars = new MovingCar[3];


        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                "puke", 1 // replace this stuff with the way we get those attributes about myCar
        );
        System.out.println();

        cars[0] = new MovingCar();
        cars[0].settypeCar("Mazda");
        cars[0].setkmOdometer(12312);

        cars[1] = new MovingCar();
        cars[1].settypeCar("Ford");
        cars[1].setscolor("silver");
        cars[1].setsizeEngine(2500);
        cars[1].setkmOdometer(152312);

        cars[2]= new MovingCar();
        cars[2].settypeCar("Bmw");
        cars[2].setscolor("green");
        cars[2].setsizeEngine(2800);
        cars[2].setkmOdometer(42521);

        for (int i=0; i<3; i++){
            System.out.println("This " + cars[i].getTypeCar() + " is " + cars[i].getColor() + ", has " + cars[i].getSizeEngine() + " engine and clocked " + cars[i].getKmOdometer() + " km's.");
        }
    //http://stackoverflow.com/questions/28044873/android-non-static-method-cannot-be-referenced-from-static-context-confused
    //ezt lehet dEmOzNi

        System.out.println(        );

        cars[0].drive(15);
        cars[1].drive(49);
        cars[2].drive(1200);
    }
}

