import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


class UDPServer {
    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket ds = new DatagramSocket(9876);

        byte[] sendData;
        byte[] receivedData = new byte[1000];

        DatagramPacket dp = new DatagramPacket(receivedData, receivedData.length);
        ds.receive(dp);

        String str = new String(dp.getData());
        System.out.println("Data sent by Client:  "+ str);


        InetAddress ip = dp.getAddress();

        int port = dp.getPort();

        System.out.println("Enter message to be sent:");
        String data = in.readLine();
        sendData = data.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ip, port);
        ds.send(sendPacket);


        ds.close();

    }
}