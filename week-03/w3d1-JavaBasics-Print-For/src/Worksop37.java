/**
 * Created by zoloe on 2016. 11. 03..
 */
public class Worksop37 {
    public static void main(String[] args) {
        // Write a program which has this output
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        //  # # # # # # #
        // # # # # # # #
        // The # character should be replacable, hence store it in a variable

        char digit='#';
        char out;
        char out2;

        for(int i=1;i<8;i++){
            if (i%2!=0){
                out=digit;
                out2=' ';
            }
            else {
                out=' ';
                out2=digit;
            }
            for(int j=1;j<16;j++){
                if(j%2!=0){
                    System.out.print(out);
                }
                else{
                    System.out.print(out2);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}