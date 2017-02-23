/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tkint
 */
public class MonServeur {

    private boolean thread = true;

    public MonServeur(int i) throws IOException {
        ServerSocket serverSocket = new ServerSocket(i);
        System.out.println("Création du serveur");
        
        Socket socket  = serverSocket.accept();;
        System.out.println("Client accepté");
        
        BufferedReader reader = null;
        PrintWriter writer = null;
        
        while (thread) {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            String s = reader.readLine();
            System.out.println("Le client a écrit: " + s);
            writer.println("Le client a écrit: " + s);
            writer.flush();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Erreur");
            }
        }
        if (reader != null) {
            reader.close();
        }
        if (writer != null) {
            writer.close();
        }
        if (socket != null) {
            socket.close();
        }
    }

    public static void main(String[] args) {
        try {
            MonServeur serv = new MonServeur(10000);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
