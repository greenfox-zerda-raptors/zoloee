/**
 * Created by zoloe on 2016. 11. 15..
 */
public class Animal {

    String type = "Animal";
    protected int lifeExpactancy;
    protected boolean isCarnivore;

    public Animal(String type) {
        this();
        type = type;
        System.out.println("An " + type + " animal is created!");
    }
    public Animal(int lifeExpactancy, boolean isCarnivore){
        System.out.println("created a parametered animal");
        this.lifeExpactancy=lifeExpactancy;
        this.isCarnivore=isCarnivore;
    }
    public Animal(){
        System.out.println("An Animal of u t c");
        lifeExpactancy=10;
        isCarnivore=false;
    } //fallback constructor - if nothing passed to it explicitly, this will run on new()

    protected void eat(){
        System.out.println("The Animal is eating!");
    }
    protected void sleep(){
        System.out.println("The Animal is sleeping!");
    }
    protected void speak(){
        System.out.println("speaks");
    }
    public String toString(){
        return ("carn: " + Boolean.toString(isCarnivore) + ", lifeExp: " + Integer.toString(lifeExpactancy));
    }

}
