/**
 * Created by zoloe on 2016. 11. 15..
 */
public class Dog extends Animal {
    public Dog(){
        super(15,true);
    }
    boolean hasTail = true;
    protected void speak(){
        System.out.println("barks");
    }
    protected void beg(){
        System.out.println("begs");
    }

}
