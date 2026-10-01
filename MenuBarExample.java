import java.awt.*;

public class MenuBarExample {
    public static void main(String[] args) {
        Frame f = new Frame("MenuBar Example");

        MenuBar mb = new MenuBar();

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(exitItem);

        mb.add(file);
        mb.add(edit);

        f.setMenuBar(mb);

        f.setSize(500, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}