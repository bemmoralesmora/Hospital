package Hospital.controller;

import javax.swing.JOptionPane;
import Hospital.model.Pacientes;
import Hospital.view.DoctorView;
import Hospital.services.BDpacientes;
import Hospital.services.BDdoctores;
import Hospital.model.DoctorGeneral;
import Hospital.view.LoginView;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion() {
        String correo = loginView.getCorreo();
        String contrasenna = loginView.getContrasenna();

        ArrayList<DoctorGeneral> doctores = BDdoctores.listaDoctores();

        for (DoctorGeneral doctor : doctores) {
            if (doctor.getCorreo().equals(correo) && doctor.getContraseña().equals(contrasenna)) {
                HashMap<String, String> doctorInfo = new HashMap<>();
                doctorInfo.put("nombre", doctor.getNombre());
                doctorInfo.put("especialidad", doctor.getCargo());

                ArrayList<Pacientes> listaPacientes = BDpacientes.listapacientes();
                new DoctorView(doctorInfo, listaPacientes);
                loginView.dispose();
                return;
            }
        }

        // Si llegamos aquí, las credenciales son incorrectas
        System.err.println("Error de inicio de sesión: Credenciales incorrectas");
        JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}