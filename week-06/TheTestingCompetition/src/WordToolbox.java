import com.greenfox.lesson.junit.*;

/**
 * Created by zoloe on 2016. 11. 21..
 */
 public class WordToolbox implements IWordToolbox{
    private String stringHeld;

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }
    public boolean isAnAnagram(String stringToCheck){
        return true;
    };
    public int countHowMany(char charToFind){
        int sum = 0;
        for (int i = 0; i < stringHeld.length(); i++) {
            if (stringHeld.charAt(i) == charToFind){
                sum = sum + 1;
            }
        }
        return sum;
    }// countHowMany

    public void setStringHeld(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public String getStringHeld() {
        return stringHeld;
    }

    @Override
    public void setS(String s) {
    }

    @Override
    public String getS() {
        return null;
    }

    @Override
    public void WaitingItOut() {
    }
}

