package view;
import javax.swing.*;
import java.awt.*;



    class DoctorLayout extends JFrame {

        private int[] pantalla = {1300, 800};

        public DoctorLayout() {
            // Configuración de la ventana
            setSize(pantalla[0], pantalla[1]);
            setLayout(new BorderLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Crear el panel de encabezado
            JPanel headerPanel = new JPanel();
            headerPanel.setPreferredSize(new Dimension(pantalla[0], 60));
            headerPanel.setBackground(Color.DARK_GRAY);
            headerPanel.setLayout(new BorderLayout());

            // JLabel para el nombre del hospital
            JLabel hospitalLabel = new JLabel("Nombre del Hospital");
            hospitalLabel.setForeground(Color.WHITE);
            hospitalLabel.setHorizontalAlignment(SwingConstants.LEFT);
            hospitalLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            headerPanel.add(hospitalLabel, BorderLayout.WEST);

            // Crear el panel de usuario con GridBagLayout
            JPanel userPanel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // Panel para el logo
            JPanel logoPanel = new JPanel();
            logoPanel.setPreferredSize(new Dimension(50, 50)); // Placeholder size for logo
            logoPanel.setBackground(Color.LIGHT_GRAY);
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridheight = 2;
            userPanel.add(logoPanel, gbc);

            // Nombre del doctor
            JLabel doctorNameLabel = new JLabel("Dr. Juan Pérez");
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.gridheight = 1;
            userPanel.add(doctorNameLabel, gbc);

      
            JLabel doctorSpecialtyLabel = new JLabel("Cardiología");
            gbc.gridx = 1;
            gbc.gridy = 1;
            userPanel.add(doctorSpecialtyLabel, gbc);


            headerPanel.add(userPanel, BorderLayout.EAST);


            add(headerPanel, BorderLayout.NORTH);


            setVisible(true);
        }

        public static void main(String[] args) {
            new DoctorLayout();
        }
    }





