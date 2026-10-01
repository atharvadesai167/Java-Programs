import java.awt.*;

public class ChoiceExample {
    public static void main(String[] args) {
        Frame f = new Frame("Choice Example");

        Label l = new Label("Select City:");

        Choice c = new Choice();

        c.add("Pune");
        c.add("Mumbai");
        c.add("Delhi");
        c.add("Bangalore");

        l.setBounds(50, 80, 100, 30);
        c.setBounds(150, 80, 150, 30);

        f.add(l);
        f.add(c);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}