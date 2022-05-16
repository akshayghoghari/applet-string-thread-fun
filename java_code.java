/*<applet code="Appletfun" width="1000" height="1000">
<param name=str value="Java Applet">
</applet>*/
import java.awt.*;
import java.applet.*;
public class Appletfun extends Applet implements Runnable
{
	Thread t;
	String str="",temp="";
	Boolean b=true;
	int i=0;
	Font f=new Font("Arial",40,40);
	public void init()
	{
		t=new Thread(this);
	}
	public void start()
	{
		t.start();
	}
	public void paint(Graphics g)
	{
		
		g.setFont(f);
		int k=40;
		for(int j=0;j<=temp.length()-1;j++)
			{	
				
				String ch=temp.charAt(j)+"";
				
				if((j+1)%2==0)
				{
					g.setColor(Color.green);
				}
				else
				{
					g.setColor(Color.red);
				}
				g.drawString(ch,k,100);
				k=k+40;
			}
		
	}
	public void run()
	{
		str=getParameter("str");
		for(i=0;i<=str.length()-1;i++)
		{	
			
			temp+=str.charAt(i);
			repaint();
			try
			{
				t.sleep(1000);
			}
			catch(Exception e){}
			
			
		}
	}
}
