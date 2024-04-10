import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="txtfield.class"height=500 width="500"></applet>*/
public class txtfield extends Applet implements ActionListener{

TextField name,pass;
Button b1;
public void init()
{
    //Font f=new Font();
   // FlowLayout fl=new FlowLayout(FlowLayout.LEFT);

    Panel p=new Panel();
    Panel p1=new Panel(); 
    Label lnm=new Label("Name",Label.RIGHT);
    name=new TextField(12);
    Label lps=new Label("\nPassword",Label.RIGHT);
    pass=new TextField(8);
    pass.setEchoChar('*');
   p.add(lnm);
    p.add(name);
    add(p,"NORTH");
   p1.add(lps);
   p1.add(pass);
   add(p1,"SOUTH");
    b1=new Button("clickme");
    add(b1);
    b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
    repaint();
}
public void paint(Graphics g)
{
    Font f=new Font("serif",Font.BOLD,20);
    g.setFont(f);
    g.drawString("Name       :"+name.getText(),6,100);
    g.drawString("password   :"+pass.getText(),6,150 );
}
    
}