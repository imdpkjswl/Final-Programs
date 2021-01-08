import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


class UDPServer {
    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket serverSocket = new DatagramSocket(9876);

        byte[] sendData;
        byte[] receivedData = new byte[1000];

        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
        serverSocket.receive(receivedPacket);

        String sentence = new String(receivedPacket.getData());
        System.out.println("Data sent by Client:  "+ sentence);


        InetAddress IPAddress = receivedPacket.getAddress();

        int port = receivedPacket.getPort();

        System.out.println("Enter message to be sent:");
        String data = in.readLine();
        sendData = data.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
        serverSocket.send(sendPacket);


        serverSocket.close();

    }
}