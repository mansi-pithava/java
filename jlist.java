import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import javax.swing.filechooser.*;
public class jlist {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("show");
        JButton save=new JButton("save");
        JButton open=new JButton("open");
        f.setLayout(new FlowLayout());
        f.setSize(500, 300);
        final JLabel l = new JLabel();
        final JLabel l1 = new JLabel();

        DefaultListModel dm = new DefaultListModel();
        dm.addElement("c");
        dm.addElement("csharp");
        dm.addElement("clan");
        dm.addElement("cpp");
        dm.addElement("Java");
        final JList list = new JList(dm);
        f.add(list);
        DefaultListModel dm1 = new DefaultListModel();
        dm1.addElement("j.n.sir");
        dm1.addElement("sem 1");
        dm1.addElement("sem 4");
        dm1.addElement("sem 3");
        dm1.addElement("sem 4");
        final JList list1 = new JList(dm1);
        f.add(list1);
        f.add(b);
        f.add(l);
        f.add(l1);
        //f.add(save);
        //f.add(open);

        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data;
                data = " selected items:- " + list.getSelectedValue();
                l.setText(data); 
                data = " "+list1.getSelectedValue();
                l1.setText(data);
            }
        });
        

    }

}
