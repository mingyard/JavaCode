import javax.swing.*;
import java.awt.*;

public class Example5_5{

public static void main(String args[]){
	JLabel label1,label2,label3,label4,label5;
	JFrame mw = new JFrame("����һ������");
	mw.setSize(250,200);
	Container con = mw.getContentPane();
	con.setLayout(new BorderLayout());
	label1 = new JLabel("����ǩ");
	label2 = new JLabel("�ϱ�ǩ",JLabel.CENTER);
	label3 = new JLabel("����ǩ");
	label4 = new JLabel("����ǩ",JLabel.CENTER);
	label5 = new JLabel("�б�ǩ",JLabel.CENTER);
	con.add(label1,"East");
	con.add(label2,"South");
	con.add(label3,"West");
	con.add(label4,"North");
	con.add(label5,"Center");
	mw.setVisible(true);
}
}