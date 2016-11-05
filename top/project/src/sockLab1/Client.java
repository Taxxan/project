/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockLab1;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Client {
    
    int port;
    String host;
    Client(String host, int port){
        this.port = port;
        this.host = host;
    }
    void start(){
      try {
// Open socket. Connect to server.
final Socket client = new Socket(host, port);
// Open an output stream to send data to server.
final PrintWriter out = new PrintWriter(client.getOutputStream(), true);
// Open an input stream to receive data from server
final Scanner in = new Scanner(client.getInputStream());
// Create a Scanner to get the User input from command line.
final Scanner userIn = new Scanner(System.in);
// Create an infinite loop
while (true) {
System.out.print("Enter request: ");
// Get the user input
final String userInput = userIn.nextLine();
// Send the user input to the server
out.println(userInput);
// Get the server response and print it to the user
System.out.println("» " + in.nextLine());
}
} catch (Exception ex) { System.out.println("ERROR: " + ex.getMessage());
   
     }
    
}
}