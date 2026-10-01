import java.awt.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame f = new Frame("TextField Example");

        Label l = new Label("Enter Name:");
        TextField t = new TextField();

        l.setBounds(50, 80, 100, 30);
        t.setBounds(160, 80, 150, 30);

        f.add(l);
        f.add(t);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}