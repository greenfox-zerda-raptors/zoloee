/**
 * Created by zoloe on 2016. 11. 15..
 */
import java.util.ArrayList;
import java.util.ListIterator;

public class Student extends Person {
    public Student(String name, int age){
        super(name, age);
    }

    ArrayList<Integer> grades = new ArrayList<Integer>();

    public void addGrade(int g){
        if (g > 0 && g < 6){
            grades.add(g);
        }
    }
    public Double getAverage(){
        Double avg = 0d;
            //0d, DDDD, dddd, mert Double es ez kvara kell neki!!!
        int i = 0;
        ListIterator<Integer> grades_iterator = grades.listIterator();
        while ( grades_iterator.hasNext()){
            avg = avg + grades_iterator.next();
            i++;
        }
        avg = avg / i;
        return avg;
    }
    public String toString(){
        return super.toString() + " average:" + Double.toString(this.getAverage());
    }
}
