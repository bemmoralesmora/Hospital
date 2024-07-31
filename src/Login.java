import javax.swing.*;
import java.awt.*;

public class Login  extends JFrame {

    public Login(){

        //MI VENTANA
        this.setLayout(null);
        this.setBounds(0,0,800,500);

        //CREDENCIALES

        JPanel image = new JPanel();
        image.setBackground(Color.BLUE);
        image.setBounds(0,0,400,500);
        this.add(image);

        JLabel user1 = new JLabel("Usuario");
        user1.setBounds(450, 110, 100,50);
        this.add(user1);

        JTextField user = new JTextField();
        user.setBounds(450,150,300,50);

        JLabel password1 = new JLabel("Contraseña");
        password1.setBounds(450, 195, 100,50);
        this.add(password1);

        JTextField passsword = new JTextField();
        passsword.setBounds(450,230,300,50);

        JButton boton = new JButton("login");
        boton.setBounds(600,290, 150, 50 );

        this.add(boton);
        this.setVisible(true);

        this.add(user);
        this.setVisible(true);

        this.add(passsword);
        this.setVisible(true);
    }
}


