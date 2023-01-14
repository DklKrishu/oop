package User_Interface;

import javax.swing.*;

public class Signup extends JFrame {
    private JPanel signup;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton signUpButton;
    private JButton backButton;

    public Signup(){
        setContentPane(signup);
        setTitle("Login Page");
        setSize(450,300);
        setVisible(true);
    }
}
