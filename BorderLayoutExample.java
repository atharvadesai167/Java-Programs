import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout Example");

        f.setLayout(new BorderLayout());

        f.add(new Button("North"), BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);
        f.add(new Button("Center"), BorderLayout.CENTER);

        f.setSize(500, 400);
        f.setVisible(true);
    }
}