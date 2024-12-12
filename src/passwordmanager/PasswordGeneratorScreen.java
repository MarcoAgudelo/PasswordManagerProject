package passwordmanager;

import javax.swing.*;
import java.util.Random;

public class PasswordGeneratorScreen extends JFrame {
    public PasswordGeneratorScreen() {
        setTitle("Generador de Contraseñas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton generateButton = new JButton("Generar Contraseña");
        JTextField passwordField = new JTextField(20);
        passwordField.setEditable(false);

        panel.add(generateButton);
        panel.add(passwordField);
        add(panel);

        generateButton.addActionListener(e -> {
            String password = generatePassword(12);
            passwordField.setText(password);
        });
    }

    private String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}


