package collection.networking;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

    private JTextArea textArea = new JTextArea();

    public AppWindow() {
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setTitle("Application");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}