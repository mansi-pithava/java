import java.applet.Applet;
import java.awt.Button;
//import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;
/*<applet code="btn.class" height="200" width="200" ></applet>*/
public class btn extends Applet{
    public void init() {
        Button b1=new Button("Yes");
        add(b1);
        setSize(300,300);
        final Label l1=new Label();
        add(b1);
        add(l1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data;
                data="you have pressed yes";
                l1.setText(data);
            }
        });
        Button b2=new Button("NO");

        add(b2);
        setSize(300,300);
        final Label l2=new Label();
        add(b2);
        add(l2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String data;
                data="you have pressed NO";
                l2.setText(data);
            }
        });

    }

    
}
