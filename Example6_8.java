
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyPanel extends JPanel{
	public void print(int r){
		Graphics g = getGraphics();
		g.clearRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(Color.red);
		g.fillOval(10, 10, r, r);
	}
}
class MyWindow extends JFrame implements MouseListener{
	JTextArea text;
	MyPanel panel;
	int x,y,r = 10;
	int mouseFlg =0;
	static String mouseStates[] = {"鼠标键按下","鼠标键松开","鼠标进来","鼠标走开","鼠标双击"};
	MyWindow(String s){
		super(s);
		Container con  = this.getContentPane();
		con.setLayout(new GridLayout(2,1));
		this.setSize(200,300);
		this.setLocation(100, 100);
		panel = new MyPanel();
		con.add(panel);
		text = new JTextArea(10,20);
		text.setBackground(Color.blue);
		con.add(text);
		addMouseListener(this);
		this.setVisible(true);
		this.pack();
	}
	public void paint(Graphics g){
		r = r+4;
		if(r>80){
			r=10;
		}
		text.append(mouseStates[mouseFlg]+"了，位置是:"+x+"，"+y+"\n");
		panel.print(r);
	}
	public void mousePressed(MouseEvent e){
		x = e.getX();
		y = e.getY();
		mouseFlg =0;
		repaint();
	}
	public void mouseReleased(MouseEvent e){
		x = e.getX();
		y = e.getY();
		mouseFlg = 1;
		repaint();
	}
	public void mouseEntered(MouseEvent e){
		x = e.getX();
		y = e.getY();
		mouseFlg =2 ;
		repaint();
	}
	public void mouseExited(MouseEvent e){
		x = e.getX();
		y = e.getY();
		mouseFlg =3;
		repaint();
	}
	public void mouseClicked(MouseEvent e){
		if(e.getClickCount()==2){
			x = e.getX();
			y = e.getY();
			mouseFlg = 4;
			repaint();
		}else{}
	}
}
public class Example6_8 extends Applet{
	public void init(){
		MyWindow myWnd = new MyWindow("鼠标事件示意程序");
	}
}