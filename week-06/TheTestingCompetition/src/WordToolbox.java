import com.greenfox.lesson.junit.*;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class WordToolbox implements IWordToolbox{
    private String stringHeld;

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }
    boolean isAnAnagram(String stringToCheck);
    int countHowMany(char charToFind);


}
