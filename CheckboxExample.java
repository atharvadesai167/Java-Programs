import java.awt.*;

public class CheckboxExample {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox Example");

        Label l = new Label("Select Languages:");

        Checkbox c1 = new Checkbox("Java");
        Checkbox c2 = new Checkbox("Python");
        Checkbox c3 = new Checkbox("C++");

        l.setBounds(50, 50, 150, 30);
        c1.setBounds(50, 90, 100, 30);
        c2.setBounds(50, 130, 100, 30);
        c3.setBounds(50, 170, 100, 30);

        f.add(l);
        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}