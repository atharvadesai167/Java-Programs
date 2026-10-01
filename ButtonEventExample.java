import java.awt.*;
import java.awt.event.*;

public class ButtonEventExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Event");

        Button b = new Button("Click Me");
        Label l = new Label("Button not clicked");

        b.setBounds(100, 80, 100, 40);
        l.setBounds(100, 140, 150, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Button Clicked!");
            }
        });

        f.add(b);
        f.add(l);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}