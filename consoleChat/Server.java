package com.android.consoleChat;

import java.net.*;
import java.io.*;

class Server {
    private static int port = 3333;

    public static void main (String[] args) throws IOException {

        class ClientConn implements Runnable {
            private Socket client;

            ClientConn(Socket client) {
                this.client = client;
            }

            public void run() {
                BufferedReader in = null;
                PrintWriter out = null;

                try {
                    in = new BufferedReader(new InputStreamReader(
                            client.getInputStream()));
                    out = new PrintWriter(client.getOutputStream(), true);
                } catch (IOException e) {
                    System.err.println(e);
                    return;
                }

                String msg;
                try {
                    while ((msg = in.readLine()) != null) {
                        System.out.println("Client says: " + msg);
                        out.println("OK");
                    }
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }

        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Could not listen on port: " + port);
            System.err.println(e);
            System.exit(1);
        }

        Socket client = null;
        while(true) {
            try {
                client = server.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.err.println(e);
                System.exit(1);
            }
            Thread t = new Thread(new ClientConn(client));
            t.start();
        }
    }
}