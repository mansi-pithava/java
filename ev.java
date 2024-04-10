import java.awt.*;
import java.awt.event.*;


/*<applet code="ev.class" height="200" width="200" ></applet>*/

public class ev extends Frame implements MouseListener {
   public  Frame frame;
    public ev() {
        frame = new Frame("Change Background Color");
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        frame.addMouseListener(this);
        frame.setBackground(Color.GRAY);
        frame.setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        frame.setBackground(Color.GREEN); }

    public void mouseEntered(MouseEvent e) {
        frame.setBackground(Color.BLUE);}

    public void mouseExited(MouseEvent e) {
        frame.setBackground(Color.RED);}

    public void mousePressed(MouseEvent e) {
        frame.setBackground(Color.DARK_GRAY);
    }

    public void mouseReleased(MouseEvent e) {
        frame.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        new ev();

    }
}
 
