import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
public class Example10_9 extends JFrame implements ActionListener{
	
	public static Connection connectByJdbcodbc(String url,String username,String password){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		try{
			con = DriverManager.getConnection(url,username,password);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return con;
	}
	
	String title[] ={"考号","姓名","成绩","地址","简历"};
	JTextField txtNo = new JTextField(8);
	JTextField txtName = new JTextField(10);
	JTextField txtScore = new JTextField(3);
	JTextField txtAddr  = new JTextField(30);
	JTextArea txtresume = new JTextArea();
	JButton prev = new JButton("前一个");
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
