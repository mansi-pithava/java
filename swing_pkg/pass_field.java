package swing_pkg;
import javax.swing.*;
import java.awt.*;
public class pass_field {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPasswordField  jf=new JPasswordField();
        JTextArea ta=new JTextArea(200,200);

        JLabel jl=new JLabel("password");
        f.setLayout(new FlowLayout());
        f.add(ta);
        f.add(jl);
        f.add(jf);
        f.setSize(300,300);
        f.setVisible(true);


    }
}
