import Hospital.controller.LoginController;
import Hospital.view.DoctorView;
import Hospital.view.LoginView;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        LoginView login = new LoginView();
        LoginController controlLogin = new LoginController(login);
    }
}