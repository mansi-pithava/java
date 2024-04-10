import java.applet.*;
import java.awt.*;
/* <applet code="aplife.class" width="300" height="300">
</applet> 
*/

public class aplife extends Applet
{
    String s="";
    public void init()
    {
        s+="init";
    }
    public void start()
    {
        s+="start";
    }
    public void stop()
    {
        s+="stop";
    }
    public void destroy()
    {
        System.out.println("destroy");
    }
    public void paint(Graphics g)
    { 
        //Color c=new Color(20,100,100);
        //g.setColor(c);
        
        g.drawString(s,70, 40);
      
        // g.draw3DRect(50,20, 50, 20, getFocusTraversalKeysEnabled());
        // g.drawLine(600,10,100, 100);
        // g.setColor(Color.orange);
        // g.drawString("fill rect",30, 35);
        // g.fillRect(30,110,80,90);
        // g.setColor(Color.red);
        // g.drawOval(30, 40, 100, 60);
        // g.fillOval(30, 300, 70, 70);
        // g.drawRect(30, 220, 100,70);
        // g.setColor(Color.darkGray);
        // g.fillArc(30, 500, 50, 90, 100, 500);
        // g.drawArc(40, 400, 50, 90, 100, 500);

        // //g.drawpolygon(30,70,50,80,90,100);
    }
    
}
