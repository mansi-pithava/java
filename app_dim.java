import java.applet.*;
import java.awt.*;
public class app_dim extends Applet {
    public void paint(Graphics g){
        int baseline=100;
        g.setColor(Color.blue);
        g.drawLine(8, baseline, 150, baseline);
        Font f=new Font("serif",Font.BOLD,50);
        g.drawString("Java is high level language", 5, baseline);
        FontMetrics fm=g.getFontMetrics(f);
        System.out.println("Ascent="+fm.getAscent());
    }
}/*
  <applet code="app_dim.class" height="200" width="300">
  </applet>
 */

