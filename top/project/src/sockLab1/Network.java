/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockLab1;

import org.omg.CORBA.DynAnyPackage.Invalid;

/**
 *
 * @author student
 */
public class Network {

    final static String FORMAT = "--server<port>\n--client<host> <port>";
    
public static void execute(final String name){
    for(int index = 1; index <= 5; index++){
        System.out.println("Thread" + name + " - " + index);
    }
}
public static void main(String[] args) {
    final Thread one = new Thread(() -> execute("First Thread"));
    final Thread two = new Thread(() -> execute("Second Thread"));
    final Thread three = new Thread(() -> execute("Third Thread"));
    one.start();
    two.start();
    three.start();
    
        if (args.length == 0) {
            System.out.println("Invalid arguments provided.Arguments:");
System.out.println(FORMAT);
            return;
        }
        if (args[0].equals("--server") && args.length == 2) {
final Server server = new Server(Integer.parseInt(args[1]));
            server.start();
        }
        else if (args[0].equals( "--client") && args.length == 3)
{
final Client client = new Client(args[1], Integer.parseInt(args[2]));
            client.start();
        }else if (args[0].equals("--multiserver") && args.length==2){
            final MultiServer mserver = new MultiServer(Integer.parseInt(args[1]));
            mserver.start();
        }
        else {
 System.out.println("Invalid arguments provided.Arguments:");
System.out.println(FORMAT);;
        }
    }
}
