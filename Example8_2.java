
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class Example8_2 extends Applet implements Runnable {

	Thread myThread = null;
	JTextArea t;
	int k;

	public void start(){
		t = new JTextArea(20,20);
		add(t);
		k = 0;
		setSize(500,500);
		if(myThread == null){
			myThread = new Thread(this);
			myThread.start();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(myThread!=null){
			try{
				myThread.sleep(1000);k++;
			}catch(InterruptedException e){
			
			}
			repaint();
		}
	}
	
	public void paint(Graphics g){
		double i = Math.random();
		if(i<0.5){
			g.setColor(Color.yellow);
		}else{
			g.setColor(Color.blue);
		}
		g.fillOval(10, 10, (int)(100*i), (int)(100*i));
		t.append("我在工作，已休息了"+k+"次\n");
	}
	
	public void stop(){
		if(myThread != null){
			myThread.stop();
			myThread = null;
		}
	}

}
