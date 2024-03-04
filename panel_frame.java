import java.applet.*;
import java.awt.*;
/*
 * <applet code="panel_frame.class" height="500" width="500">
 * </applet>
 */

public class panel_frame extends Applet {
    public void init() {
        
        setLayout(new BorderLayout());
        Panel p1 = new Panel();
        Button b = new Button("name");
        p1.add(b);
        add(p1,"North");
        Checkbox c=new Checkbox("blue",false);//first chkbox
        p1.add(c);
        add(p1,"Center");
    }

}
