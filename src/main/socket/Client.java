import java.io.*;
import java.net.Socket;

public class Client {

    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        clientSocket = new Socket("localhost", 8080);

        OutputStream out  = clientSocket.getOutputStream();
        PrintWriter w = new PrintWriter(new OutputStreamWriter(out));
        w.println("GET / HTTP\\1.1");
        w.println("HOST localhost");
        w.println();
        w.println();
        w.flush();
        LineNumberReader r = new LineNumberReader(new InputStreamReader(clientSocket.getInputStream()));
        String line;
        while ((line = r.readLine()) != null){
            System.out.println(line);
        }
        line = null;
        w.println("GET / HTTP\\1.1");
        w.println("HOST localhost");
        w.println();
        w.println();
        w.flush();

//        try {
//            try {
//                clientSocket = new Socket("localhost", 2007);
//                reader = new BufferedReader(new InputStreamReader(System.in));
//                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
//
//                System.out.println("Enter something");
//                String word = reader.readLine();
//                out.write(word + "\n");
//                out.flush();
//                String serverWord = in.readLine();
//                System.out.println(serverWord);
//            } finally {
//                System.out.println("Client is closed");
//                clientSocket.close();
//                in.close();
//                out.close();
//            }
//        } catch (IOException e) {
//            System.err.println(e);
//        }

    }
}
