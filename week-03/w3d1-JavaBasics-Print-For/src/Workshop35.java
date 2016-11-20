/**
 * Created by zoloe on 2016. 11. 03..
 */
public class Workshop35 {
    public static void main(String[] args) {
        // Write a program which has this output
        // 1******
        // 12*****
        // 123****
        // 1234***
        // 12345**
        // 123456*
        // 1234567


        for(int i=1;i<7;i++){
            for(int j=1;j<7;j++){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}