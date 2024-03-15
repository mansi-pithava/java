import java.awt.*;

public class menu extends Frame {
    /**
     * @param title
     */
    menu(String title) {
        super(title);
        MenuBar m = new MenuBar();
        setMenuBar(m);
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

    public static void main(String[] args) {
        menu mm = new menu("demo of menu");
        mm.setSize(300, 300);
        mm.setVisible(true);
    }

}
