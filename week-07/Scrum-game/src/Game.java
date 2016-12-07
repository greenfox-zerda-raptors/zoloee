import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Game extends JFrame {
    public Game() {
        //Create and set up the window.
        new JFrame("maszkalos"); // JFrame Game =
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //Add content to the window.
        JPanel board = new Board();
        this.add(board);

        //Display the window.
        this.pack(); //pack must be before setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }
}
