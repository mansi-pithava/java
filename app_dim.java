import java.applet.*;
import java.awt.*;
public class app_dim extends Applet {
    public void paint(Graphics g){
        int baseline=100;
        
        g.setColor(Color.blue);
        g.drawLine(8, baseline, 220, baseline);
        
        Font f=new Font("serif",Font.BOLD,20);
        
        g.setFont(f);
        g.drawString("Java is high level language", 5, baseline);
       
        FontMetrics fm=g.getFontMetrics(f);// here f is object of font class
        System.out.println("Ascent="+fm.getAscent());
        
        System.out.println("descent="+fm.getDescent());
    }
}/*
  <applet code="app_dim.class" height="200" width="300">
  </applet>
 */

