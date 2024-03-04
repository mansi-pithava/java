import java. applet.*;
import java.awt.*;
import java.awt.event.*;
/*
 * <applet code="events.class" height="200"width="200">
 * </applet>
 */
public class events extends Applet {
    public void init()
    {
        setBackground(Color.green);
        addMouseListener( new myMouseAdapter(this));
    }
    
}
class myMouseAdapter extends MouseAdapter{
    events n;
    public myMouseAdapter(events n)
    {
        this.n=n;

    }
    public void mousePressed(MouseEvent me)
    {
            n.setBackground(Color.blue);
            n.repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
            n.setBackground(Color.green);
            n.repaint();
    }
}
