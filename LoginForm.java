import java.awt.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        Frame f = new Frame("Login Form");

        Label userLabel = new Label("Username:");
        Label passLabel = new Label("Password:");

        TextField userText = new TextField();
        TextField passText = new TextField();

        Button login = new Button("Login");

        Label result = new Label("");

        userLabel.setBounds(50, 60, 100, 30);
        userText.setBounds(160, 60, 150, 30);

        passLabel.setBounds(50, 110, 100, 30);
        passText.setBounds(160, 110, 150, 30);

        login.setBounds(160, 160, 80, 30);

        result.setBounds(100, 210, 200, 30);

        f.add(userLabel);
        f.add(userText);
        f.add(passLabel);
        f.add(passText);
        f.add(login);
        f.add(result);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("Login Button Clicked");
            }
        });

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}