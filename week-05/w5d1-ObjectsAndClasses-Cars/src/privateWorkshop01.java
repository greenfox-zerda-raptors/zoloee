/**
 * Created by zoloe on 2016. 11. 14..
 */
public class privateWorkshop01 {
    public static void main(String[] args) {
//        Car myCar = new PrivateCar();
        PrivateCar[] cars = new PrivateCar[3];


        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                "puke", 1 // replace this stuff with the way we get those attributes about myCar
        );
        System.out.println();
//        System.out.println(myCar.color + myCar.sizeEngine);


        cars[0] = new PrivateCar();
        cars[0].settypeCar("Mazda");
        cars[0].setkmOdometer(12312);

        cars[1] = new PrivateCar();
        cars[1].settypeCar("Ford");
        cars[1].setscolor("silver");
        cars[1].setsizeEngine(2500);
        cars[1].setkmOdometer(152312);

        cars[2]= new PrivateCar();
        cars[2].settypeCar("Bmw");
        cars[2].setscolor("green");
        cars[2].setsizeEngine(2800);
        cars[2].setkmOdometer(42521);

        for (int i=0; i<3; i++){
            System.out.println("This " + cars[i].getTypeCar() + " is " + cars[i].getColor() + ", has " + cars[i].getSizeEngine() + " engine and clocked " + cars[i].getKmOdometer() + " km's.");
        }

    }
}

