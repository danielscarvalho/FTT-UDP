import java.io.*;
import java.net.*;

public class UDPClient {

private static int UDP_PORT = 5005;

public static void main(String [] args) throws IOException {

	DatagramSocket clientSocket = new DatagramSocket();
	InetAddress address = InetAddress.getByName(args[0]);

	String msg = "Vai Corinthians!!";
	
        if (args.length > 1)
            msg = args[1];

        byte[] buf = msg.getBytes();
	DatagramPacket packet = new DatagramPacket(buf,buf.length, address, UDP_PORT);
	clientSocket.send(packet);

	}
}
