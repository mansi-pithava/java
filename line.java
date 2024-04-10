import java.applet.Applet;
import java.awt.*;
public class line extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(0, 100, 30, 100);
        Font f=new Font("Monospacea",Font.ITALIC,50);
        setFont(f);
        g.drawString("hii",15,100);
        FontMetrics fm=g.getFontMetrics();
        int a=fm.getAscent();
       // int y=100-fm.getdescent();



    }

   
}
