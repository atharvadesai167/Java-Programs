import java.awt.*;

public class ButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");

        Button b1 = new Button("Click Me");
        Button b2 = new Button("Submit");

        b1.setBounds(100, 80, 100, 40);
        b2.setBounds(100, 140, 100, 40);

        f.add(b1);
        f.add(b2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}