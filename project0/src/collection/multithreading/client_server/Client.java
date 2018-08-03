package collection.multithreading.client_server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class Client extends JFrame {

    private JTextField jtf = new JTextField();
    private JTextArea jta = new JTextArea();

    private DataOutputStream outputToServer;
    private DataInputStream inputFromServer;

    public static void main(String[] args) {
        new Client();
    }

    public Client() {

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JLabel("Enter message"), BorderLayout.WEST);
        p.add(jtf, BorderLayout.CENTER);
        jtf.setHorizontalAlignment(JTextField.RIGHT);

        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(new JScrollPane(jta), BorderLayout.CENTER);

        jtf.addActionListener(new TextFieldListener());

        setTitle("Client");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            Socket socket = new Socket("localhost", 8000);
            inputFromServer = new DataInputStream(socket.getInputStream());
            outputToServer = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class TextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            try {

                Double outputDouble = Double.valueOf(jtf.getText().trim());
                jtf.setText("");
                outputToServer.writeDouble(outputDouble);

                jta.append("Sent to server: \"" + outputDouble + "\"\n");

                double inputDouble = inputFromServer.readDouble();

                jta.append("Received from server: \"" + inputDouble + "\"\n");


            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

}
