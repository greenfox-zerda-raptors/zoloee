import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class Counter extends JFrame implements ActionListener {
    int mouseClicks = 0;
    JLabel cLabel = new JLabel("Pressed: null");

    //init Jframe with default empty constructor:
    public Counter() throws HeadlessException {

        this.setTitle("Click Counter");

        //init Jpanel:
        JPanel cPanel = new JPanel();

        JButton cButton = new JButton("Press me!");
        cButton.addActionListener(this);
        cPanel.add(cButton);
        cPanel.add(cLabel);
        this.add(cPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    @Override //Az Action Listener izejet overrideoljuk
    public void actionPerformed(ActionEvent e) {
        mouseClicks++;
        cLabel.setText("Pressed: " + mouseClicks);
    }
}
