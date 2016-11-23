import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zoloe on 2016. 11. 23..
 */
public class UIControls extends JFrame implements ActionListener{
    JTextField uiText = new JTextField(20);
    JLabel uiLabel1 = new JLabel(" --- ");
    JLabel uiLabel2 = new JLabel("");
    public UIControls() throws HeadlessException {
        this.setTitle("UIControls");
        JPanel uiPanel = new JPanel();

        JLabel uiLabel1name = new JLabel("Text: ");
        uiLabel1name.setLabelFor(uiLabel1);
        JLabel uiLabel2name = new JLabel("Memory: ");
        uiLabel2name.setLabelFor(uiLabel2);

//        uiText.setActionCommand("text");

        uiText.addActionListener(this);

//        BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS); // top to bottom
//        this.setLayout(boxLayout);
//        Box.createRigidArea(new Dimension(0, 20));

        uiPanel.add(uiText);
        uiPanel.add(uiLabel1name);
        uiPanel.add(uiLabel1);
        uiPanel.add(uiLabel2name);
        uiPanel.add(uiLabel2);


        this.add(uiPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
//        if ( e.getActionCommand() == "text" ){
            uiLabel2.setText(uiLabel1.getText());
            uiLabel1.setText(uiText.getText());
//        }
    }
}
