import java.util.SplittableRandom;

/**
 * Created by zoloe on 2016. 11. 14..
 */
public class PrivateCar {

    private int sizeEngine;
    private String color;
    private int kmOdometer;
    private String typeCar;

    public void setsizeEngine(int sEng) {
        sizeEngine = sEng;
    }

    public void setscolor(String col) {
        color = col;
    }

    public void setkmOdometer(int km) {
        kmOdometer = km;
    }

    public void settypeCar(String ty) {
        typeCar = ty;
    }
    public int getSizeEngine(){
        return sizeEngine;
    }
    public String getColor(){
        return color;
    }
    public int getKmOdometer(){
        return kmOdometer;
    }
    public String getTypeCar(){
        return typeCar;
    }

    public PrivateCar() { //constructor
        this.sizeEngine = 1600;
        this.color = "red";
    }

}