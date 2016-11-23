import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class UIControls extends JFrame implements ActionListener {
    JTextField uiText = new JTextField(20);
    JLabel uiLabel1 = new JLabel(" --- ");
    JLabel uiLabel2 = new JLabel("");
    public UIControls() throws HeadlessException {
        this.setTitle("UIControls");
//        JPanel uiPanel = new JPanel();

        JLabel uiLabel1name = new JLabel("Text: ");
        uiLabel1name.setLabelFor(uiLabel1);
        JLabel uiLabel2name = new JLabel("Memory: ");
        uiLabel2name.setLabelFor(uiLabel2);

        uiText.addActionListener(this);

        Box box = Box.createVerticalBox();

        this.add(box, BorderLayout.CENTER);
        this.setSize(300, 200);

        box.add(Box.createVerticalStrut(10));
        box.add(uiText);
        box.add(Box.createVerticalStrut(10));
        box.add(uiLabel1name);
        box.add(uiLabel1);
        box.add(Box.createVerticalStrut(10));
        box.add(uiLabel2name);
        box.add(uiLabel2);
        box.add(Box.createVerticalStrut(30));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
            uiLabel2.setText(uiLabel1.getText());
            uiLabel1.setText(uiText.getText());
    }
}
