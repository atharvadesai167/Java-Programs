import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout Example");

        f.setLayout(new GridLayout(2, 3));

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));

        f.setSize(400, 300);
        f.setVisible(true);
    }
}