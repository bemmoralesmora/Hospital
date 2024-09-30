package Hospital.view;

import Hospital.model.Pacientes;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    //Atributo privado ArrayList de tipo Pacientes
    private ArrayList<Pacientes> listaDePacientes;

    public DoctorView(HashMap<String, String> doctorInfo, ArrayList<Pacientes> Listapacientes) {

        //Asignar la lista de pacientes al atributo de la clase
        this.listaDePacientes = Listapacientes;
        this.setSize(pantalla[0], pantalla[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Perfil del Doctor");
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);


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

        // Panel para el logo
        JPanel logoPanel = new JPanel();
        Dimension logoSize = new Dimension(40, 40);
        logoPanel.setPreferredSize(logoSize);
        logoPanel.setMinimumSize(logoSize);
        logoPanel.setBackground(Color.YELLOW);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        userPanel.add(logoPanel, restricciones);

        String nombreDoctor = doctorInfo.get("nombre");
        String especialidad = doctorInfo.get("especialidad");

        // Nombre del doctor
        JLabel doctorNameLabel = new JLabel(nombreDoctor);
        doctorNameLabel.setForeground(Color.WHITE);
        doctorNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        userPanel.add(doctorNameLabel, restricciones);

        // Especialidad del doctor
        JLabel doctorSpecialidad = new JLabel(especialidad);
        doctorSpecialidad.setForeground(Color.LIGHT_GRAY);
        doctorSpecialidad.setFont(new Font("Arial", Font.PLAIN, 14));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        userPanel.add(doctorSpecialidad, restricciones);

        headerPanel.add(userPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);
        add(ComponenteteMenuLateral(), BorderLayout.WEST);

        //Agregar el panel de pacientes en el centro de la ventana
        PacientesView pacientesView = new PacientesView(listaDePacientes);
        add(pacientesView, BorderLayout.CENTER);

        // Hacer visible la ventana
        this.setVisible(true);
    }

    private JPanel ComponenteteMenuLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantalla[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5, 1));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        menu.add(boton("Consultas Del Día"), gbc);
        menu.add(boton("Salas"), gbc);
        menu.add(boton("Farmacia"), gbc);
        menu.add(boton("Pacientes registrados"), gbc);
        menu.add(boton("Citar en otra area"), gbc);

        menuPanel.add(menu, gbc);
        return menuPanel;
    }

    private JButton boton(String texto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> {
            System.out.println(texto);
        });
        return boton;
    }
}
