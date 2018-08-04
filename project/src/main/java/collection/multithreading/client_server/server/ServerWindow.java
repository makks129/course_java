package collection.multithreading.client_server.server;

import javax.swing.*;
import java.awt.*;

public class ServerWindow extends JFrame {

    private JTextArea textArea = new JTextArea();

    public ServerWindow() {
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setTitle("Server");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}