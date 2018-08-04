package collection.multithreading.client_server.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

    private Listener listener;
    private int port;
    private int clientNumber = 1;

    public Server(int port) {
        this.port = port;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            listener.onServerStarted(port);
            while (true) {
                Socket socket = serverSocket.accept();
                InetAddress clientAddress = socket.getInetAddress();
                listener.onClientConnected(clientNumber, clientAddress);
                clientNumber++;

                HandleClientTask task = new HandleClientTask(clientAddress, socket);
                new Thread(task).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private class HandleClientTask implements Runnable {

        private InetAddress clientAddress;
        private Socket socket;

        public HandleClientTask(InetAddress clientAddress, Socket socket) {
            this.clientAddress = clientAddress;
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());

                while (true) {
                    double inputDouble = input.readDouble();
                    listener.onReceived(clientAddress, inputDouble);

                    double outputDouble = inputDouble * 10;
                    output.writeDouble(outputDouble);
                    listener.onSent(clientAddress, outputDouble);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public interface Listener {
        void onServerStarted(int port);
        void onClientConnected(int clientNumber, InetAddress clientAddress);
        // TODO add method that should be called when client gets disconnected
        void onReceived(InetAddress clientAddress, double value);
        void onSent(InetAddress clientAddress, double value);
    }


}
