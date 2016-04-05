import java.io.*;
import java.net.*;
public class Client {
	public static void main(String args[]){
		String s = null;
		Socket mySocket;
		DataInputStream in = null;
		DataOutputStream out = null;
		try{
			mySocket = new Socket("localhost",4441);
			in = new DataInputStream(mySocket.getInputStream());
			out = new DataOutputStream(mySocket.getOutputStream());
			out.writeUTF("goog server!");
			while(true){
				s = in.readUTF();
				if(s==null){
					break;
				}
				else{
					System.out.println(s);
				}
			}
		}catch(IOException e){
			System.out.println("can't connect");
		}
	}
}
