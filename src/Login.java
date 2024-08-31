import personaMedico.DoctorGeneral;
import data.BDdoctores;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Login extends JFrame {

    public Login(){

        // Configuración de la ventana principal
        this.setTitle("ROCKEMMA");
        this.setBounds(0,0,1200,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        // Creación del panel principal con GridLayout
        JPanel mainpanel = new JPanel(new GridLayout(1, 2));


        // Panel para el banner
        JPanel logopanel = new JPanel(new GridBagLayout());

        ImageIcon utlimg = new ImageIcon(getClass().getResource("img/logo2.png"));
        JLabel img = new JLabel();
        img.setIcon(utlimg);
        logopanel.add(img);

        mainpanel.add(logopanel);
        this.add(mainpanel);
        // Panel de login
        JPanel loginpanel = new JPanel(new GridBagLayout());
        loginpanel.setBackground(Color.WHITE);
        mainpanel.add(loginpanel);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5,10,5,10);

        JLabel correo = new JLabel("correo");

        correo.setFont(new Font("Arial", Font.PLAIN, 16));
        loginpanel.add(correo,restricciones); // Se añade la etiqueta al loginpanel

        JTextField user = new JTextField();
        user.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 0;
        restricciones.gridy= 2;
        loginpanel.add(user,restricciones);


        JLabel contrasenna = new JLabel("contraseña");
        contrasenna.setFont(new Font("Arial", Font.PLAIN, 16));
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        loginpanel.add(contrasenna,restricciones);

        JTextField passsword = new JTextField();
        passsword.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 0;
        restricciones.gridy= 4;
        loginpanel.add(passsword,restricciones);

        JButton botonInicio = new JButton("iniciar");
        restricciones.gridx=0;
        restricciones.gridy=5;
        botonInicio.setFont(new Font("Arial", Font.PLAIN, 15));
        botonInicio.setPreferredSize(new Dimension(100,30));
        botonInicio.setBackground(Color.GRAY);
        loginpanel.add(botonInicio, restricciones);

        // direccion del boton

        botonInicio.addActionListener(e -> {
            ArrayList<DoctorGeneral> dataDoctores = BDdoctores.listaDoctores();
            for (DoctorGeneral cadaDoctor : dataDoctores) {


                if (cadaDoctor.getCorreo().equalsIgnoreCase(user.getText())) {
                    if (cadaDoctor.getContraseña().equalsIgnoreCase(passsword.getText())) {
                        DoctorGeneral a = new DoctorGeneral();
                    }
                } else {
                    JLabel error = new JLabel("Error del correo");
                    error.setForeground(Color.RED);
                    loginpanel.add(error);
                }
            }

            loginpanel.revalidate();
            loginpanel.repaint();
        });


        // Hacer visible la ventana
        this.setVisible(true);
    }

}
    