package pregatire.swing;

import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Add");
        panel.add(button);
        this.setContentPane(panel);

    }
}
