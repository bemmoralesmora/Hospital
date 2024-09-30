package Hospital.view;

import Hospital.model.Salas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SalaView extends JPanel {
    private ArrayList<Salas> listaSalas;

    public SalaView(ArrayList<Salas> listaSalas) {
        this.listaSalas = listaSalas;
        setLayout(new GridLayout(3, 4, 10, 10));

        for (Salas sala : listaSalas) {
            add(crearElPanelSala(sala.getNombre(), sala.getEstado()));
        }
    }

    private JPanel crearElPanelSala(String nombre, String estado) {
        JPanel panelSala = new JPanel();
        panelSala.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panelSala.setLayout(new BorderLayout());

        JLabel nombreSala = new JLabel(nombre);
        nombreSala.setHorizontalAlignment(SwingConstants.CENTER);
        nombreSala.setFont(new Font("Arial", Font.BOLD, 16));

        switch (estado) {
            case "En uso":
                panelSala.setBackground(new Color(255, 153, 153));
                break;
            case "fuera de servicio":
                panelSala.setBackground(new Color(255, 255, 153));
                break;
            case "Disponible":
                panelSala.setBackground(new Color(153, 255, 153));
                break;
            default:
                panelSala.setBackground(Color.WHITE);
                break;
        }

        panelSala.add(nombreSala, BorderLayout.CENTER);
        return panelSala;
    }
}
