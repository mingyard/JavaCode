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
		panel1 = new MyPanel("ȷ��","ȡ��","��ǩ�����������1��");
		panel2 = new MyPanel("ȷ��","ȡ��","��ǩ�����������2��");
		button = new JButton("�Ҳ���������еİ�ť");
		add(panel1);
		add(panel2);
		add(button);
		setSize(300,200);
	}
}