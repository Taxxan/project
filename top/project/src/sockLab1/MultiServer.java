/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockLab1;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class MultiServer {
   private int _port;
    MultiServer(int _port) {
this._port = _port;
    }
      public void start() {
        try {
            System.out.println("Server started");
// Create a server socket that wilt listen to a client 
            final ServerSocket server = new ServerSocket(_port);
            System.out.println("Server waiting for client");
            while (true){
                final Socket clientConnection = server.accept();
                final Thread clientThread = new Thread(() -> {
                    execute(clientConnection);  
                });
                clientThread.start();
            }
        }catch (final Throwable ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
      }
          private void execute(final Socket clientConnection){
              try{
                  System.out.println("Client connected to server");
// Open output stream to send response to client
            final PrintWriter out = new PrintWriter(clientConnection.getOutputStream(), true); // Open input stream to get requests from client
            final Scanner in = new Scanner(clientConnection.getInputStream());
            System.out.println("Server is listening to requests");
// If there is a request, process it.
            while (in.hasNext()) {
// Read the client request
                final String clientRequest = in.nextLine(); // Check if the request is empty
                if (!clientRequest.isEmpty()) {
// Send a response to the client
                    System.out.println("Client sent request: "+ clientRequest);
                    out.println("Request received '" + clientRequest.toUpperCase() + "'");
                }
            }
        } catch (final Throwable ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
              System.out.println("Client disconnected");
        }
    }

