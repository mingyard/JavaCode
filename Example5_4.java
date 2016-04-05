import java.applet.*;
import javax.swing.*;

class MyPanel extends JPanel{
	JButton button1,button2;
	JLabel  label;
	MyPanel(String s1,String s2,String s3){
		button1 = new JButton(s1);
		button2 = new JButton(s2);
		label   = new JLabel(s3);
		add(button1);
		add(button2);
		add(label);
	}
}

public class Example5_4 extends Applet{
	MyPanel panel1,panel2;
	JButton button;
	
	public void init(){
		panel1 = new MyPanel("确定","取消","标签，我们在面板1中");
		panel2 = new MyPanel("确定","取消","标签，我们在面板2中");
		button = new JButton("我不是在面板中的按钮");
		add(panel1);
		add(panel2);
		add(button);
		setSize(300,200);
	}
}