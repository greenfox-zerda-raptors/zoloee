/**
 * Created by zoloe on 2016. 11. 15..
 */
public class Workshop01 {
    public static void main(String... args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();
//        dog.speak();
//        System.out.println(dog.toString());
//        System.out.println(        );

        System.out.println("Testing animal");
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());

        System.out.println("\nTesting Bird");
        bird.speak();
        bird.sleep();
        System.out.println(bird.toString());
        bird.nightyNight();

        System.out.println("\nTesting Dog");
        dog.speak();
        dog.sleep();
        System.out.println(dog.toString());
        dog.beg();
        System.out.println("has tail?: " + Boolean.toString(dog.hasTail));

        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dog();
        dog2.speak();
        dog2.sleep();
        System.out.println(dog2.toString());
        Dog dog3 = (Dog) dog2; //castolas .. ha nem lehet, akkor trycatch
        dog3.beg();
        System.out.println("has tail?: " + Boolean.toString(dog3.hasTail));

        System.out.println("\nTesting Dog 'd'");
        Animal dogd = new Dog();
        dogd.speak();
        dogd.sleep();
        System.out.println(dogd.toString());
//        bird.eat();
//        bird.sleep();
//        bird.nightyNight();
//        bird.fly();
    }
}