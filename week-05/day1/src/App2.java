/**
 * Created by zoloe on 2016. 11. 14..
 */
// Workshop01.java
public class App2 {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car[] cars = new Car[3];


        System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
                "puke", 1 // replace this stuff with the way we get those attributes about myCar
        );
        System.out.println();
        System.out.println(myCar.color + myCar.sizeEngine);


        Car myCar0 = new Car();
        myCar0.typeCar = "Mazda";
        myCar0.kmOdometer = 12312;

        Car myCar1 = new Car();
        myCar1.typeCar = "Ford";
        myCar1.color = "silver";
        myCar1.sizeEngine = 2500;
        myCar1.kmOdometer = 152312;

        Car myCar2 = new Car();
        myCar2.typeCar = "Bmw";
        myCar2.color = "green";
        myCar2.sizeEngine = 2800;
        myCar2.kmOdometer = 42521;



        cars[0] = myCar0;
        cars[1] = myCar1;
        cars[2] = myCar2;


        for (int i=0; i<3; i++){
            System.out.println("This " + cars[i].typeCar + " is " + cars[i].color + ", has " + cars[i].sizeEngine + " engine and clocked " + cars[i].kmOdometer + " km's.");


          }

//        System.out.println("This " + myCar0.typeCar + " is " + myCar0.color + ", has " + myCar0.sizeEngine + " engine and clocked " + myCar0.kmOdometer + " km's.");
//        System.out.println("This " + myCar1.typeCar + " is " + myCar1.color + ", has " + myCar1.sizeEngine + " engine and clocked " + myCar1.kmOdometer + " km's.");
//        System.out.println("This " + myCar2.typeCar + " is " + myCar2.color + ", has " + myCar2.sizeEngine + " engine and clocked " + myCar2.kmOdometer + " km's.");

//

    }
}
