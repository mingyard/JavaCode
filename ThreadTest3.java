import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ThreadTest3 extends Applet implements Runnable {  
	Thread threadArc,threadOval;  
	Graphics arcPen,ovalPen;  
	int arcSeta=0,ovalSeta=0;  
	public void init()  {
		setSize(300,300);   
		threadArc=new Thread(this);   
		threadOval=new Thread(this);   
		arcPen=getGraphics();   
		ovalPen=getGraphics();   
		arcPen.setColor(Color.red);   
		ovalPen.setColor(Color.black);   
		setBackground(Color.blue);  
		}  
	public void start()  {   
		threadArc.start();   
		threadOval.start();  
		}  
	public void run()  {   
		int x,y;   
		while(true)   {   
			if(Thread.currentThread()==threadArc)   {    
				x=(int)(80*Math.cos(3.1415926/180.0*arcSeta));    
				y=(int)(80*Math.sin(3.1415926/180.0*arcSeta));    
				arcPen.setColor(Color.blue);    
				arcPen.fillOval(100+x,100+y,10,10);    
				arcSeta+=3;    
				x=(int)(80*Math.cos(3.1415926/180.0*arcSeta));    
				y=(int)(80*Math.sin(3.1415926/180.0*arcSeta));    
				arcPen.setColor(Color.red); 
				arcPen.fillOval(100+x,100+y,10,10);     
				try{
					threadArc.sleep(20);
					}catch(InterruptedException e){
				}   
			}   
			if(Thread.currentThread()==threadOval)   {
				x=(int)(80*Math.cos(3.1415926/180.0*ovalSeta));
				y=(int)(40*Math.sin(3.1415926/180.0*ovalSeta));
				ovalPen.setColor(Color.blue);
				ovalPen.fillOval(100+x,100+y,10,10);
				ovalSeta+=3;    
				x=(int)(80*Math.cos(3.1415926/180.0*ovalSeta));
				y=(int)(40*Math.sin(3.1415926/180.0*ovalSeta));
				ovalPen.setColor(Color.black);
				ovalPen.fillOval(100+x,100+y,10,10);
				try{
					threadOval.sleep(50);
				}catch(InterruptedException e){
					
				}   
			}   
		}  
	} 
} 
