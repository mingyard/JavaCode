import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class Example10_2 {
	public static void main(String args[]){
		new DownNetFile();
	}
}
class DownNetFile extends JFrame implements ActionListener{
	JTextField infield = new JTextField(30);
	JTextArea showArea = new JTextArea();
	JButton b = new JButton("DownLoad");
	JPanel p = new JPanel();
	DownNetFile(){
		super("read network text file application");
		Container con = this.getContentPane();
		p.add(infield);
		p.add(b);
		JScrollPane jsp = new JScrollPane(showArea);
		b.addActionListener(this);
		con.add(p, "North");
		con.add(jsp,"Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		readByURL(infield.getText());		
	}

	public void readByURL(String urlName){
		try{
			URL url = new URL(urlName);
			URLConnection tc = url.openConnection();
			tc.connect();
			InputStreamReader in = new InputStreamReader(tc.getInputStream());
			System.out.println(in);
			BufferedReader dis = new BufferedReader(in);
			String inline;
			while((inline = dis.readLine())!= null){
				showArea.append(inline + "\n");
			}
			dis.close();
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
