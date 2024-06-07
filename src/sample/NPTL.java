package sample;
import javax.swing.*;

public class NPTL extends JFrame {

    JPasswordField password;
    JTextField username;
    JButton loginButton;

    public NPTL() {
        username = new JTextField();
        password = new JPasswordField();
        loginButton = new JButton("Student Login");
        add(username);
        add(password);
        add(loginButton);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NPTL();
    }
}

