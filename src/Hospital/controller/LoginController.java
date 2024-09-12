package Hospital.controller;

import Hospital.view.LoginView;

public class LoginController {
    private LoginView Loginview;
    public LoginController(LoginView loginview){
        this.Loginview = loginview;
        this.Loginview.addLoginListener(e -> controLogin());
    }

    public void controLogin (){
        System.out.println("Hola login");
    }

    public void validadDatos(){
        String u = Loginview.getCorreo();
        String p = Loginview.getContrasenna();
    }
}
