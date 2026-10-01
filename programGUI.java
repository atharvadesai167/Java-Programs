import java.awt.*;
import java.awt.event.*;

public class programGUI extends Frame implements ActionListener {

    // Components
    Label title, nameLabel, emailLabel, genderLabel;
    Label languageLabel, courseLabel, subjectLabel, addressLabel, resultLabel;

    TextField nameField, emailField;

    Checkbox male, female;
    Checkbox java, python, cpp;

    CheckboxGroup genderGroup;

    Choice courseChoice;

    List subjectList;

    TextArea addressArea;

    Button submitButton, clearButton;

    MenuBar menuBar;
    Menu fileMenu, editMenu, helpMenu;
    MenuItem newItem, exitItem, aboutItem;

    // Constructor
    programGUI() {

        setTitle("Student Registration Form");
        setSize(700, 600);
        setLayout(new BorderLayout());

        // ---------------- MENU BAR ----------------

        menuBar = new MenuBar();

        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        helpMenu = new Menu("Help");

        newItem = new MenuItem("New");
        exitItem = new MenuItem("Exit");
        aboutItem = new MenuItem("About");

        fileMenu.add(newItem);
        fileMenu.add(exitItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setMenuBar(menuBar);

        // Menu events
        newItem.addActionListener(this);
        exitItem.addActionListener(this);
        aboutItem.addActionListener(this);

        // ---------------- TITLE ----------------

        title = new Label(
            "STUDENT REGISTRATION FORM",
            Label.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 22));

        add(title, BorderLayout.NORTH);

        // ---------------- MAIN PANEL ----------------

        Panel mainPanel = new Panel();

        mainPanel.setLayout(
            new GridLayout(8, 2, 10, 10)
        );

        // Name
        nameLabel = new Label("Name:");
        nameField = new TextField();

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);

        // Email
        emailLabel = new Label("Email:");
        emailField = new TextField();

        mainPanel.add(emailLabel);
        mainPanel.add(emailField);

        // Gender
        genderLabel = new Label("Gender:");

        genderGroup = new CheckboxGroup();

        male = new Checkbox(
            "Male",
            genderGroup,
            false
        );

        female = new Checkbox(
            "Female",
            genderGroup,
            false
        );

        Panel genderPanel =
            new Panel(new FlowLayout(FlowLayout.LEFT));

        genderPanel.add(male);
        genderPanel.add(female);

        mainPanel.add(genderLabel);
        mainPanel.add(genderPanel);

        // Programming Languages
        languageLabel = new Label("Languages:");

        java = new Checkbox("Java");
        python = new Checkbox("Python");
        cpp = new Checkbox("C++");

        Panel languagePanel =
            new Panel(new FlowLayout(FlowLayout.LEFT));

        languagePanel.add(java);
        languagePanel.add(python);
        languagePanel.add(cpp);

        mainPanel.add(languageLabel);
        mainPanel.add(languagePanel);

        // Course
        courseLabel = new Label("Course:");

        courseChoice = new Choice();

        courseChoice.add("Computer Engineering");
        courseChoice.add("Information Technology");
        courseChoice.add("Electronics");
        courseChoice.add("Mechanical");

        mainPanel.add(courseLabel);
        mainPanel.add(courseChoice);

        // Subjects
        subjectLabel = new Label("Subject:");

        subjectList = new List(4, true);

        subjectList.add("Java");
        subjectList.add("Python");
        subjectList.add("Database");
        subjectList.add("Web Technology");
        subjectList.add("Computer Networks");

        mainPanel.add(subjectLabel);
        mainPanel.add(subjectList);

        // Address
        addressLabel = new Label("Address:");

        addressArea = new TextArea();

        mainPanel.add(addressLabel);
        mainPanel.add(addressArea);

        // Buttons
        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        Panel buttonPanel =
            new Panel(new FlowLayout());

        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);

        mainPanel.add(buttonPanel);

        // Add main panel
        add(mainPanel, BorderLayout.CENTER);

        // ---------------- RESULT ----------------

        resultLabel = new Label(
            "Enter details and click Submit",
            Label.CENTER
        );

        add(resultLabel, BorderLayout.SOUTH);

        // ---------------- BUTTON EVENTS ----------------

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // ---------------- WINDOW CLOSE EVENT ----------------

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

        setVisible(true);
    }

    // ---------------- EVENT HANDLING ----------------

    public void actionPerformed(ActionEvent e) {

        // Submit button
        if (e.getSource() == submitButton) {

            String name = nameField.getText();

            if (name.isEmpty()) {

                resultLabel.setText(
                    "Please enter your name!"
                );

            } else {

                resultLabel.setText(
                    "Registration Successful! Welcome " + name
                );
            }
        }

        // Clear button
        else if (e.getSource() == clearButton) {

            nameField.setText("");
            emailField.setText("");
            addressArea.setText("");

            genderGroup.setSelectedCheckbox(null);

            java.setState(false);
            python.setState(false);
            cpp.setState(false);

            resultLabel.setText("Form Cleared");
        }

        // New menu
        else if (e.getSource() == newItem) {

            nameField.setText("");
            emailField.setText("");
            addressArea.setText("");

            resultLabel.setText("New Form Created");
        }

        // Exit menu
        else if (e.getSource() == exitItem) {

            System.exit(0);
        }

        // About menu
        else if (e.getSource() == aboutItem) {

            resultLabel.setText(
                "Java GUI Student Registration System"
            );
        }
    }

    // ---------------- MAIN METHOD ----------------

    public static void main(String[] args) {

        new programGUI();
    }
}