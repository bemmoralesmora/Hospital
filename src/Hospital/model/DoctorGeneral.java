package Hospital.model;

import javax.swing.*;
import java.awt.*;

public class DoctorGeneral extends JFrame {
    public DoctorGeneral() {
        this.setTitle("DOCTOR");
        this.setBounds(0, 0, 1200, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        JPanel panelInicial = new JPanel(new GridLayout(1, 3));
        this.add(panelInicial);

        // Crear y configurar los bloques

        // COLUMNA 1

        JPanel bloque1Panel = new JPanel();
        bloque1Panel.setBackground(Color.WHITE);
        bloque1Panel.setLayout(null);
        panelInicial.add(bloque1Panel);

        JLabel titulo = new JLabel("Hello Doctor");
        titulo.setBounds(10,20,200,20);
        Font fuenteTitulo = new Font("Arial", Font.BOLD, 20);
        titulo.setFont(fuenteTitulo);
        bloque1Panel.add(titulo);

        JLabel parrafo = new JLabel("Te damos la bienvenida doctor a tu interfaz grafica del hospital");
        parrafo.setBounds(10,40,400,20);
        Font fuenteparrafo = new Font("Arial", Font.ITALIC, 15);
        parrafo.setFont(fuenteparrafo);
        bloque1Panel.add(parrafo);

        JPanel notificaciones = new JPanel();
        notificaciones.setBounds(10,80,370,300);
        notificaciones.setBackground(Color.GRAY);
        bloque1Panel.add(notificaciones);

        JPanel calendario = new JPanel();
        calendario.setBounds(10,400,370,200);
        calendario.setBackground(Color.GRAY);
        calendario.setLayout(new GridLayout(7, 7)); // 7 días por semana, 7 filas (1 para los días de la semana, 6 para las fechas)
        bloque1Panel.add(calendario);

        // ESTO SOLO ES DISEÑO TODAVIA NO LO HEMOS VISTO A FONDO PERO LA MAYORIA SI

        // Añadir días de la semana
        String[] diasDeLaSemana = {"Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"};
        for (String dia : diasDeLaSemana) {
            JLabel etiquetaDia = new JLabel(dia, SwingConstants.CENTER);
            etiquetaDia.setForeground(Color.GRAY);
            calendario. add(etiquetaDia);
        }

        // Añadir días del mes
        for (int i = 1; i <= 31; i++) { // Suponiendo un mes de 31 días
            JLabel etiquetaDia = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            etiquetaDia.setForeground(Color.BLACK);
            calendario.add(etiquetaDia);
        }

        // COLUMNA 2

        JPanel bloque2 = new JPanel();
        bloque2.setBackground(Color.GRAY);
        bloque2.setLayout(null);
        panelInicial.add(bloque2);

        JPanel estadisticas = new JPanel();
        estadisticas.setBounds(20,20,360,200);
        estadisticas.setBackground(Color.WHITE);
        bloque2.add(estadisticas);

        JPanel citasProximas = new JPanel();
        citasProximas.setBounds(20,250,360,400);
        citasProximas.setLayout(null);
        citasProximas.setBackground(Color.WHITE);
        bloque2.add(citasProximas);

        String[] citas = {
                "1002 | Ana López | 12/08/2024 | 10:30 AM | Asma | Femenino ",
                "1003 | Carlos Martínez | 13/08/2024 | 02:00 PM | Diabetes Tipo 2 | Masculino ",
                "1004 | Laura Gómez | 14/08/2024 | 11:15 AM | Hipertensión | Femenino |",
                "1005 | Pedro Sánchez | 15/08/2024 | 09:45 AM | Artritis Reumatoide | Masculino |",
                "1006 | María Fernández | 16/08/2024 | 01:30 PM | Migrañas | Femenino |",
                "1007 | Jorge Ruiz | 17/08/2024 | 03:00 PM | Colitis Ulcerosa | Masculino |",
                "1008 | Elena Vargas | 18/08/2024 | 08:30 AM | Enfermedad Pulmonar Crónica | Femenino |"
        };

        JList<String> listaCitas = new JList<>(citas);
        citasProximas.add(listaCitas);

        JLabel titucitas = new JLabel("Citas proximas");
        titucitas.setBounds(120,10,200,30);
        titucitas.setFont(fuenteTitulo);
        citasProximas.add(titucitas);

        JScrollPane scrollCitas = new JScrollPane(listaCitas);
        scrollCitas.setBounds(5,50,350,350);
        citasProximas.add(scrollCitas);

        // COLUMNA 3

        JPanel bloque3 = new JPanel();
        bloque3.setBackground(Color.WHITE);
        bloque3.setLayout(null);
        panelInicial.add(bloque3);

        JPanel perfil = new JPanel();
        perfil.setBounds(20,10,360,400);
        perfil.setBackground(Color.GRAY);
        perfil.setLayout(null);
        bloque3.add(perfil);

        JLabel tituperfil = new JLabel("Perfil");
        tituperfil.setBounds(150,10,100,30);
        tituperfil.setFont(fuenteTitulo);
        perfil.add(tituperfil);

        JPanel imajenperfil = new JPanel();
        imajenperfil.setBounds(120,40,100,100);
        perfil.add(imajenperfil);

        JTextField dato1 = new JTextField();
        dato1.setBounds(80,160,200,30);
        perfil.add(dato1);

        JTextField dato2 = new JTextField();
        dato2.setBounds(20,200,330,150);
        perfil.add(dato2);

        JPanel pacientes = new JPanel();
        pacientes.setBounds(20,420,360,230);
        pacientes.setBackground(Color.GRAY);
        pacientes.setLayout(null);
        bloque3.add(pacientes);

        String[] listapacientes= {"1002 | Ana López | Asma | Femenino | Avenida Principal 456, Ciudad, País | +123456780 | ",
                "1003 | Carlos Martínez | Diabetes Tipo 2 | Masculino | Calle Secundaria 789, Ciudad, País | +123456781 |",
                "1004 | Laura Gómez | Hipertensión | Femenino | Calle Tercera 321, Ciudad, País | +123456782 |",
                "1005 | Pedro Sánchez | Artritis Reumatoide | Masculino | Calle Cuarta 654, Ciudad, País |+123456783 | ",
                "1006 | María Fernández | Migrañas | Femenino | Avenida Secundaria 987, Ciudad, País | +123456784 |",
                "1007 | Jorge Ruiz | Colitis Ulcerosa | Masculino | Calle Quinta 135, Ciudad, País | +123456785 | ",
                "1008 | Elena Vargas | Enfermedad Pulmonar Crónica | Femenino | Avenida Séptima 246, Ciudad, País | +123456786 |"
        };
        JList<String> lista = new JList<>(listapacientes);
        pacientes.add(lista);

        JLabel titupacientes = new JLabel("Lista de pacientes");
        titupacientes.setBounds(110,0,200,30);
        titupacientes.setFont(fuenteTitulo);
        pacientes.add(titupacientes);

        JScrollPane scrollLista = new JScrollPane(lista);
        scrollLista.setBounds(5,30,350,150);
        pacientes.add(scrollLista);

        JButton botonPacientes = new JButton("Buscar");
        botonPacientes.setBounds(5,190,200,30);
        pacientes.add(botonPacientes);


        this.setVisible(true);
    }

    private String nombre;
    private String cargo;
    private int edad;
    private int noLicencia;
    private String correo;
    private String contraseña;

    public DoctorGeneral(String nombre, String cargo, int edad, int noLicencia, String correo,String contraseña) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.noLicencia=noLicencia;
        this.correo = correo;
        this.contraseña=contraseña;
    }

    // METODO GET

    public String getNombre() {
        return this.nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getEdad(){
        return this.edad;
    }

    public int getNoLicencia() {
        return noLicencia;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    // METODO SET

    public void setNombre(String    nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNoLicencia(int noLicencia) {
        this.noLicencia = noLicencia;
    }

    @Override
    public String toString() {
        return "Doctor" + "nombre=" + nombre + "|" + ", Especialidad=" + cargo + "|" + ", edad=" + edad + ",NoLicencia" + noLicencia + "Correo" + correo + "contraseña" + contraseña;
    }
}
