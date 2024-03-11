import java.awt.*;
import java.awt.event.*;

public class menu extends Frame{
    menu(String title)
    {
        super(title);
        MenuBar mn=new MenuBar();
        setMenuBar(mn);
        //create menu
        Menu file=new Menu("File");
        //menu item
        MenuItem New=new MenuItem("New");
        MenuItem open=new MenuItem("Open");
        MenuItem save=new MenuItem("Save");
        MenuItem exit=new MenuItem("Exit");
       // MenuItem New=new MenuItem("New");
       file.add(New);
       file.add(open);
       file.add(save);
       file.add(exit);
        mn.add(file);
        
    }
}
public static void main(String args[])
{
    menu m=new menu("Menu");
    m.setSize(300,300);
    m.setVisible(true);
}

