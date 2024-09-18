package Hospital.view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView() {
        this.setSize(pantalla[0], pantalla[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Perfil del doctor");
        this.setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel nombreHospital = new JLabel("Hospital Santa Catalina");
        nombreHospital.setForeground(Color.WHITE);
        nombreHospital.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(nombreHospital, BorderLayout.WEST);

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setPreferredSize(new Dimension(200, 60));
        userPanel.setBackground(Color.DARK_GRAY);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(5, 5, 5, 5);

        // Panel para el logo,
        JPanel logoPanel = new JPanel();
        Dimension logoSize = new Dimension(40, 40);
        logoPanel.setPreferredSize(logoSize);
        logoPanel.setMinimumSize(logoSize);
        logoPanel.setBackground(Color.YELLOW);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        userPanel.add(logoPanel, restricciones);

        // Nombre del doctor
        JLabel doctorNameLabel = new JLabel("Brian Morales");
        doctorNameLabel.setForeground(Color.WHITE);
        doctorNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        userPanel.add(doctorNameLabel, restricciones);

        // Especialidad del doctor
        JLabel doctorSpecialidad = new JLabel("Doctor General");
        doctorSpecialidad.setForeground(Color.LIGHT_GRAY);
        doctorSpecialidad.setFont(new Font("Arial", Font.PLAIN, 14));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        userPanel.add(doctorSpecialidad, restricciones);

        headerPanel.add(userPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);

        // Hacer visible la ventana
        this.setVisible(true);
    }

}
