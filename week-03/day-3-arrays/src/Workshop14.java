/**
 * Created by zoloe on 2016. 11. 06..
 */

public class Workshop14{
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        int temp;
        boolean kesz=false;
        System.out.println(ah.length);

            for (int j=0; j < ah.length; j++){
                for( int i=0; i<(ah.length-1); i++) {
                if (ah[i] < ah[i + 1]) {
                    temp = ah[i];
                    ah[i] = ah[i + 1];
                    ah[i + 1] = temp;
                }

                }
            }



        for(int i=0;i<5;i++){
            System.out.print(ah[i]);
        };

        System.out.println();
    }
}