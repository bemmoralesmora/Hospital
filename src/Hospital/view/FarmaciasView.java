package Hospital.view;

import Hospital.model.Medicamentos; // Asegúrate de que este import sea correcto
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FarmaciasView extends JPanel {
    private ArrayList<Medicamentos> listaMedicamentos;

    public FarmaciasView(ArrayList<Medicamentos> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
        setLayout(new BorderLayout());
        add(panelFarmacia(), BorderLayout.CENTER);
    }

    private JPanel panelFarmacia() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("MEDICAMENTOS EN FARMACIA", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        panel.add(titulo, BorderLayout.NORTH);

        // Ordenar la lista de medicamentos por nombre
        Collections.sort(listaMedicamentos, Comparator.comparing(Medicamentos::getNombre));

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(listaMedicamentos.size() + 1, 4, 10, 10)); // (Filas, Columnas, Espaciado Horizontal, Espaciado Vertical)
        gridPanel.setBackground(Color.WHITE);  // Fondo blanco para la tabla

        String[] campos = {"NOMBRE", "FORMA FARMACÉUTICA", "DOSIS", "PRECIO"};
        for (String campo : campos) {
            JLabel label = new JLabel(campo, JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(Color.BLACK);
            gridPanel.add(label);
        }

        for (Medicamentos medicamento : listaMedicamentos) {
            JLabel nombre = new JLabel(medicamento.getNombre(), JLabel.CENTER);
            nombre.setFont(new Font("Arial", Font.PLAIN, 12));
            nombre.setForeground(Color.BLACK);
            gridPanel.add(nombre);

            JLabel formaFarmaceutica = new JLabel(medicamento.getFormaFarmaceutica(), JLabel.CENTER);
            formaFarmaceutica.setFont(new Font("Arial", Font.PLAIN, 12));
            formaFarmaceutica.setForeground(Color.BLACK);
            gridPanel.add(formaFarmaceutica);

            JLabel dosis = new JLabel(medicamento.getDosis(), JLabel.CENTER);
            dosis.setFont(new Font("Arial", Font.PLAIN, 12));
            dosis.setForeground(Color.BLACK);
            gridPanel.add(dosis);

            JLabel precio = new JLabel(String.valueOf(medicamento.getPrecio()), JLabel.CENTER);
            precio.setFont(new Font("Arial", Font.PLAIN, 12));
            precio.setForeground(Color.BLACK);
            gridPanel.add(precio);
        }

        JScrollPane scrollPane = new JScrollPane(gridPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }
}
