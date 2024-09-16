package Hospital.controller;

import Hospital.view.LoginView;
import backEnde.BackEnde;  // Asegúrate de que este import es correcto

import java.util.HashMap;

public class LoginController {
    private LoginView Loginview;

    public LoginController(LoginView loginview){
        this.Loginview = loginview;
        this.Loginview.addLoginListener(e -> validarMisDatos());
    }


    public void validarMisDatos(){

        String correo = Loginview.getCorreo();
        String contrasenna = Loginview.getContrasenna();

        HashMap<String, String> resultado = BackEnde.validarDatos(correo, contrasenna);

        for (String key : resultado.keySet()){
            System.out.println(key + " :" + resultado.get(key));  // Cambiado a get(key)
        }
    }
}
