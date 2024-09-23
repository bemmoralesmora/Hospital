package Hospital.controller;

import Hospital.view.DoctorView;
import Hospital.view.LoginView;
import backEnde.BackEnde;

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

        HashMap<String, String> resultado = BackEnde.validarDatos(correo, contrasenna);

        if (resultado.containsKey("error")) {
            System.out.println("error: " + resultado.get("error")); // Muestra el mensaje de error
        } else {
            String nombreDoctor = resultado.get("nombre");
            String especialidad = resultado.get("especialidad"); // Corrección aquí

            HashMap<String, String> doctorInfo = new HashMap<>();
            doctorInfo.put("nombre", nombreDoctor);
            doctorInfo.put("especialidad", especialidad);

            new DoctorView(doctorInfo);
        }
    }
}
