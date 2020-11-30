import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


class UDPClient {
    public static void main(String[] args) throws IOException {

        DatagramSocket clientSocket = new DatagramSocket();

        InetAddress IPAddress = InetAddress.getByName("localhost");

        byte[] sendData;
        byte[] receivedData = new byte[1000];

        String sentence = "Hello Server! This is Client. We are successfully connected.";

        sendData = sentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);


        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
        clientSocket.receive(receivedPacket);

        String messageFromServer = new String(receivedPacket.getData());
        System.out.println("Message received from Server is: \n" + messageFromServer);


        clientSocket.close();
    }
}