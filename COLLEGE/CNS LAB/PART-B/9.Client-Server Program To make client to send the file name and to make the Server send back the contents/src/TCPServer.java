import java.net.*;
import java.io.*;

public class TCPServer {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(4000);

        System.out.println("Server ready for Connection");

        Socket socket = serverSocket.accept();
        System.out.println("Connection is successful and Waiting for chatting");


        InputStream inputStream = socket.getInputStream();
        BufferedReader fileRead = new BufferedReader(new InputStreamReader(inputStream));
        String fileName = fileRead.readLine();
        BufferedReader contentRead = new BufferedReader(new FileReader(fileName));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream,true);



        String str;
        while((str = contentRead.readLine()) != null) {
            printWriter.println(str);
        }

        socket.close();
        serverSocket.close();
        printWriter.close();
        fileRead.close();
        contentRead.close();
    }

}