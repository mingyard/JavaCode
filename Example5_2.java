import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Example5_2{
	public static MyWindowDemo mw1;
	public static MyWindowDemo mw2;
	public static void main(String args[]){
		JButton butt1 = new JButton("this is frist button");
		String name1= "this is frist name";
		String name2= "this is secende name";
		mw1 = new MyWindowDemo(name1,butt1,Color.blue,350,450);
		mw1.setVisible(true);
		JButton butt2 = new JButton("this is secende button");
		mw2 = new MyWindowDemo(name2,butt2,Color.magenta,300,400);
		mw2.setVisible(true);
	}
}

class MyWindowDemo extends JFrame{
	public MyWindowDemo(String name,JButton button,Color c,int w,int h){
		super();
		setTitle(name);
		setSize(w,h);
		Container con= getContentPane();
		con.add(button);
		con.setBackground(c);
	}
}