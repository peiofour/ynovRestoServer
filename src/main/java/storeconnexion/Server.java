package storeconnexion;

import org.flywaydb.core.Flyway;
import org.jdbi.v3.core.Jdbi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){

        int port = 2345;
        ServerSocket serverSocket;
        Socket socket;
        BufferedReader in;
        PrintWriter out;

        //Init flyway
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://10.31.0.188:3306/store_management", "root", "Tal33z");
        flyway.migrate();

        Jdbi jdbi = Jdbi.create("jdbc:mysql://10.31.0.188:3306/store_management", "root", "Tal33z");

        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server socket listening " + serverSocket.getLocalPort());

            socket = serverSocket.accept();
            System.out.println("Connect");
            out = new PrintWriter(socket.getOutputStream());
            out.println("T'es connecté");
            out.flush();
            socket.close();
            serverSocket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
