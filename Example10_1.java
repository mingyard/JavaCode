import java.net.*;
class Example10_1 {
	public static void main(String args[]){
		try{
			InetAddress addr = InetAddress.getByName("www.baidu.com");
			String domainName = addr.getHostName();
			String IPName 	  = addr.getHostAddress();
			System.out.println(domainName);
			System.out.println(IPName);
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
}
