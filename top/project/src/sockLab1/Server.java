/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockLab1;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author student
 */
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

Server(int port) {

    }
   

    void start() {
        try {
// Create a server socket that wilt listen to a client 
            final ServerSocket server = new ServerSocket(5555);
// Wait for a client to connect
// Program will halt here until a client is connected 
            final Socket clientConnection = server.accept();
// Open output stream to send response to client
            final PrintWriter out = new PrintWriter(clientConnection.getOutputStream(), true); // Open input stream to get requests from client
            final Scanner in = new Scanner(clientConnection.getInputStream());
// If there is a request, process it.
            while (in.hasNext()) {
// Read the client request
                final String clientRequest = in.nextLine(); // Check if the request is empty
                if (!clientRequest.isEmpty()) {
// Send a response to the client
                    out.println("Request received '" + clientRequest.toUpperCase() + "'");
                }
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());

        }
    }
}