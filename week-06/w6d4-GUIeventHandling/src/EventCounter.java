import javax.swing.*;
import java.awt.*;

/**
 * Created by zoloe on 2016. 11. 24..
 */
public class EventCounter extends JFrame {
    public EventCounter() throws HeadlessException {
        JTextField TextField = new JTextField(20);
        JLabel mCount = new JLabel("-");
        JLabel nameMcount = new JLabel("Mouse counter:");
        nameMcount.setLabelFor(mCount);
        JLabel kCount = new JLabel("-");
        JLabel nameKcount = new JLabel("Keyboard counter:");
        nameKcount.setLabelFor(kCount);
        JLabel wCount = new JLabel("-");
        JLabel nameWcount = new JLabel("Window counter:");
        nameWcount.setLabelFor(nameWcount);

        Box ecBox = Box.createVerticalBox();

        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(TextField);
        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(nameMcount);
        ecBox.add(mCount);
        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(nameKcount);
        ecBox.add(kCount);
        ecBox.add(Box.createVerticalStrut(10));
        ecBox.add(nameWcount);
        ecBox.add(wCount);
        ecBox.add(Box.createVerticalStrut(10));

        this.setTitle("EventCounter");
        this.add(ecBox, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
//        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
