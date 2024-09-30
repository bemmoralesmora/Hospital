package Hospital.services;

import Hospital.model.Salas;

import java.util.ArrayList;

public class BDsalas {
    public static ArrayList<Salas> listaSalas() {
        ArrayList<Salas> salas = new ArrayList<>();
        salas.add(new Salas("Sala de Emergencias", "En uso"));
        salas.add(new Salas("Sala de Maternidad", "Disponible"));
        salas.add(new Salas("Sala de Cirugía 1", "En uso"));
        salas.add(new Salas("Sala de Cirugía 2", "Fuera de servicio"));
        salas.add(new Salas("Sala de Pediatría", "Disponible"));
        salas.add(new Salas("Sala de Cuidados Intensivos", "En uso"));
        salas.add(new Salas("Sala de Quimioterapia", "Fuera de servicio"));
        salas.add(new Salas("Sala de Radiología", "Disponible"));
        salas.add(new Salas("Sala de Oncología", "En uso"));
        salas.add(new Salas("Sala de Consulta Externa", "Disponible"));
        salas.add(new Salas("Sala de Rehabilitación", "En uso"));
        salas.add(new Salas("Sala de Hemodiálisis", "Fuera de servicio"));

        return salas;
    }
}
