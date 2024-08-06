import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) {
        String serverHostname = "localhost"; // server hostname
        int serverPort = 3000; // server port

        try (Socket socket = new Socket(serverHostname, serverPort);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server...");

            String userInput;
            while ((userInput = stdIn.readLine()) != null) { // read lines of user input
                out.println(userInput); // send the user input to the server
                String serverResponse = in.readLine(); // read the response from the server
                System.out.println("Server response: " + serverResponse);
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + serverHostname);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
