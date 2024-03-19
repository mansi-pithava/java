import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class scroll {
    JScrollBar sc;

    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setLayout(new FlowLayout(100));
        f.setSize(500,300);
        JButton b= new JButton("show");
        JScrollBar sc=new JScrollBar(JScrollBar.VERTICAL,0,10,0,300);
        sc.setValue(10);
        f.add(sc);
        f.add(b);
        f.setVisible(true);
        sc.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent am)
            {
                //int val= sc.get;
                 int i=0;
                while (i!=2000) 
                {
                    i=i+20;
                    try{ Thread.sleep(150);}catch(Exception e){}
                }
            }       
        });
    }  
}
