package Hospital.view;

import Hospital.model.Pacientes;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacientesView extends JPanel {
    private ArrayList<Pacientes> listaPacientes;

    public PacientesView(ArrayList<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
        setLayout(new BorderLayout());
            add(panelPaciente(), BorderLayout.CENTER);
    }

    private JPanel panelPaciente() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("PACIENTES DEL DÍA", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        panel.add(titulo, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(listaPacientes.size() + 1, 4, 10, 10)); // (Filas, Columnas, Espaciado Horizontal, Espaciado Vertical)
        gridPanel.setBackground(Color.WHITE);  // Fondo blanco para la tabla

        String[] campos = {"NOMBRE", "FECHA NACIMIENTO", "HORA CITA", "VISITA"};
        for (String campo : campos) {
            JLabel label = new JLabel(campo, JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(Color.BLACK);
            gridPanel.add(label);
        }

        for (Pacientes paciente : listaPacientes) {
            JLabel nombre = new JLabel(paciente.getNombre(), JLabel.CENTER);
            nombre.setFont(new Font("Arial", Font.PLAIN, 12));
            nombre.setForeground(Color.BLACK);
            gridPanel.add(nombre);

            JLabel fechaNacimiento = new JLabel(paciente.getFechaNacimiento(), JLabel.CENTER);
            fechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 12));
            fechaNacimiento.setForeground(Color.BLACK);
            gridPanel.add(fechaNacimiento);

            JLabel horarioCita = new JLabel(String.valueOf(paciente.getHorarioCita()), JLabel.CENTER);
            horarioCita.setFont(new Font("Arial", Font.PLAIN, 12));
            horarioCita.setForeground(Color.BLACK);
            gridPanel.add(horarioCita);

            JLabel visita = new JLabel(paciente.getMotivoCita(), JLabel.CENTER);
            visita.setFont(new Font("Arial", Font.PLAIN, 12));
            visita.setForeground(Color.BLACK);
            gridPanel.add(visita);
        }

        panel.add(gridPanel, BorderLayout.CENTER);

        return panel;
    }
}
