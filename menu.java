import java.awt.*;

public class menu {
    /**
     * @param title
     */
  public static void main(String[] args){
    Frame f=new Frame();
        MenuBar m = new MenuBar();
        f.setSize(300, 300);
        f.setVisible(true);

       f.setMenuBar(m);
        Menu file = new Menu("file");
        m.add(file);
        MenuItem open = new MenuItem("open");
        MenuItem save = new MenuItem("Save");
        // MenuItem edit=new MenuItem("Edit");
        MenuItem New = new MenuItem("New");
        file.add(open);
        file.add(save);
        // file.add(edit);
        file.add(New);
        Menu edit = new Menu("edit");
        file.add(edit);
        MenuItem cut = new MenuItem("cut");
        edit.add(cut);
        MenuItem copy = new MenuItem("copy");
        edit.add(copy);
        MenuItem paste = new MenuItem("paste");
        edit.add(paste);
  }
    }

   