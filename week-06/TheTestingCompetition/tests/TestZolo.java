import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class TestZolo {
    abcHolder myAbcHolder = new abcHolder();
    WordToolbox wSource = new WordToolbox("Tarzan's toenails");
    WordToolbox wSource2 = new WordToolbox("Me Tarzan, You Jane");

    @Test
    public void main() throws Exception {
        for (char c : wSource2.getS().toCharArray()) {
//            for (abcCharAndAmountHolder ocar : myAbcHolder) {
            for ( int i = 0; i < myAbcHolder.getSize(); i++ )
                if ( myAbcHolder.get(i).achar == c) { //
                    ++ocar.setOccurence();
                }
            }
        }

        for (abcCharAndAmountHolder ocar : myAbcHolder) {
                assertEquals(wSource.countHowMany(ocar.getaChar()), ocar.getOccurence());
        }
//
//        assertEquals(wSource.countHowMany('a'),3);
//        assertEquals(wSource.countHowMany('T'),2);
//        assertEquals(wSource.countHowMany('t'),2);
//        assertEquals(wSource.countHowMany('x'),0);
//        assertEquals(wSource.countHowMany(' '),1);
//        assertEquals(wSource.countHowMany('z'),1);
//        assertEquals(wSource.countHowMany('n'),2);
//        assertEquals(wSource.countHowMany('\''),1);
//        assertEquals(wSource.countHowMany('s'),2);
//        assertEquals(wSource.countHowMany('o'),1);
//        assertEquals(wSource.countHowMany('e'),1);
//        assertEquals(wSource.countHowMany('i'),1);
//        assertEquals(wSource.countHowMany('l'),1);
    }// test main

    @Test
    public void main2 () throws Exception {
        assertEquals(wSource2.countHowMany('a'), 3);
        assertEquals(wSource2.countHowMany('T'), 2);
        assertEquals(wSource2.countHowMany('t'), 2);
        assertEquals(wSource2.countHowMany('x'), 0);
        assertEquals(wSource2.countHowMany(' '), 1);
    }
        // az abc betuivel egy tomb, elsoban a betu, masodikban an elofortulas

//    public ArrayList<abcCharAndAmountHolder> abcHolder = new ArrayList<abcCharAndAmountHolder>();

//    abcHolder.add = new AbcCharAndAmountHolder('a',0);
//    abcHolder[] = new AbcCharAndAmountHolder('b',0);

        public class abcHolder {
            public ArrayList<abcCharAndAmountHolder> abc = new ArrayList<>();

            public abcHolder() {
                abc.add('a', 0);
                abc.add('b', 0);
                abc.add('c', 0);
                abc.add('d', 0);
                abc.add('e', 0);
                abc.add('f', 0);
                abc.add('g', 0);
                abc.add('h', 0);
                abc.add('i', 0);
                abc.add('j', 0);
                abc.add('k', 0);
                abc.add('l', 0);
                abc.add('m', 0);
                abc.add('n', 0);
                abc.add('o', 0);
                abc.add('p', 0);
                abc.add('q', 0);
                abc.add('r', 0);
                abc.add('s', 0);
                abc.add('t', 0);
                abc.add('u', 0);
                abc.add('v', 0);
                abc.add('w', 0);
                abc.add('x', 0);
                abc.add('y', 0);
                abc.add('z', 0);
                abc.add(' ', 0);
            }

            public int getSize() {
                return abc.size();
            }
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
