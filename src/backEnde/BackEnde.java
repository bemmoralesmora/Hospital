// En BackEnde.java
package backEnde;

import Hospital.model.DoctorGeneral;
import Hospital.services.BDdoctores;

import java.util.ArrayList;
import java.util.HashMap;

public class BackEnde {
    public static HashMap<String, String> validarDatos(String usuario, String contraseña) {

        HashMap<String, String> resultado = new HashMap<>();

        ArrayList<DoctorGeneral> doctores = BDdoctores.listaDoctores();

        for (DoctorGeneral doctor : doctores) {
            if (doctor.getCorreo().equals(usuario) && doctor.getContraseña().equals(contraseña)) {

                // Si los datos coinciden, retornamos la información del usuario en el HashMap
                resultado.put("nombre", doctor.getNombre());
                resultado.put("especialidad", doctor.getCargo());
                resultado.put("Edad", String.valueOf(doctor.getEdad()));
                resultado.put("NoLicencia", String.valueOf(doctor.getNoLicencia()));
                resultado.put("Correo", doctor.getCorreo());
                return resultado;
            }
        }

        // Si no se encuentra el usuario, retornamos un error
        resultado.put("Error", "Usuario o contraseña incorrectos");
        return resultado;
    }
}
