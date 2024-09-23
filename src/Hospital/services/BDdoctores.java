package Hospital.services;

import Hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class BDdoctores {

    public static ArrayList listaDoctores (){
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral("Carlos", "Doctor general", 42, 444444444, "carlos@gmail.com", "gatito"));
        doctores.add(new DoctorGeneral("Ana", "Doctora en cardiología", 35, 555555555, "ana@gmail.com", "corazon"));
        doctores.add(new DoctorGeneral("Luis", "Doctor en cirugía ortopédica", 50, 666666666, "luis@gmail.com", "hueso"));
        doctores.add(new DoctorGeneral("Marta", "Doctora en endocrinología", 45, 777777777, "marta@gmail.com", "glando"));
        doctores.add(new DoctorGeneral("Pedro", "Doctor en neumología", 40, 888888888, "pedro@gmail.com", "pulmones"));
        doctores.add(new DoctorGeneral("Laura", "Doctora en dermatología", 38, 999999999, "laura@gmail.com", "piel"));
        doctores.add(new DoctorGeneral("Javier", "Doctor en neurología", 47, 101010101, "javier@gmail.com", "cerebro"));
        doctores.add(new DoctorGeneral("Sofía", "Doctora en ginecología", 39, 202020202, "sofia@gmail.com", "ovarios"));

        return doctores;
    }
}
