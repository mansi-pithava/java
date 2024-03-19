package swing_pkg;
import java.awt.*;
import javax.swing.*;
public class layout //1
{
    JFrame f;
    layout()
    {
        f=new JFrame();
        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        f.setLayout(new BorderLayout(15,15));//it is not compalsary
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.setSize(300,300);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new layout();
        //simple frame example 1.
        // Frame f=new Frame();
        // Button b=new Button("NORTH");
        // f.setLayout(new BorderLayout());
        // f.add(b,BorderLayout.NORTH);
        // f.setSize(200,200);
        // f.setVisible(true);
    }
}
