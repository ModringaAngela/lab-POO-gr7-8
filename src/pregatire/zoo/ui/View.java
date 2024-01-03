package pregatire.zoo.ui;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private Model model;
    private JButton d = new JButton("d");
    private JButton e = new JButton("e");
    private JButton f = new JButton("f");
    private JTextArea outputField = new JTextArea(70, 70);

    public View(Model model){
        this.model = model;
        JPanel panel = new JPanel();
        panel.add(d);
        panel.add(e);
        panel.add(f);
        panel.add(outputField);
        outputField.setEditable(false);
        outputField.setLineWrap(true); // Enable line wrapping
        outputField.setWrapStyleWord(true); // Wrap at word boundaries
        this.setContentPane(panel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void setOutput(String output) {
        this.outputField.setText(output);
    }

    void addDListener(ActionListener mal) {
        d.addActionListener(mal);
    }

    void addEListener(ActionListener cal) {
        e.addActionListener(cal);
    }

    void addFListener(ActionListener cal) {
        f.addActionListener(cal);
    }
}
