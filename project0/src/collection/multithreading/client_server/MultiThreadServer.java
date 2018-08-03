package collection.multithreading.client_server;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class MultiThreadServer extends JFrame {

    private JTextArea jta = new JTextArea();

    public static void main(String[] args) {
        new MultiThreadServer();
    }

    public MultiThreadServer() {

        setLayout(new BorderLayout());
        add(new JScrollPane(jta), BorderLayout.CENTER);
        setTitle("MultiThreadServer");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        try {

            ServerSocket serverSocket = new ServerSocket(8000);
            jta.append("MultiThreadServer started at " + new Date() + "\n");

            int clientNo = 1;

            while (true) {


                Socket socket = serverSocket.accept();

                jta.append("Starting thread for client " + clientNo + " at " + new Date() + "\n");

                InetAddress inetAddress = socket.getInetAddress();

                jta.append("Client " + clientNo + "'s host name is " + inetAddress.getHostName() + "\n");
                jta.append("Client " + clientNo + "'s IP address is " + inetAddress.getHostAddress() + "\n");

                HandleClientTask task = new HandleClientTask(socket);
                new Thread(task).start();

                clientNo++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class HandleClientTask implements Runnable {

        private Socket socket;

        public HandleClientTask(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {

                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());

                while (true) {

                    double inputDouble = input.readDouble();

                    jta.append("Received from client: \"" + inputDouble + "\"\n");

                    double outputDouble = inputDouble * 10;
                    output.writeDouble(outputDouble);

                    jta.append("Sent to client: \"" + outputDouble + "\"\n");
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



}
