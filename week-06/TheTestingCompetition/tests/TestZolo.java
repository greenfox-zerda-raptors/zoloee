
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class TestZolo {
    WordToolbox wSource = new WordToolbox("Tarzan's toenails");
    WordToolbox wSource2 = new WordToolbox("Me Tarzan, You Jane");


    @Test
    public void main() throws Exception {
        ArrayList<abcCharAndAmountHolder> abc = new ArrayList<>();
        abc.add(0, new abcCharAndAmountHolder('a', 0));
        abc.add(1, new abcCharAndAmountHolder('b', 0));
        abc.add(2, new abcCharAndAmountHolder('c', 0));
        abc.add(3, new abcCharAndAmountHolder('d', 0));
        abc.add(4, new abcCharAndAmountHolder('e', 0));
        abc.add(5, new abcCharAndAmountHolder('f', 0));
        abc.add(6, new abcCharAndAmountHolder('g', 0));
        abc.add(7, new abcCharAndAmountHolder('h', 0));
        abc.add(8, new abcCharAndAmountHolder('i', 0));
        abc.add(9, new abcCharAndAmountHolder('j', 0));
        abc.add(10, new abcCharAndAmountHolder('k', 0));
        abc.add(11, new abcCharAndAmountHolder('l', 0));
        abc.add(12, new abcCharAndAmountHolder('m', 0));
        abc.add(13, new abcCharAndAmountHolder('n', 0));
        abc.add(14, new abcCharAndAmountHolder('o', 0));
        abc.add(15, new abcCharAndAmountHolder('p', 0));
        abc.add(16, new abcCharAndAmountHolder('q', 0));
        abc.add(17, new abcCharAndAmountHolder('r', 0));
        abc.add(18, new abcCharAndAmountHolder('s', 0));
        abc.add(19, new abcCharAndAmountHolder('t', 0));
        abc.add(20, new abcCharAndAmountHolder('u', 0));
        abc.add(21, new abcCharAndAmountHolder('v', 0));
        abc.add(22, new abcCharAndAmountHolder('w', 0));
        abc.add(23, new abcCharAndAmountHolder('x', 0));
        abc.add(24, new abcCharAndAmountHolder('y', 0));
        abc.add(25, new abcCharAndAmountHolder('z', 0));
        abc.add(26, new abcCharAndAmountHolder(' ', 0));
        for (char c : wSource.getS().toCharArray()) {
            for (abcCharAndAmountHolder ocar : abc) {
                if ( ocar.getaChar() == Character.toLowerCase(c) ) {
                    ocar.setOccurence(ocar.getOccurence()+1);
                }
            }
        }

        for (abcCharAndAmountHolder ocar : abc) {
            assertEquals(wSource.countHowMany(ocar.getaChar()), ocar.getOccurence());
        }
    }// test main

    @Test
    public void main2 () throws Exception {
        assertEquals(wSource2.countHowMany('a'), 3);
        assertEquals(wSource2.countHowMany('T'), 2);
        assertEquals(wSource2.countHowMany('t'), 2);
//        assertEquals(wSource2.countHowMany('x'), 0);
        assertEquals(wSource2.countHowMany(' '), 1);
    }

    class abcCharAndAmountHolder{
        char aChar;
        int occurence;

        public abcCharAndAmountHolder( char aChar, int occurence){
            this.aChar = aChar;
            this.occurence = occurence;
        }

        public char getaChar() {
            return aChar;
        }

        public void setaChar(char aChar) {
            this.aChar = aChar;
        }

        public int getOccurence() {
            return occurence;
        }

        public void setOccurence(int occurence) {
            this.occurence = occurence;
        }
    }
}
