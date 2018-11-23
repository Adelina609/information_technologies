import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket serverSocket;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(8080);
        System.out.println("Server started");
        clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        out.println("HTTP/1.1 200 OK");
        out.println();
        out.println("Content-Type: text/html");
        out.println("\r\n");
        out.println("<p> Hello </p>");
        out.println("\r\n");
        out.println("\r\n");
        out.flush();
//                try {
//                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                    // и отправлять
//                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
//
//                    String word = in.readLine();
//                    System.out.println(word);
//                    out.write("Entered data: " + word + "\n");
//                    out.flush();
//
//                } finally {
//                    System.out.println("close socket");
//                    clientSocket.close();
//                    in.close();
//                    out.close();
//                }
//            } finally {
//                System.out.println("Server closed");
//                serverSocket.close();
//            }
//        } catch (IOException e) {
//            System.err.println(e);
//        }
        //  }
    }
}