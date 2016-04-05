import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Panel1 extends JPanel{

	JRadioButton box1,box2,box3;

	ButtonGroup g;
	Panel1(){
		setLayout(new GridLayout(1,3));
		g = new ButtonGroup();
		box1 = new JRadioButton(MyWindow.fName[0] + "计算机",false);
		box2 = new JRadioButton(MyWindow.fName[1] + "计算机",false);
		box3 = new JRadioButton(MyWindow.fName[2] + "计算机",false);
		g.add(box1);
		g.add(box2);
		g.add(box3);
		add(box3);
		add(box2);
		add(box1);
		add(new JLabel("计算机3选1"));
	}
}

class Panel2 extends JPanel{
	JCheckBox box1,box2,box3;
	ButtonGroup g;
	Panel2(){
		setLayout(new GridLayout(1,3));
		g = new ButtonGroup();
		box1 = new JCheckBox("购买1台");
		box2 = new JCheckBox("购买2台");
		box3 = new JCheckBox("购买3台");
		
		g.add(box1);
		g.add(box2);
		g.add(box3);
		
		add(box1);
		add(box2);
		add(box3);
		add(new JLabel("选择1、2或3"));
	}
}

class MyWindow extends JFrame implements ItemListener{
	Panel1 panel1;
	Panel2 panel2;
	JLabel label1,label2;
	JTextArea text1,text2;
	static String fName[] = {"HP","IBM","DELL"};
	static double priTbl[][] = {{1.20,1.15,1.10},{1.70,1.65,1.60},{1.65,1.60,1.58}};
	static int production = -1;
	MyWindow(String s){
	super(s);
	Container con = this.getContentPane();
	con.setLayout(new GridLayout(3,2));
	this.setLocation(100,100);
	this.setSize(400,100);
	panel1 = new Panel1();
	panel2 = new Panel2();
	label1 = new JLabel("产品介绍",JLabel.CENTER);
	label2 = new JLabel("产品介绍",JLabel.CENTER);
	text1 = new JTextArea();
	text2 = new JTextArea();
	con.add(label1);
	con.add(label2);
	con.add(panel1);
	con.add(panel2);
	con.add(text1);
	con.add(text2);
	panel1.box1.addItemListener(this);
	panel1.box2.addItemListener(this);
	panel1.box3.addItemListener(this);
	panel2.box1.addItemListener(this);
	panel2.box2.addItemListener(this);
	panel2.box3.addItemListener(this);
	this.setVisible(true);this.pack();	
}
public void itemStateChanged(ItemEvent e){
	if(e.getItemSelectable() == panel1.box1){
	production = 0;
	text1.setText(fName[0] + "公司生产");text2.setText("");
	}else if(e.getItemSelectable() == panel1.box2){
		production = 1;
		text1.setText(fName[1]+"公司生产");text2.setText("");
	}else if(e.getItemSelectable() == panel1.box3){
		production = 2;
		text1.setText(fName[2]+"公司生产");text2.setText("");
	}else{
		if(production == -1) return;
		if(e.getItemSelectable() == panel2.box1){
			text2.setText(""+priTbl[production][0]+"万元/台");
		}else if(e.getItemSelectable() == panel2.box2){
			text2.setText(""+priTbl[production][1]+"万元/台");
		}else if(e.getItemSelectable() == panel2.box3){
			text2.setText(""+priTbl[production][2]+"万元/台");
		}
	}
	}
}

public class Example6_2 extends Applet{	
	MyWindow myWin = new MyWindow("选择项目处理示例程序");
}