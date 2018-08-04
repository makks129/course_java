package collection.multithreading.client_server.server;

import javax.swing.*;
import java.net.InetAddress;
import java.util.Date;

public class TestServer {

    public static void main(String[] args) {

        ServerWindow window = new ServerWindow();
        JTextArea textArea = window.getTextArea();

        Server server = new Server(8000);
        server.setListener(new Server.Listener() {
            @Override
            public void onServerStarted(int port) {
                textArea.append("Server started at " + new Date() + "\n");
            }

            @Override
            public void onClientConnected(int clientNumber, InetAddress clientAddress) {
                String text = "Starting thread for client " + clientNumber + " at " + new Date() + "\n" +
                        "Client " + clientNumber + "'s host name is " + clientAddress.getHostName() + "\n" +
                        "Client " + clientNumber + "'s IP address is " + clientAddress.getHostAddress() + "\n";
                textArea.append(text);
            }

            @Override
            public void onReceived(InetAddress clientAddress, double value) {
                textArea.append("Received from client " + clientAddress.getHostName() + ": \"" + value + "\"\n");
            }

            @Override
            public void onSent(InetAddress clientAddress, double value) {
                textArea.append("Sent to client " + clientAddress.getHostName() + ": \"" + value + "\"\n");
            }
        });
        server.start();

    }

}
