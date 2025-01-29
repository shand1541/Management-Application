import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
class SignUpDialog extends JDialog {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> customerTypeComboBox;
    private JButton okButton, cancelButton;

    public SignUpDialog(JFrame parent, ArrayList<User> users) {
        super(parent, "Sign Up", true);
        setLayout(new GridLayout(4, 2, 10, 10));
        setSize(300, 200);

        // Components
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Customer Type:"));
        customerTypeComboBox = new JComboBox<>(new String[]{"Individual", "Corporate", "Nonprofit Organisation"});
        add(customerTypeComboBox);

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        add(okButton);
        add(cancelButton);

        okButton.addActionListener(e -> {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword());
            String customerType = (String) customerTypeComboBox.getSelectedItem();

            // Validate User name 
            if (users.stream().anyMatch(user -> user.getUsername().equals(username))) {
                JOptionPane.showMessageDialog(this, "The same account name already exists", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                users.add(new User(username, password, customerType));
                JOptionPane.showMessageDialog(this, "User signed up successfully!");
                dispose();
            }
        });

        cancelButton.addActionListener(e -> dispose());
    }
}
