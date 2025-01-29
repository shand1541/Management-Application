import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
class LogInDialog extends JDialog {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton okButton, cancelButton;

    public LogInDialog(JFrame parent, ArrayList<User> users) {
        super(parent, "Log In", true);
        setLayout(new GridLayout(3, 2, 10, 10));
        setSize(300, 150);

        // Components
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        add(okButton);
        add(cancelButton);

        okButton.addActionListener(e -> {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword());

            // Authenticate User
            User user = users.stream()
                    .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                    .findFirst()
                    .orElse(null);

            if (user != null) {
                ((ManagementApp) parent).setLoggedInUser(user);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid user name or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> dispose());
    }
}
