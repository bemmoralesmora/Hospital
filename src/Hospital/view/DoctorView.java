package Hospital.view;

import Hospital.model.Pacientes;
import Hospital.model.Salas;
import Hospital.services.BDsalas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    private ArrayList<Pacientes> listaDePacientes;
    private JPanel pacientesPanel;
    private JPanel salasPanel;

    public DoctorView(HashMap<String, String> doctorInfo, ArrayList<Pacientes> Listapacientes) {

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

        // Crear el panel de pacientes

        PacientesView pacientesView = new PacientesView(Listapacientes);
        pacientesPanel = new JPanel(new BorderLayout());
        pacientesPanel.add(pacientesView, BorderLayout.CENTER);

        // Crear el panel de salas

        ArrayList<Salas> listaSalas = BDsalas.listaSalas();
        salasPanel = new SalaView(listaSalas);
        salasPanel.setVisible(false);

        add(ComponenteteMenuLateral(), BorderLayout.WEST);
        add(pacientesPanel, BorderLayout.CENTER);

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

        // Botón para mostrar el panel de salas
        JButton botonSalas = boton("Salas");
        botonSalas.addActionListener(e -> mostrarElPanelSalas()); // Acción del botón

        // Agregar botones al menú
        menu.add(botonSalas, gbc);
        menu.add(boton("Consultas Del Día"), gbc);
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

    private void mostrarElPanelSalas() {
        pacientesPanel.setVisible(false);
        // Verifica si el panel de salas no ha sido agregado al contenedor principal
        if (salasPanel.getParent() == null) {
            add(salasPanel, BorderLayout.CENTER);
        }
        salasPanel.setVisible(true);
        revalidate();
        repaint();
    }
}
