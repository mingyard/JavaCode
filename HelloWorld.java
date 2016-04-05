import java.applet.*;
import java.awt.*;
public class HelloWorld extends Applet
{
	public void paint(Graphics g )
	{
			g.setColor(Color.blue);
			g.drawString("aaaa",30,20);
			g.setColor(Color.red);
			g.drawString("bbbbbb",30,50);
	}
}