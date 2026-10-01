import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        Frame f = new Frame("Label Example");

        Label l1 = new Label("Welcome to Java GUI");
        Label l2 = new Label("This is a Label");

        l1.setBounds(80, 80, 200, 30);
        l2.setBounds(80, 120, 200, 30);

        f.add(l1);
        f.add(l2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}