import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]){
		ServerSocket server = null;
		Socket you = null;
		String s = null;
		DataOutputStream out = null;
		DataInputStream in = null;
		try{
			server =  new ServerSocket(4441);
		}catch(IOException e1){
			System.out.println("ERROR:"+ e1);
		}
		try{
			you = server.accept();
			in = new DataInputStream(you.getInputStream());
			out = new DataOutputStream(you.getOutputStream());
			while(true){
				s = in.readUTF();
				if(s!=null){
					break;
				}
				out.writeUTF("�ͻ�����ã����Ƿ�����");
				out.close();
			}
		}catch(IOException e){
			System.out.println("ERROR:" +e);
		}
	}
}
