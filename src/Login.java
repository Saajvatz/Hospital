import javax.swing.*;
import java.awt.Color;

public class Login extends JFrame {

    public Login() {
        // Configurar el JFrame
        this.setLayout(null);
        this.setBounds(0, 0, 1800, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el primer panel y establecer su color de fondo
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 900, 1000);
        panel1.setBackground(Color.BLUE);

        // Crear el segundo panel y establecer su color de fondo
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(900, 0, 900, 1000);
        panel2.setBackground(Color.WHITE);

        // Crear y configurar los componentes del formulario de usuario
        JLabel email = new JLabel("Email");
        email.setBounds(100, 200, 100, 50);
        panel2.add(email);

        JTextField usuario = new JTextField();
        usuario.setBounds(100, 260, 350, 40);
        panel2.add(usuario);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(100, 320, 100, 50);
        panel2.add(passwordLabel);

        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(100, 380, 350, 40);
        panel2.add(contraseña);

        JButton boton = new JButton("Login");
        boton.setBounds(100, 440, 120, 40);
        panel2.add(boton);

        // Añadir los paneles al JFrame
        this.add(panel1);
        this.add(panel2);

        // Hacer visible el JFrame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}