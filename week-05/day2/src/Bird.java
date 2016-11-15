/**
 * Created by zoloe on 2016. 11. 15..
 */
public class Bird extends Animal {
    public Bird() {
        super(2,false);
//       explicity calls super with the string
    }

    protected void fly(){
        System.out.println("The Bird is flying");
    }
    protected void sleep() {
        System.out.println(" The Bird is sleeping");
        super.sleep();
    }
    protected void eat(){
        System.out.println(" The Bird is eating");
    }
    protected void nightyNight(){
        super.eat();
        sleep();
    }
    protected void speak(){
        System.out.println("chirp");
    }
}
