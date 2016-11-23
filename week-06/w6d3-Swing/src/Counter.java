import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class Counter extends JFrame{
     int mouseClicks = 0;
    //init Jframe with default empty constructor:
    public Counter() throws HeadlessException {

        this.setTitle("Click Counter");

        //init Jpanel:
        JPanel cPanel = new JPanel();
        JLabel cLabel = new JLabel("Pressed: null");
        JButton cButton = new JButton("Press me!");
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mouseClicks++;
                cLabel.setText("Pressed: " + mouseClicks);
            }
        });
        cPanel.add(cButton);
        cPanel.add(cLabel);
        this.add(cPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
