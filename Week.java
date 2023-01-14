package User_Interface;

import javax.swing.*;

public class Week extends  JFrame{

    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton signupButton;
    private JPanel login;

    public Week(){
        setContentPane(login);
        setTitle("Login Page");
        signupButton.addActionListener(e->{
            new Signup();
            setVisible(false);
        });
        setSize(450,300);
        setVisible(true);
    }
}
