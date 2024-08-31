package data;

import personaMedico.DoctorGeneral;

import java.util.ArrayList;

public class BDdoctores {

    public static ArrayList listaDoctores (){
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Carlos", "Doctor de medicina general", 42, 444444444, "carlos@gmail.com","gatito"));

        return doctores;
    }
}
