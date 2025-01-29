import javax.swing.*;

import extraa.EditProfileDialog.User;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ManagementApp extends JFrame {
    private JMenuBar menuBar;
    private JMenu userMenu, reviewMenu,orderMenu;
    private JMenuItem signUpMenuItem, logInMenuItem, logOutMenuItem, quitMenuItem, addReview , viewReview,orders;
    private JLabel welcomeLabel;
    private ArrayList<User> users = new ArrayList<>();
    private User loggedInUser = null;

    public ManagementApp() {
        // Setup Frame
        setTitle("Management Application");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize Menus
        menuBar = new JMenuBar();
        userMenu = new JMenu("User");
        userMenu.setMnemonic(KeyEvent.VK_U);
        reviewMenu = new JMenu("review");
        reviewMenu.setMnemonic(KeyEvent.VK_V);
        reviewMenu.setEnabled(false); // Disabled by default
      
        // User Menu Items
        signUpMenuItem = new JMenuItem("Sign Up");
        logInMenuItem = new JMenuItem("Log In");
        logOutMenuItem = new JMenuItem("Log Out");
        quitMenuItem = new JMenuItem("Quit");

        // Add Menu Items
        userMenu.add(signUpMenuItem);
        userMenu.add(logInMenuItem);
        userMenu.add(logOutMenuItem);
        userMenu.addSeparator();
        userMenu.add(quitMenuItem);

        menuBar.add(userMenu);
        menuBar.add(reviewMenu);
        menuBar.add(orderMenu);
        setJMenuBar(menuBar);
        //part 2.1 
        reviewMenu.add(addReview);
        reviewMenu.add(viewReview);
        orderMenu.add(orders);
        // Welcome Label
        welcomeLabel = new JLabel("Welcome to the Management Application", JLabel.CENTER);
        add(welcomeLabel, BorderLayout.CENTER);

        // Menu Item Actions
        signUpMenuItem.addActionListener(e -> openSignUpDialog());
        logInMenuItem.addActionListener(e -> openLogInDialog());
        logOutMenuItem.addActionListener(e -> logOut());
        quitMenuItem.addActionListener(e -> System.exit(0));
    }

    private void openSignUpDialog() {
        new SignUpDialog(this, users).setVisible(true);
    }

    private void openLogInDialog() {
        new LogInDialog(this, users).setVisible(true);
    }

    private void logOut() {
        if (loggedInUser != null) {
            loggedInUser = null;
            welcomeLabel.setText("Welcome to the Management Application");
            reviewMenu.setEnabled(false);
        }
    }

    public void setLoggedInUser(User user) {
        this.loggedInUser = user;
        updateUserView(user);  // Update the view after login
        viewMenu.setEnabled(true);
    }
    
    private void updateUserView(User loggedInUser) {
    	 // Clear previous view content
    	 remove(welcomeLabel);
    	 // Create new content based on the user type
    	 if (loggedInUser.getCustomerType().equals("Individual")) {
    	     welcomeLabel = new JLabel("Welcome, Individual User: " + loggedInUser.getUsername(), JLabel.CENTER)+;
    	     add(welcomeLabel, BorderLayout.CENTER);
    	 } else if (loggedInUser.getCustomerType().equals("Corporate")) {
    	     welcomeLabel = new JLabel("Welcome, Corporate User:you get discount of 5% on any product  " + loggedInUser.getUsername(), JLabel.CENTER +);
    	     add(welcomeLabel, BorderLayout.CENTER);    
    	 } else if (loggedInUser.getCustomerType().equals("Nonprofit Organisation")) {
    	     welcomeLabel = new JLabel("Welcome, Nonprofit Organisation: you get discount of 8% on any product " + loggedInUser.getUsername(), JLabel.CENTER);
    	     add(welcomeLabel, BorderLayout.CENTER);
    	    
    	 }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ManagementApp app = new ManagementApp();
            app.setVisible(true);
        });
    }
}
