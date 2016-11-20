/**
 * Created by zoloe on 2016. 11. 03..
 */
public class Workshop36 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // # # # # #
        // The # character should be replacable, hence store it in a variable

        char digit='#';

        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(j%2!=0){
                    System.out.print(digit);
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    }
