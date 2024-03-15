import java.awt.*;
public class layout {
    public static void main(String[] args) {
        Frame f=new Frame();
        Button b=new Button("NORTH");
        f.setLayout(new BorderLayout());
        f.add(b,BorderLayout.NORTH);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
