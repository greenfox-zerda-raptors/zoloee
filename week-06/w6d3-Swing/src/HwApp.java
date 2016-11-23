import javax.swing.*;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class HwApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                new HelloWorld();
//                new Counter();
                new UIControls();
            }

        });
    }
}


