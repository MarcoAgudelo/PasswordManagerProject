package passwordmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {
    public MainScreen() {
        setTitle("Pantalla Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));

        JButton manageAccountsButton = new JButton("Gestionar Cuentas");
        JButton generatePasswordButton = new JButton("Generador de Contraseñas");
        JButton logoutButton = new JButton("Cerrar sesión");

        panel.add(manageAccountsButton);
        panel.add(generatePasswordButton);
        panel.add(logoutButton);

        add(panel);

        manageAccountsButton.addActionListener(e -> new AccountManagementScreen().setVisible(true));
        generatePasswordButton.addActionListener(e -> new PasswordGeneratorScreen().setVisible(true));
        logoutButton.addActionListener(e -> {
            dispose();
            new LoginScreen().setVisible(true);
        });
    }
}

