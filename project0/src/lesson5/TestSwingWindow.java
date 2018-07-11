package lesson5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwingWindow extends JFrame {

    public TestSwingWindow() {
        setTitle("My screen");
        setSize(200, 100);

        JButton button = new JButton("Click here!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);
        this.getContentPane().add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new TestSwingWindow();

    }


}
