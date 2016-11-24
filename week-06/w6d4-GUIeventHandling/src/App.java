import javax.swing.*;

/**
 * Created by zoloe on 2016. 11. 24..
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

//                new EventCounter();
                new WrapperAppMenu();
            }

        });
    }
}
