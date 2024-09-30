//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
package view;


import model.Paciente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class DoctorLayout extends JFrame {
    private int[] pantalla = new int[]{1300, 800};

    public DoctorLayout() {
        this.setSize(this.pantalla[0], this.pantalla[1]);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(3);
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(this.pantalla[0], 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());
        JLabel hospitalLabel = new JLabel("Nombre del Hospital");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setHorizontalAlignment(2);
        hospitalLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        headerPanel.add(hospitalLabel, "West");
        JPanel userPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = 2;
        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(40, 40));
        logoPanel.setBackground(Color.LIGHT_GRAY);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        userPanel.add(logoPanel, gbc);
        JLabel doctorNameLabel = new JLabel("Dr. Juan Pérez");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        userPanel.add(doctorNameLabel, gbc);
        JLabel doctorSpecialtyLabel = new JLabel("Cardiología");
        gbc.gridx = 1;
        gbc.gridy = 1;
        userPanel.add(doctorSpecialtyLabel, gbc);
        headerPanel.add(userPanel, "East");
        this.add(headerPanel, "North");
        this.add(this.componentesMenuLateral(), "West");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DoctorLayout();
    }

    private JPanel componentesMenuLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, this.pantalla[1]));
        menuPanel.setBackground(Color.darkGray);
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5, 1));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = 2;
        gbc.gridx = 0;
        menu.add(this.op("Consultas del día"), gbc);
        menu.add(this.op("Salas"), gbc);
        menu.add(this.op("Farmacia"), gbc);
        menu.add(this.op("Pacientes registrados"), gbc);
        menu.add(this.op("Cita en otra area"), gbc);
        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener((e) -> {
            System.out.println(texto);
        });
        return op;
    }

    Paciente paciente = new Paciente();
}
