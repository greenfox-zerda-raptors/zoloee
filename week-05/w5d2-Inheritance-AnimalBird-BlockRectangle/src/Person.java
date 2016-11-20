/**
 * Created by zoloe on 2016. 11. 15..
 */
public class Person {
    protected String name;
    protected int age;

    public Person(){
    }
//    ez nem kell (?), mert nem eztetet hivjuk meg sosem

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " (" + Integer.toString(age) + ") ";
    }
}
