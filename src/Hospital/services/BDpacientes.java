package Hospital.services;

import Hospital.model.Pacientes;

import java.util.ArrayList;

public class BDpacientes {

    public static ArrayList listapacientes(){
        ArrayList<Pacientes> pacientes = new ArrayList<>();
        pacientes.add(new Pacientes(
                "Juan Pérez",
                123456789,
                "15/03/1985",
                39,
                "Masculino",
                "Calle Falsa 123, Ciudad",
                55512345,
                "juan.perez@gmail.com",
                "Diabetes tipo 2",
                "O+",
                "María Pérez",
                55576543,
                "Seguro VidaPlus"
        ));
        return pacientes;
    }
}
