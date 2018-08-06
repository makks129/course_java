package collection.networking;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

    private JTextArea textArea;
    private JButton buttonLoad;

    public AppWindow() {
        setTitle("Application");
        setSize(500, 300);

        textArea = new JTextArea();
        buttonLoad = new JButton("Load users");

        JPanel panel = new JPanel();
        panel.add(buttonLoad);
        panel.add(new JScrollPane(textArea));
        getContentPane().add(panel);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getButtonLoad() {
        return buttonLoad;
    }
}