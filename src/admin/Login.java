package admin;
import javax.swing.*;
import java.awt.*;

public class Login extends Frame {
    public Login () {
        setTitle ("Sistem Toko");
        setSize(300, 200);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);
        JLabel label = new JLabel("Login for Admin", JLabel.CENTER);
        label.setFont(new Font("Aral", Font.BOLD, 20));
        panel.add(label, BorderLayout.NORTH);
        JButton button = new JButton("Login");

        panel.add(button, BorderLayout.SOUTH);
        JPanel fieldPanel = new JPanel (new GridLayout(4, 2));
        fieldPanel.add (new JLabel("Username"));
        JTextField usernameField = new JTextField();
        fieldPanel.add(usernameField);
        fieldPanel.add (new JLabel("Password"));
        JPasswordField passwordField = new JPasswordField();
        fieldPanel.add(passwordField);
        panel.add(fieldPanel);
        button.addActionListener(e -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if (username.equalsIgnoreCase("Admin") && password.equals("1234")){
                JOptionPane.showMessageDialog(this, "Login Berhasil");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username or password are incorrect");
                usernameField.setText("");
                passwordField.setText("");
            }
        });

    }
}

class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }
}

