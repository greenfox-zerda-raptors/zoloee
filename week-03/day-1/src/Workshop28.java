/**
 * Created by zoloe on 2016. 11. 03..
 */
public class Workshop28{
    public static void main(String[] args) {
        int z = 21;
        // if z is between 10 and 20 print 'Sweet!'
        // if less than 10 print 'More!',
        // if more than 20 print 'Less!'

        if (z >= 10){
            if (z <= 20){
                System.out.println("Sweet!");
            }
            else {
                System.out.println("Less!");
            }
        }
        else{
            System.out.println("More!");
        }
        System.out.println();
    }
}