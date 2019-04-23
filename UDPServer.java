import java.io.*;
import java.net.*;

//Reference: Java Notes For Professionals
//           https://en.wikipedia.org/wiki/User_Datagram_Protocol
//           Java Como Programar

public class UDPServer{

public static void main(String [] args) throws IOException{
	DatagramSocket serverSocket = new DatagramSocket(5005);
	byte[] rbuf = new byte[256];
	
        DatagramPacket packet = new DatagramPacket(rbuf, rbuf.length);

	System.out.println("Java UDP Server");

        do {
        	serverSocket.receive(packet);
		String response = new String(packet.getData());
		System.out.println("Response: " + packet.getPort() + ": " + response);
	} while(true);
	}
}
