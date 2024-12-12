package passwordmanager;

import javax.swing.*;

public class AccountManagementScreen extends JFrame {
    public AccountManagementScreen() {
        setTitle("Gestión de Cuentas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Aquí se gestionan las cuentas", SwingConstants.CENTER);
        add(label);
    }
}


