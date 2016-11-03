/**
 * Created by zoloe on 2016. 11. 03..
 */
public class loopprimes {
    public static void main(String[] args) {
        int j;
        for (int i=2;i<201;i++){
            if (i==3) System.out.println(i);
            else{
                //if (i%2==0 or i%3==0)
                j=5;
                while ((j*j) <= i){
                    if(!(i%j==0 || i%(j+2)==0)){
//                        continue;
                        System.out.println(j);
                    }
                    else{
                        System.out.println(j);
                    }
                    j+=6;
                }
            }
        }
    }
}
