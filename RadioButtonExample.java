import java.awt.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Radio Button Example");

        Label l = new Label("Select Gender:");

        CheckboxGroup group = new CheckboxGroup();

        Checkbox male = new Checkbox("Male", group, false);
        Checkbox female = new Checkbox("Female", group, false);

        l.setBounds(50, 60, 150, 30);
        male.setBounds(50, 100, 100, 30);
        female.setBounds(50, 140, 100, 30);

        f.add(l);
        f.add(male);
        f.add(female);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}