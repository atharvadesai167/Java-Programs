import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout Example");

        f.setLayout(new FlowLayout());

        f.add(new Button("One"));
        f.add(new Button("Two"));
        f.add(new Button("Three"));
        f.add(new Button("Four"));

        f.setSize(400, 300);
        f.setVisible(true);
    }
}