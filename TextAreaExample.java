import java.awt.*;

public class TextAreaExample {
    public static void main(String[] args) {
        Frame f = new Frame("TextArea Example");

        Label l = new Label("Enter your message:");

        TextArea ta = new TextArea();

        l.setBounds(50, 50, 150, 30);
        ta.setBounds(50, 90, 250, 120);

        f.add(l);
        f.add(ta);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}