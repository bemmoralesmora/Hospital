import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();

        //Crea una ventana y establece tamaños y que se visible
        JFrame miventana = new JFrame("rocky");
        miventana.setSize(800,500);
        miventana.setVisible(true);

        JPanel mainPanel = new JPanel(new GridLayout(1,2));
        mainPanel.setBackground(Color.BLUE);

        miventana.add(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLACK);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.PINK);
        mainPanel.add(panel2);

        mainPanel.add(panel1);

    }
}