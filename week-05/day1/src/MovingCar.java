import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by zoloe on 2016. 11. 14..
 */
public class MovingCar {



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
    public int getKmOdometer() {
        return kmOdometer;
    }
    public String getTypeCar() {
        return typeCar;
    }

    public MovingCar() { //constructor
        this.sizeEngine = 1600;
        this.color = "red";
    }

    public void drive(int kms){

        if ( kms < 20 ){
            System.out.println("brrmm, this " + this.typeCar + " ("+this.color + ") just drove around town" + kms + " kms ");
        }else if ( kms < 50 ){
            System.out.println("brrmm,screech, brrmm, rcrreech this " + this.typeCar + " ("+this.color + ") commuted " + kms + " kms");
        }else {
            System.out.println("whee " + this.typeCar + " ("+this.color + ")" + kms + " clicks.");
        }

        System.out.print("The odometer changed from " + this.kmOdometer + " kms");
        this.setkmOdometer(this.kmOdometer + kms);
        System.out.print(" to " + this.kmOdometer + "kms.");
        System.out.println();
        System.out.println();
    }

    public String toString(){
        return "This " + this.typeCar + " is " + this.color + ", has" + this.sizeEngine + " cc engine and clocked " + this.kmOdometer + " km's.";
    }
}