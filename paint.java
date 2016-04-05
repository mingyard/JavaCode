import java.applet.*;
import java.awt.*;
public class paint extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawString("欢迎你学习Java语言。",30,20);
		g.setColor(Color.red);
		g.drawString("只要认真学习，多上机实习，一定能学好java语言。", 30, 50);
		maxDigit(237127);
	}
	
	void maxDigit(int n){
		int c=0,d,x=0,y=0;
		while(n>0){
			d = n%10;
			y++;
			if(d>=c){
				c=d;
				x=y;
			}
			n/=10;
		}
		System.out.println(c+","+x);
	}
}