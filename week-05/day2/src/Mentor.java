/**
 * Created by zoloe on 2016. 11. 15..
 */
public class Mentor extends Person {

    protected String seniorityLevel;
    protected String subject;

    public Mentor(String name, int age, String seniorityLevel, String subject) {
        this.name = name;
        this.age = age;
        this.seniorityLevel = seniorityLevel;
        this.subject = subject;
    }

    public String toString(){
        return super.toString() + " is a(n) " + subject + " " + seniorityLevel;

    }
}
