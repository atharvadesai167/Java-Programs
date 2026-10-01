import java.awt.*;

public class ListExample {
    public static void main(String[] args) {
        Frame f = new Frame("List Example");

        Label l = new Label("Select Subject:");

        List list = new List();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Database");

        l.setBounds(50, 50, 150, 30);
        list.setBounds(50, 90, 150, 100);

        f.add(l);
        f.add(list);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}