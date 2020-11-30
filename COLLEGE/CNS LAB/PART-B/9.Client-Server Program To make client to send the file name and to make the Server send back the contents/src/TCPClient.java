import java.net.*;
import java.io.*;

public class TCPClient {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1",4000);

        System.out.println("Enter the filename");

        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        String fileName = keyRead.readLine();

        OutputStream outputStream = socket.getOutputStream();

        PrintWriter printWriter = new PrintWriter(outputStream,true);
        printWriter.println(fileName);


        InputStream inputStream = socket.getInputStream();
        BufferedReader socketRead = new BufferedReader(new InputStreamReader(inputStream));

        String str;
        while((str = socketRead.readLine()) != null) {
            System.out.println(str);
        }


        printWriter.close();
        socketRead.close();
        keyRead.close();
    }

}