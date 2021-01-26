import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


class UDPClient {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("localhost");

        byte[] sendData;
        byte[] receivedData = new byte[1000];

        String str1 = "Hello Server! This is Client. We are successfully connected.";

        sendData = str1.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ip, 9876);
        ds.send(sendPacket);


        DatagramPacket dp = new DatagramPacket(receivedData, receivedData.length);
        ds.receive(dp);

        String str2 = new String(dp.getData());
        System.out.println("Message received from Server is: \n" + str2);


        ds.close();
    }
}